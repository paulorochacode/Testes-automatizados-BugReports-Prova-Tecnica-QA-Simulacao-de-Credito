package Simulacoes.Create;

import Restricoes.CPFsComRestricoesTest;
import Simulacoes.Create.CreateObrigatoriedadeTest;
import br.com.sicredi.simulacao.entity.Simulacao;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;


public class CreateTest {
        static class vars{
            static String[] cpfs ={
                    "\"57862379462\"",
                    "\"847.239.746-28\"",
                    "\"74923874949\"",
                    "\"59438759405\"",
                    "\"49584375899\"",
                    "\"89374928749\"",
                    "\"29340923840\"",
                    "\"94208394002\"",
                    "\"39284924892\"",
                    "\"32897489249\"",
                    "\"34672897364\"",
                    "\"34762378387\"",
                    "\"49729078407\"",
                    "\"86487327432\"",
                    "\"47189273981\"",
                    "\"48917298303\""};
            }
        static class vars2 {
            static String[] emailsNValidos = {
                    "\"ejrgioejrgie.com\"",
                    "\"@.com\"",
                    "\"www.ejrgioejr.com\""};
        }
        @BeforeClass
        public static void setup() {
            RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
            baseURI = "http://localhost";
            port = 8080;
            basePath = "/api/";
        }

        @Test
        public void test1CriandoSimulacaoDeveRetornarStatusCode201() {
            //buga nr, não retorna
            given()
                .body("{\n" +
                        "\"nome\": \"Colaborador Sicredi\",\n" +
                        "\"email\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.cpfs[0] + ",\n" +
                        "\"valor\": 38000,\n" +
                        "\"parcelas\": 3,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
            .when()
                .post("v1/simulacoes")
            .then()
                //.log().all();
                .statusCode(201)
                .body(containsString("Simulação criada com sucesso"));
        }

        @Test
        public void test2CriandoSimulacaoDeveRetornarStatusCode400() {
            //bug r, cpf formato inválido
            given()
                .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.cpfs[1] + ",\n" +
                    "\"valor\": 38000,\n" +
                    "\"parcelas\": 3,\n" +
                    "\"seguro\": true\n" +
                    "}")
                .contentType(ContentType.JSON)
            .when()
                .post("v1/simulacoes")
            .then()
                .log().all()
                .statusCode(400);
        }

        @Test
        public void test3CriandoSimulacaoDeveRetornarStatusCode400() {
            //bug r, bug em regra de negócio campo valor
            given()
                    .body("{\n" +
                            "\"nome\": \"Colaborador Sicredi\",\n" +
                            "\"email\": \"fulano@gmail.com\",\n" +
                            "\"cpf\":" + vars.cpfs[2] +",\n" +
                            "\"valor\": 700,\n" +
                            "\"parcelas\": 3,\n" +
                            "\"seguro\": true\n" +
                            "}")
                    .contentType(ContentType.JSON)
                    .when()
                    .post("v1/simulacoes")
                    .then()
                    .log().all()
                    .statusCode(400);
        }
        @Test
        public void test4CriandoSimulacaoDeveRetornarStatusCode400() {
            given()
                    .body("{\n" +
                            "\"nome\": \"\",\n" +
                            "\"email\": \"fulano@gmail.com\",\n" +
                            "\"cpf\":" + vars.cpfs[3] + ",\n" +
                            "\"valor\": 40002,\n" +
                            "\"parcelas\": 3,\n" +
                            "\"seguro\": true\n" +
                            "}")
                    .contentType(ContentType.JSON)
                    .when()
                    .post("v1/simulacoes")
                    .then()
                    //.log().all()
                    .content(containsString("Valor deve ser menor ou igual a R$ 40.000"))
                    .statusCode(400);
        }
        @Test
        public void test5CriandoSimulacaoDeveRetornarStatusCode400() {
            given()
                .body("{\n" +
                        "\"nome\": \"gulherme fonseca\",\n" +
                        "\"email\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.cpfs[4] + ",\n" +
                        "\"valor\": 38000,\n" +
                        "\"parcelas\": 1,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
            .when()
                .post("v1/simulacoes")
            .then()
                //.log().all()
                .body(containsString("Parcelas deve ser igual ou maior que 2"))
                .statusCode(400);
        }
        @Test
        public void test6CriandoSimulacaoDeveRetornarStatusCode400() {
            //bug nr, em regra de negócio campo numero de parcela
            given()
                .body("{\n" +
                        "\"nome\": \"Augusto Sousa\",\n" +
                        "\"email\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.cpfs[5] + ",\n" +
                        "\"valor\": 38000,\n" +
                        "\"parcelas\": 49,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
            .when()
                .post("v1/simulacoes")
            .then()
                //.log().all();
                .statusCode(400);
        }
        @Test
        public void test7CriandoSimulacaoDeveRetornarStatusCode400() {
            given()
            .body("{\n" +
                    "\"nome\": \"Joao da Silva\",\n" +
                    "\"email\":" + vars2.emailsNValidos[2] + ",\n" +
                    "\"cpf\":" + vars.cpfs[6] + ",\n" +
                    "\"valor\": 38000,\n" +
                    "\"parcelas\": 3,\n" +
                    "\"seguro\": true\n" +
                    "}")
                .contentType(ContentType.JSON)
            .when()
                .post("v1/simulacoes")
            .then()
                //.body(containsString("E-mail deve ser um e-mail válido"))
                //.log().all()
                .statusCode(400);
        }
        @Test
        public void test9CriandoSimulacaoDeveRetornarStatusCode201() {
            given()
                .body("{\n" +
                        "\"nome\": \"\",\n" +
                        "\"email\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.cpfs[8] + ",\n" +
                        "\"valor\": 38000,\n" +
                        "\"parcelas\": 3,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
            .when()
                .post("v1/simulacoes")
            .then()
                //.log().all();
                .statusCode(201);
        }

        @Test
        public void test10CriandoSimulacaoDeveRetornarStatusCode400() {
        //bug nr, bug em campo nome sendo aceito com numeros e simbolos
            given()
                .body("{\n" +
                            "\"nome\": \"123456#$%&*\",\n" +
                            "\"email\": \"fulano@gmail.com\",\n" +
                            "\"cpf\": 99955566644,\n" +
                            "\"valor\": 24000,\n" +
                            "\"parcelas\": 34,\n" +
                            "\"seguro\": false\n" +
                            "}")
                .contentType(ContentType.JSON)
            .when()
                .post("v1/simulacoes")
            .then()
                //.log().all();
                .statusCode(400);
        }

        @Test
        public void test11CriandoSimulacaoDeveRetornarStatusCode400() {
            given()
                    .body("{\n" +
                            "\"nome\": \"fulano perereira\",\n" +
                            "\"email\": \"fulano@gmail.com\",\n" +
                            "\"cpf\": 99955566644,\n" +
                            "\"valor\": abcd$%,\n" +
                            "\"parcelas\": 34,\n" +
                            "\"seguro\": false\n" +
                            "}")
                    .contentType(ContentType.JSON)
                    .when()
                    .post("v1/simulacoes")
                    .then()
                    //.log().all();
                    .statusCode(400);
        }

        @Test
        public void test12CriandoSimulacaoDeveRetornarStatusCode400() {
            given()
                    .body("{\n" +
                            "\"nome\": \"fulano perereira\",\n" +
                            "\"email\": \"fulano@gmail.com\",\n" +
                            "\"cpf\": 99955566644,\n" +
                            "\"valor\": 24000,\n" +
                            "\"parcelas\": abcd@#%¨,\n" +
                            "\"seguro\": true\n" +
                            "}")
                    .contentType(ContentType.JSON)
                    .when()
                    .post("v1/simulacoes")
                    .then()
                    //.log().all();
                    .statusCode(400);
        }

        @Test
        public void test13CriandoSimulacaoDeveRetornarStatusCode400() {
            given()
                    .body("{\n" +
                            "\"nome\": \"fulano perereira\",\n" +
                            "\"email\": \"fulano@gmail.com\",\n" +
                            "\"cpf\": 99955566644,\n" +
                            "\"valor\": 24000,\n" +
                            "\"parcelas\": abcd@#%¨,\n" +
                            "\"seguro\": abcd\n" +
                            "}")
                    .contentType(ContentType.JSON)
                    .when()
                    .post("v1/simulacoes")
                    .then()
                    //.log().all();
                    .statusCode(400);
        }
        @Test
        public void test14CriandoSimulacaoDeveRetornarStatusCode400() {
            given()
                    .body("{\n" +
                            "\"nome\": \"fulano perereira\",\n" +
                            "\"email\": \"fulano@gmail.com\",\n" +
                            "\"cpf\": 99955566644,\n" +
                            "\"valor\": 24000,\n" +
                            "\"parcelas\": abcd@#%¨,\n" +
                            "\"seguro\": 12345\n" +
                            "}")
                    .contentType(ContentType.JSON)
                    .when()
                    .post("v1/simulacoes")
                    .then()
                    //.log().all();
                    .statusCode(400);
        }

        @Test
        public void test15CriandoSimulacaoDeveRetornarStatusCode400() {
            given()
                .body("{\n" +
                        "\"nome\": \"Colaborador Sicredi\",\n" +
                        "\"email\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.cpfs[0] + ",\n" +
                        "\"valor\": 38000,\n" +
                        "\"parcelas\": 3,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
            .when()
                .post("v1/simulacoes")
            .then()
                //.log().all();
                .statusCode(400)
                .body(containsString("CPF duplicado"));
        }

}

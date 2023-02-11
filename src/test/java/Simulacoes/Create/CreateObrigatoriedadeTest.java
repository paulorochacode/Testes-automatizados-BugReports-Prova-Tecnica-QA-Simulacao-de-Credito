package Simulacoes.Create;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class CreateObrigatoriedadeTest {

    static class vars{
        static String[] cpfs ={
                "57862379462",
                "84723974628",
                "74923874949",
                "59438759405",
                "49584375899",
                "89374928749",
                "29340923840",
                "94208394002",
                "39284924892",
                "32897489249",
                "34672897364",
                "34762378387",
                "49729078407",
                "86487327432",
                "47189273981",
                "48917298303"};
        }
    @BeforeClass
    public static void setup() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        baseURI = "http://localhost";
        port = 8080;
        basePath = "/api/";
    }

    @Test
    public void test1CriandoSimulacaoDeveRetornarStatusCode400() {
        //bug nr simulação sendo criada sem nome
        given()
                .body("{\n" +
                        "\"nome\": \"\",\n" +
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
                .statusCode(400);
    }

    @Test
    public void test2CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
                .body("{\n" +
                        "\"nome\": \"Colaborador Sicredi\",\n" +
                        "\"email\": \"\",\n" +
                        "\"cpf\":" + vars.cpfs[1] + ",\n" +
                        "\"valor\": 38000,\n" +
                        "\"parcelas\": 3,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("v1/simulacoes")
                .then()
                .statusCode(400);
    }

    @Test
    public void test3CriandoSimulacaoDeveRetornarStatusCode400() {
        // bug nr, simulação sendo criada sem cpf
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\": \"\",\n" +
                    "\"valor\": 38000,\n" +
                    "\"parcelas\": 3,\n" +
                    "\"seguro\": true\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .post("v1/simulacoes")
        .then()
            .statusCode(400);
    }
    @Test
    public void test4CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
                .body("{\n" +
                        "\"nome\": \"Colaborador Sicredi\",\n" +
                        "\"email\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.cpfs[2] + ",\n" +
                        "\"valor\": ,\n" +
                        "\"parcelas\": 3,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("v1/simulacoes")
                .then()
                .statusCode(400);
    }
    @Test
    public void test5CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
                .body("{\n" +
                        "\"nome\": \"Colaborador Sicredi\",\n" +
                        "\"email\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.cpfs[3] + ",\n" +
                        "\"valor\": 38000,\n" +
                        "\"parcelas\": ,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("v1/simulacoes")
                .then()
                .statusCode(400);
    }
    @Test
    public void test6CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
                .body("{\n" +
                        "\"nome\": \"Colaborador Sicredi\",\n" +
                        "\"email\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.cpfs[4] + ",\n" +
                        "\"valor\": 38000,\n" +
                        "\"parcelas\": 3,\n" +
                        "\"seguro\": \n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("v1/simulacoes")
                .then()
                .statusCode(400);
    }
    @Test
    public void test7CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
                .body("{\n" +
                        "\"\": \"Colaborador Sicredi\",\n" +
                        "\"email\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.cpfs[5] + ",\n" +
                        "\"valor\": 38000,\n" +
                        "\"parcelas\": 3,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("v1/simulacoes")
                .then()
                .statusCode(400);
    }
    @Test
    public void test8CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
                .body("{\n" +
                        "\"nome\": \"Colaborador Sicredi\",\n" +
                        "\"\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.cpfs[6] + ",\n" +
                        "\"valor\": 38000,\n" +
                        "\"parcelas\": 3,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("v1/simulacoes")
                .then()
                .statusCode(400);
    }
    @Test
    public void test9CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"\":" + vars.cpfs[7] + ",\n" +
                    "\"valor\": 38000,\n" +
                    "\"parcelas\": 3,\n" +
                    "\"seguro\": true\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .post("v1/simulacoes")
        .then()
            .statusCode(400);
    }
    @Test
    public void test10CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
                .body("{\n" +
                        "\"nome\": \"Colaborador Sicredi\",\n" +
                        "\"email\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.cpfs[8] + ",\n" +
                        "\"\": 38000,\n" +
                        "\"parcelas\": 3,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("v1/simulacoes")
                .then()
                .statusCode(400);
    }
    @Test
    public void test11CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
                .body("{\n" +
                        "\"nome\": \"Colaborador Sicredi\",\n" +
                        "\"email\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.cpfs[9] + ",\n" +
                        "\"valor\": 38000,\n" +
                        "\"\": 3,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("v1/simulacoes")
                .then()
                .statusCode(400);
    }
    @Test
    public void test12CriandoSimulacaoDeveRetornarStatusCode400() {
        //bug nr resposta 500 inves de 400
        given()
                .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.cpfs[10] + ",\n" +
                    "\"valor\": 38000,\n" +
                    "\"parcelas\": 3,\n" +
                    "\"\": true\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .post("v1/simulacoes")
        .then()
            .statusCode(400);
    }
    @Test
    public void test13CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
                .body("{\n" +

                        "\"email\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.cpfs[11] + ",\n" +
                        "\"valor\": 38000,\n" +
                        "\"parcelas\": 3,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("v1/simulacoes")
                .then()
                .statusCode(400);
    }
    @Test
    public void test14CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
                .body("{\n" +
                        "\"nome\": \"Colaborador Sicredi\",\n" +

                        "\"cpf\":" + vars.cpfs[12] + ",\n" +
                        "\"valor\": 38000,\n" +
                        "\"parcelas\": 3,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("v1/simulacoes")
                .then()
                .statusCode(400);
    }
    @Test
    public void test15CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
                .body("{\n" +
                        "\"nome\": \"Colaborador Sicredi\",\n" +
                        "\"email\": \"fulano@gmail.com\",\n" +

                        "\"valor\": 38000,\n" +
                        "\"parcelas\": 3,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("v1/simulacoes")
                .then()
                .statusCode(400);
    }
    @Test
    public void test16CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
                .body("{\n" +
                        "\"nome\": \"Colaborador Sicredi\",\n" +
                        "\"email\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.cpfs[13] + ",\n" +

                        "\"parcelas\": 3,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("v1/simulacoes")
                .then()
                .statusCode(400);
    }
    @Test
    public void test17CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
                .body("{\n" +
                        "\"nome\": \"Colaborador Sicredi\",\n" +
                        "\"email\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.cpfs[14] + ",\n" +
                        "\"valor\": 38000,\n" +

                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("v1/simulacoes")
                .then()
                .statusCode(400);
    }
    @Test
    public void test18CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
                .body("{\n" +
                        "\"nome\": \"Colaborador Sicredi\",\n" +
                        "\"email\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.cpfs[15] + ",\n" +
                        "\"valor\": 38000,\n" +
                        "\"parcelas\": 3,\n" +

                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("v1/simulacoes")
                .then()
                .statusCode(400);
    }
}
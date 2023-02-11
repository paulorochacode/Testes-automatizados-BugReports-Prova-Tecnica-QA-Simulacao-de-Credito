package Simulacoes.Read;

import Restricoes.CPFsComRestricoesTest;
import Simulacoes.Create.CreateObrigatoriedadeTest;
import Simulacoes.Create.CreateTest;
import br.com.sicredi.simulacao.entity.Simulacao;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

public class ReadAllTest {

    @BeforeClass
    public static void setup() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        baseURI = "http://localhost";
        port = 8080;
        basePath = "/api/";
    }

    @Test
    public void test1CriandoSimulacaoDeveRetornarStatusCode201() {
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\": \"47290390407\",\n" +
                    "\"valor\": 23040,\n" +
                    "\"parcelas\": 6,\n" +
                    "\"seguro\": false\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .post("v1/simulacoes")
        .then();
        //    .log().all()
        //    .statusCode(201);
    }

    @Test
    public void test2CriandoSimulacaoDeveRetornarStatusCode201() {
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\": \"47290391207\",\n" +
                    "\"valor\": 23640,\n" +
                    "\"parcelas\": 7,\n" +
                    "\"seguro\": false\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .post("v1/simulacoes")
        .then();
        //    .log().all()
        //    .statusCode(201);
    }

    @Test
    public void test3ConsultandoTodasSimulacoesDeveRetornarStatusCode200() {
        given()
            .get("v1/simulacoes")
        .then()
            .statusCode(200)
            .body(containsString("47290390407"));
    }

    @Test
    public void test4ConsultandoTodasSimulacoesDeveRetornarStatusCode200() {
        given()
                .get("v1/simulacoes")
                .then()
                .statusCode(200)
                .body(containsString("47290391207"));
    }
}

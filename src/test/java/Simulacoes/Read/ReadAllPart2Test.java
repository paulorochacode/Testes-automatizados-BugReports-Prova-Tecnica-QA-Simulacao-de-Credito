package Simulacoes.Read;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.core.StringContains.containsString;

public class ReadAllPart2Test {

    @BeforeClass
    public static void setup() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        baseURI = "http://localhost";
        port = 8080;
        basePath = "/api/";
    }
    @Test
    public void test4ConsultandoTodasSimulacoesDeveRetornarStatusCode200() {
        given()
            .get("v1/simulacoes")
        .then()
            .statusCode(200)
            .body(containsString("47290390407"));
    }

    @Test
    public void test5ConsultandoTodasSimulacoesDeveRetornarStatusCode200() {
        given()
                .get("v1/simulacoes")
                .then()
                .statusCode(200)
                .body(containsString("47290391207"));
    }
}

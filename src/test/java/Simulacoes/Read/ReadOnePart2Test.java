package Simulacoes.Read;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.basePath;
import static org.hamcrest.core.StringContains.containsString;

public class ReadOnePart2Test {

    @BeforeClass
    public static void setup() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        baseURI = "http://localhost";
        port = 8080;
        basePath = "/api/";
    }
    @Test
    public void test2ConsultandoUmaSimulacoesDeveRetornarStatusCode200() {
        given()
                .get("v1/simulacoes")
                .then()
                .statusCode(200)
                .body(containsString("46490391207"));
    }
}

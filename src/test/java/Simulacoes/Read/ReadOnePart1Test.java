package Simulacoes.Read;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.core.StringContains.containsString;

public class ReadOnePart1Test {

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
                        "\"cpf\": \"46490391207\",\n" +
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
}

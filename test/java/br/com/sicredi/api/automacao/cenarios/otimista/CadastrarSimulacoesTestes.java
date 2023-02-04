package br.com.sicredi.api.automacao.cenarios.otimista;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.core.StringContains.containsString;

public class CadastrarSimulacoesTestes {

    @BeforeClass
    public static void setup() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        baseURI = "http://localhost";
        port = 8080;
        basePath = "/api/";
    }
    @Test
    public void testCriandoSimulacaoDeveRetornarStatusCode201(){
        given()
                .body("{\n" +
                        "\"nome\": \"Colaborador Sicredi\",\n" +
                        "\"email\": \"fulano@gmail.com\",\n" +
                        "\"cpf\": \"970802753\",\n" +
                        "\"valor\": 38000,\n" +
                        "\"parcelas\": 3,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                    .post("v1/simulacoes")
                .then()
                    .statusCode(201);
    }

}

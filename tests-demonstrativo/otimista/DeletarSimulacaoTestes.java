package br.com.sicredi.api.automacao.cenarios.otimista;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

public class DeletarSimulacaoTestes {

    @BeforeClass
    public static void setup() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        baseURI = "http://localhost";
        port = 8080;
        basePath = "/api/";
    }
    @Test
    public void testDeletandoUmaSimulacaoDeveRetornarStatusCode201(){
        given()
                .delete("v1/simulacoes/12")
        .then()
                .statusCode(200);
    }

}

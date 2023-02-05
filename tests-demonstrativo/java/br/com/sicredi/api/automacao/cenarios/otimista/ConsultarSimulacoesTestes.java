package br.com.sicredi.api.automacao.cenarios.otimista;

import br.com.sicredi.api.automacao.cenarios.BaseTeste;
import io.restassured.RestAssured;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class ConsultarSimulacoesTestes extends BaseTeste {

        @BeforeClass
        public static void setup() {
            RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
            baseURI = "http://localhost";
            port = 8080;
            basePath = "/api/";
        }
        @Test
        public void testConsultarTodasSimulacoesComSucessoDeveRetornarStatusCode200() {
            given()
                .get("v1/simulacoes/")
            .then()
            .statusCode(200);
            }
}
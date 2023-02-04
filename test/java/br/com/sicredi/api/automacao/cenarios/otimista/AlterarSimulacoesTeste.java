package br.com.sicredi.api.automacao.cenarios.otimista;

import br.com.sicredi.api.automacao.cenarios.BaseTeste;
import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.core.StringContains.containsString;

public class AlterarSimulacoesTeste {

        @BeforeClass
        public static void setup() {
            RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
            baseURI = "http://localhost";
            port = 8080;
            basePath = "/api/";
        }

        @Test
        public void testConsultarRestricaoCPF0DeveRetornarStatusCode200() {
            given()
            .get("v1/restricoes/"+vars.getCpfRestrito(0))
            .then()
            .statusCode(200)
            //.log().all();
            .body("mensagem", containsString("O CPF "+ vars.getCpfRestrito(0) + " tem problema"));
        }
}

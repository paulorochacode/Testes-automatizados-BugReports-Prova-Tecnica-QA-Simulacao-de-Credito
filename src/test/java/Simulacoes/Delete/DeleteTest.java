package Simulacoes.Delete;

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
public class DeleteTest {

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
                    "\"cpf\": \"49729078407\",\n" +
                    "\"valor\": 38000,\n" +
                    "\"parcelas\": 3,\n" +
                    "\"seguro\": true\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .post("v1/simulacoes")
        .then()
            .log().all()
            .statusCode(201)
            .body(containsString("37"));
    }

    @Test
    public void testDELETE1SimulacoesDeveRetornar200(){
        given()
        .when()
            .delete("v1/simulacoes/37")
        .then()
            .log().all()
            .statusCode(200)
            .body(containsString("OK"));
    }
}

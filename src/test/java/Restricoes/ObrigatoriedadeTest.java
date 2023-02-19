package Restricoes;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.core.StringContains.containsString;

public class ObrigatoriedadeTest {
    
    static class vars{
        static String[] cpf ={""};
    }
    class EndPoints{
        final String CONSULTAR_RESTRICOES_ENDPOINT = "/v1/restricoes/";
    }
    @BeforeClass
    public static void setup() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        baseURI = "http://localhost";
        port = 8080;
        basePath = "/api/";
    }

    @Test
    public void testConsultarRestricaoCPF0DeveRetornarStatusCode404() {
        given()
                .get("v1/restricoes/"+ vars.cpf[0] )
                .then()
                .statusCode(404)
                .log().all()
                .body("error",containsString("Not Found"));
    }

}

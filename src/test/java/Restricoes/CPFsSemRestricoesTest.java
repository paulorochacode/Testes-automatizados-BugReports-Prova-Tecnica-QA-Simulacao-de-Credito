package Restricoes;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class CPFsSemRestricoesTest {
    static class vars{
        static String[] cpfs ={
                "57862379462",
                "84723974628",
                "74923874949",
                "59438759405",
                "49584375899",
                "89374928749",
                "29340923840",
                "94208394002",
                "39284924892",
                "32897489249"};
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
    public void testConsultarRestricaoCPF0DeveRetornarStatusCode204() {
        given()
                .get("v1/restricoes/"+ vars.cpfs[0] )
                .then()
                .statusCode(204);
                //.log().all();
    }

    @Test
    public void testConsultarRestricaoCPF1DeveRetornarStatusCode204() {
        given()
                .get("v1/restricoes/"+ vars.cpfs[1])
                .then()
                .statusCode(204);
                //.log().all();
    }

    @Test
    public void testConsultarRestricaoCPF2DeveRetornarStatusCode204() {
        given()
                .get("v1/restricoes/"+ vars.cpfs[2])
                .then()
                .statusCode(204);
                //.log().all();
    }

    @Test
    public void testConsultarRestricaoCPF3DeveRetornarStatusCode204() {
        given()
                .get("v1/restricoes/"+ vars.cpfs[3])
                .then()
                .statusCode(204);
                //.log().all();
    }

    @Test
    public void testConsultarRestricaoCPF4DeveRetornarStatusCode204() {
        given()
                .get("v1/restricoes/"+ vars.cpfs[4])
                .then()
                .statusCode(204);
                //.log().all();
    }

    @Test
    public void testConsultarRestricaoCPF5DeveRetornarStatusCode204() {
        given()
                .get("v1/restricoes/"+ vars.cpfs[5])
                .then()
                .statusCode(204);
                //.log().all();

    }

    @Test
    public void testConsultarRestricaoCPF6DeveRetornarStatusCode204() {
        given()
                .get("v1/restricoes/"+ vars.cpfs[6])
                .then()
                .statusCode(204);
                //.log().all();
    }

    @Test
    public void testConsultarRestricaoCPF7DeveRetornarStatusCode204() {
        given()
                .get("v1/restricoes/"+ vars.cpfs[7])
                .then()
                .statusCode(204);
                //.log().all();
    }

    @Test
    public void testConsultarRestricaoCPF8DeveRetornarStatusCode204() {
        given()
                .get("v1/restricoes/"+ vars.cpfs[8])
                .then()
                .statusCode(204);
                //.log().all();
    }

    @Test
    public void testConsultarRestricaoCPF9DeveRetornarStatusCode204() {
        given()
                .get("v1/restricoes/"+ vars.cpfs[9])
                .then()
                .statusCode(204);
                //.log().all();
    }
}







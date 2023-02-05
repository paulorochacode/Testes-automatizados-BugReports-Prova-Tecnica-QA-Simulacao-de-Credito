package br.com.sicredi.api.automacao.cenarios.otimista;

import br.com.sicredi.api.automacao.cenarios.BaseTeste;
import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.core.StringContains.containsString;
class EndPoints{
    final String CONSULTAR_RESTRICOES_ENDPOINT = "/v1/restricoes/";
}

class vars{
        static String[] cpfRestrito ={  "97093236014",
                                        "60094146012",
                                        "84809766080",
                                        "62648716050",
                                        "26276298085",
                                        "01317496094",
                                        "55856777050",
                                        "19626829001",
                                        "24094592008",
                                        "58063164083"};

    public static String getCpfRestrito(int numCpf) {
        return cpfRestrito[numCpf];
    }
    }


    public class RestricoesTestes extends BaseTeste {

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

        @Test
        public void testConsultarRestricaoCPF1DeveRetornarStatusCode200() {
            given()
                .get("v1/restricoes/"+vars.getCpfRestrito(1))
            .then()
                .statusCode(200)
                //.log().all();
                .body("mensagem", containsString("O CPF "+ vars.getCpfRestrito(1) + " tem problema"));
        }

        @Test
        public void testConsultarRestricaoCPF2DeveRetornarStatusCode200() {
            given()
                .get("v1/restricoes/"+vars.getCpfRestrito(2))
            .then()
                .statusCode(200)
                //.log().all();
                .body("mensagem", containsString("O CPF "+ vars.getCpfRestrito(2) + " tem problema"));
        }

        @Test
        public void testConsultarRestricaoCPF3DeveRetornarStatusCode200() {
            given()
                .get("v1/restricoes/"+vars.getCpfRestrito(3))
            .then()
                .statusCode(200)
                //.log().all();
                .body("mensagem", containsString("O CPF "+ vars.getCpfRestrito(3) + " tem problema"));
        }

        @Test
        public void testConsultarRestricaoCPF4DeveRetornarStatusCode200() {
            given()
                .get("v1/restricoes/"+vars.getCpfRestrito(4))
            .then()
                .statusCode(200)
                //.log().all();
                .body("mensagem", containsString("O CPF "+ vars.getCpfRestrito(4) + " tem problema"));
        }

        @Test
        public void testConsultarRestricaoCPF5DeveRetornarStatusCode200() {
            given()
                .get("v1/restricoes/"+vars.getCpfRestrito(5))
            .then()
                .statusCode(200)
                //.log().all();
                .body("mensagem", containsString("O CPF "+ vars.getCpfRestrito(5) + " tem problema"));
        }

        @Test
        public void testConsultarRestricaoCPF6DeveRetornarStatusCode200() {
            given()
                .get("v1/restricoes/"+vars.getCpfRestrito(6))
            .then()
                .statusCode(200)
                //.log().all();
                .body("mensagem", containsString("O CPF "+ vars.getCpfRestrito(6) + " tem problema"));
        }

        @Test
        public void testConsultarRestricaoCPF7DeveRetornarStatusCode200() {
            given()
                .get("v1/restricoes/"+vars.getCpfRestrito(7))
            .then()
                .statusCode(200)
                //.log().all();
                .body("mensagem", containsString("O CPF "+ vars.getCpfRestrito(7) + " tem problema"));
        }

        @Test
        public void testConsultarRestricaoCPF8DeveRetornarStatusCode200() {
            given()
                .get("v1/restricoes/"+vars.getCpfRestrito(8))
            .then()
                .statusCode(200)
                //.log().all();
                .body("mensagem", containsString("O CPF "+ vars.getCpfRestrito(8) + " tem problema"));
        }

        @Test
        public void testConsultarRestricaoCPF9DeveRetornarStatusCode200() {
            given()
                .get("v1/restricoes/"+vars.getCpfRestrito(9))
            .then()
                .statusCode(200)
                //.log().all();
                .body("mensagem", containsString("O CPF "+ vars.getCpfRestrito(9) + " tem problema"));
        }

    }

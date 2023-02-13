package Simulacoes.Update;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class UpdateObrigatoriedadePart2Test {

    static class vars{
        static String[] oldCpfs ={
                "48947379462",
                "48973974628",
                "40192874949",
                "40194759405",
                "40198375899",
                "47617492749",
                "49638623840",
                "42084394002",
                "40924924892",
                "40197489249",
                "41290697364",
                "41018378387",
                "40128738407",
                "41823827432",
                "47189273981",
                "48917298303",
                "41092838922",
                "48719237109",
                "48719492835",
                "48983274928"};
        
        static String[] newCpfs ={
                "48947379462",
                "48973974628",
                "40192874949",
                "40194759405",
                "40198375899",
                "47617492749",
                "49638623840",
                "42084394002",
                "40924924892",
                "40197489249",
                "41290697364",
                "41018378387",
                "40128738407",
                "41823827432",
                "47189273981",
                "48917298303",
                "41092838922",
                "48719237109",
                "48719492835",
                "48983274928"};
        }

    @BeforeClass
    public static void setup() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        baseURI = "http://localhost";
        port = 8080;
        basePath = "/api/";
    }

    @Test
    public void test1CriandoSimulacaoDeveRetornarStatusCode400() {
        //bug nr simulação sendo criada sem nome
        given()
                .body("{\n" +
                        "\"nome\": \"\",\n" +
                        "\"email\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.newCpfs[0] + ",\n" +
                        "\"valor\": 38000,\n" +
                        "\"parcelas\": 3,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .put("v1/simulacoes/" + vars.oldCpfs[0])
                .then()
                //.log().all();
                .statusCode(400);
    }

    @Test
    public void test2CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
                .body("{\n" +
                        "\"nome\": \"Colaborador Sicredi\",\n" +
                        "\"email\": \"\",\n" +
                        "\"cpf\":" + vars.newCpfs[1] + ",\n" +
                        "\"valor\": 38000,\n" +
                        "\"parcelas\": 3,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .put("v1/simulacoes/" + vars.oldCpfs[1])
                .then()
                .statusCode(400);
    }

    @Test
    public void test3CriandoSimulacaoDeveRetornarStatusCode400() {
        // bug nr, simulação sendo criada sem cpf
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\": \"\",\n" +
                    "\"valor\": 38000,\n" +
                    "\"parcelas\": 3,\n" +
                    "\"seguro\": true\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .put("v1/simulacoes/" + vars.oldCpfs[2])
        .then()
            .statusCode(400);
    }
    @Test
    public void test4CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
                .body("{\n" +
                        "\"nome\": \"Colaborador Sicredi\",\n" +
                        "\"email\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.newCpfs[2] + ",\n" +
                        "\"valor\": ,\n" +
                        "\"parcelas\": 3,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .put("v1/simulacoes/" + vars.oldCpfs[3])
                .then()
                .statusCode(400);
    }
    @Test
    public void test5CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
                .body("{\n" +
                        "\"nome\": \"Colaborador Sicredi\",\n" +
                        "\"email\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.newCpfs[3] + ",\n" +
                        "\"valor\": 38000,\n" +
                        "\"parcelas\": ,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .put("v1/simulacoes/" + vars.oldCpfs[4])
                .then()
                .statusCode(400);
    }
    @Test
    public void test6CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
                .body("{\n" +
                        "\"nome\": \"Colaborador Sicredi\",\n" +
                        "\"email\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.newCpfs[4] + ",\n" +
                        "\"valor\": 38000,\n" +
                        "\"parcelas\": 3,\n" +
                        "\"seguro\": \n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .put("v1/simulacoes/" + vars.oldCpfs[5])
                .then()
                .statusCode(400);
    }
    @Test
    public void test7CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
                .body("{\n" +
                        "\"\": \"Colaborador Sicredi\",\n" +
                        "\"email\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.newCpfs[5] + ",\n" +
                        "\"valor\": 38000,\n" +
                        "\"parcelas\": 3,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .put("v1/simulacoes/" + vars.oldCpfs[6])
                .then()
                .statusCode(400);
    }
    @Test
    public void test8CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
                .body("{\n" +
                        "\"nome\": \"Colaborador Sicredi\",\n" +
                        "\"\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.newCpfs[6] + ",\n" +
                        "\"valor\": 38000,\n" +
                        "\"parcelas\": 3,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .put("v1/simulacoes/" + vars.oldCpfs[7])
                .then()
                .statusCode(400);
    }
    @Test
    public void test9CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"\":" + vars.newCpfs[7] + ",\n" +
                    "\"valor\": 38000,\n" +
                    "\"parcelas\": 3,\n" +
                    "\"seguro\": true\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .put("v1/simulacoes/" + vars.oldCpfs[8])
        .then()
            .statusCode(400);
    }
    @Test
    public void test10CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
                .body("{\n" +
                        "\"nome\": \"Colaborador Sicredi\",\n" +
                        "\"email\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.newCpfs[8] + ",\n" +
                        "\"\": 38000,\n" +
                        "\"parcelas\": 3,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .put("v1/simulacoes/" + vars.oldCpfs[9])
                .then()
                .statusCode(400);
    }
    @Test
    public void test11CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
                .body("{\n" +
                        "\"nome\": \"Colaborador Sicredi\",\n" +
                        "\"email\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.newCpfs[9] + ",\n" +
                        "\"valor\": 38000,\n" +
                        "\"\": 3,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .put("v1/simulacoes/" + vars.oldCpfs[10])
                .then()
                .statusCode(400);
    }
    @Test
    public void test12CriandoSimulacaoDeveRetornarStatusCode400() {
        //bug nr resputa 500 inves de 400
        given()
                .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.newCpfs[10] + ",\n" +
                    "\"valor\": 38000,\n" +
                    "\"parcelas\": 3,\n" +
                    "\"\": true\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .put("v1/simulacoes/" + vars.oldCpfs[11])
        .then()
            .statusCode(400);
    }
    @Test
    public void test13CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
                .body("{\n" +

                        "\"email\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.newCpfs[11] + ",\n" +
                        "\"valor\": 38000,\n" +
                        "\"parcelas\": 3,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .put("v1/simulacoes/" + vars.oldCpfs[12])
                .then()
                .statusCode(400);
    }
    @Test
    public void test14CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
                .body("{\n" +
                        "\"nome\": \"Colaborador Sicredi\",\n" +

                        "\"cpf\":" + vars.newCpfs[12] + ",\n" +
                        "\"valor\": 38000,\n" +
                        "\"parcelas\": 3,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .put("v1/simulacoes/" + vars.oldCpfs[13])
                .then()
                .statusCode(400);
    }
    @Test
    public void test15CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
                .body("{\n" +
                        "\"nome\": \"Colaborador Sicredi\",\n" +
                        "\"email\": \"fulano@gmail.com\",\n" +

                        "\"valor\": 38000,\n" +
                        "\"parcelas\": 3,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .put("v1/simulacoes/" + vars.oldCpfs[14])
                .then()
                .statusCode(400);
    }
    @Test
    public void test16CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
                .body("{\n" +
                        "\"nome\": \"Colaborador Sicredi\",\n" +
                        "\"email\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.newCpfs[13] + ",\n" +

                        "\"parcelas\": 3,\n" +
                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .put("v1/simulacoes/" + vars.oldCpfs[15])
                .then()
                .statusCode(400);
    }
    @Test
    public void test17CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
                .body("{\n" +
                        "\"nome\": \"Colaborador Sicredi\",\n" +
                        "\"email\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.newCpfs[14] + ",\n" +
                        "\"valor\": 38000,\n" +

                        "\"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .put("v1/simulacoes/" + vars.oldCpfs[16])
                .then()
                .statusCode(400);
    }
    @Test
    public void test18CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
                .body("{\n" +
                        "\"nome\": \"Colaborador Sicredi\",\n" +
                        "\"email\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.newCpfs[15] + ",\n" +
                        "\"valor\": 38000,\n" +
                        "\"parcelas\": 3,\n" +

                        "}")
                .contentType(ContentType.JSON)
                .when()
                .put("v1/simulacoes/" + vars.oldCpfs[17])
                .then()
                .statusCode(400);
    }
}
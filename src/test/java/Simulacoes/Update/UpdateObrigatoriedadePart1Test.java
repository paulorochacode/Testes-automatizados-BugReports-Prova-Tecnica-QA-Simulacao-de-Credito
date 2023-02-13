package Simulacoes.Update;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

public class UpdateObrigatoriedadePart1Test {

    static class vars{
        static String[] cpfs ={
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
                "48983274928"

        };
    }

    @BeforeClass
    public static void setup() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        baseURI = "http://localhost";
        port = 8080;
        basePath = "/api/";
    }

    @Test
    public void test1CriandoSimulacaoUpdateTestDeveRetornarStatusCode201() {
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.cpfs[0] + ",\n" +
                    "\"valor\": 23040,\n" +
                    "\"parcelas\": 6,\n" +
                    "\"seguro\": false\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .post("v1/simulacoes")
        .then();
        //    .log().all()
        //    .statusCode(201);
    }

    @Test
    public void test2CriandoSimulacaoUpdateTestDeveRetornarStatusCode201() {
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.cpfs[1] + ",\n" +
                    "\"valor\": 23040,\n" +
                    "\"parcelas\": 6,\n" +
                    "\"seguro\": false\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .post("v1/simulacoes")
        .then();
        //    .log().all()
        //    .statusCode(201);
    }
    
    @Test
    public void test3CriandoSimulacaoUpdateTestDeveRetornarStatusCode201() {
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.cpfs[2] + ",\n" +
                    "\"valor\": 23040,\n" +
                    "\"parcelas\": 6,\n" +
                    "\"seguro\": false\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .post("v1/simulacoes")
        .then();
        //    .log().all()
        //    .statusCode(201);
    }    

    @Test
    public void test4CriandoSimulacaoUpdateTestDeveRetornarStatusCode201() {
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.cpfs[3] + ",\n" +
                    "\"valor\": 23040,\n" +
                    "\"parcelas\": 6,\n" +
                    "\"seguro\": false\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .post("v1/simulacoes")
        .then();
        //    .log().all()
        //    .statusCode(201);
    }  

    @Test
    public void test5CriandoSimulacaoUpdateTestDeveRetornarStatusCode201() {
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.cpfs[4] + ",\n" +
                    "\"valor\": 23040,\n" +
                    "\"parcelas\": 6,\n" +
                    "\"seguro\": false\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .post("v1/simulacoes")
        .then();
        //    .log().all()
        //    .statusCode(201);
    }
    
    @Test
    public void test6CriandoSimulacaoUpdateTestDeveRetornarStatusCode201() {
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.cpfs[5] + ",\n" +
                    "\"valor\": 23040,\n" +
                    "\"parcelas\": 6,\n" +
                    "\"seguro\": false\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .post("v1/simulacoes")
        .then();
        //    .log().all()
        //    .statusCode(201);
    }    

    @Test
    public void test7CriandoSimulacaoUpdateTestDeveRetornarStatusCode201() {
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.cpfs[6] + ",\n" +
                    "\"valor\": 23040,\n" +
                    "\"parcelas\": 6,\n" +
                    "\"seguro\": false\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .post("v1/simulacoes")
        .then();
        //    .log().all()
        //    .statusCode(201);
    }    

    @Test
    public void test8CriandoSimulacaoUpdateTestDeveRetornarStatusCode201() {
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.cpfs[7] + ",\n" +
                    "\"valor\": 23040,\n" +
                    "\"parcelas\": 6,\n" +
                    "\"seguro\": false\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .post("v1/simulacoes")
        .then();
        //    .log().all()
        //    .statusCode(201);
    }    

    @Test
    public void test9CriandoSimulacaoUpdateTestDeveRetornarStatusCode201() {
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.cpfs[8] + ",\n" +
                    "\"valor\": 23040,\n" +
                    "\"parcelas\": 6,\n" +
                    "\"seguro\": false\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .post("v1/simulacoes")
        .then();
        //    .log().all()
        //    .statusCode(201);
    }    

    @Test
    public void test10CriandoSimulacaoUpdateTestDeveRetornarStatusCode201() {
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.cpfs[9] + ",\n" +
                    "\"valor\": 23040,\n" +
                    "\"parcelas\": 6,\n" +
                    "\"seguro\": false\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .post("v1/simulacoes")
        .then();
        //    .log().all()
        //    .statusCode(201);
    }    

    @Test
    public void test11CriandoSimulacaoUpdateTestDeveRetornarStatusCode201() {
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.cpfs[10] + ",\n" +
                    "\"valor\": 23040,\n" +
                    "\"parcelas\": 6,\n" +
                    "\"seguro\": false\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .post("v1/simulacoes")
        .then();
        //    .log().all()
        //    .statusCode(201);
    }    

    @Test
    public void test12CriandoSimulacaoUpdateTestDeveRetornarStatusCode201() {
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.cpfs[11] + ",\n" +
                    "\"valor\": 23040,\n" +
                    "\"parcelas\": 6,\n" +
                    "\"seguro\": false\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .post("v1/simulacoes")
        .then();
        //    .log().all()
        //    .statusCode(201);
    }    

    @Test
    public void test13CriandoSimulacaoUpdateTestDeveRetornarStatusCode201() {
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.cpfs[12] + ",\n" +
                    "\"valor\": 23040,\n" +
                    "\"parcelas\": 6,\n" +
                    "\"seguro\": false\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .post("v1/simulacoes")
        .then();
        //    .log().all()
        //    .statusCode(201);
    }    

    @Test
    public void test14CriandoSimulacaoUpdateTestDeveRetornarStatusCode201() {
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.cpfs[13] + ",\n" +
                    "\"valor\": 23040,\n" +
                    "\"parcelas\": 6,\n" +
                    "\"seguro\": false\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .post("v1/simulacoes")
        .then();
        //    .log().all()
        //    .statusCode(201);
    }    

    @Test
    public void test15CriandoSimulacaoUpdateTestDeveRetornarStatusCode201() {
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.cpfs[14] + ",\n" +
                    "\"valor\": 23040,\n" +
                    "\"parcelas\": 6,\n" +
                    "\"seguro\": false\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .post("v1/simulacoes")
        .then();
        //    .log().all()
        //    .statusCode(201);
    }    

    @Test
    public void test16CriandoSimulacaoUpdateTestDeveRetornarStatusCode201() {
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.cpfs[15] + ",\n" +
                    "\"valor\": 23040,\n" +
                    "\"parcelas\": 6,\n" +
                    "\"seguro\": false\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .post("v1/simulacoes")
        .then();
        //    .log().all()
        //    .statusCode(201);
    }    

    @Test
    public void test17CriandoSimulacaoUpdateTestDeveRetornarStatusCode201() {
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.cpfs[16] + ",\n" +
                    "\"valor\": 23040,\n" +
                    "\"parcelas\": 6,\n" +
                    "\"seguro\": false\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .post("v1/simulacoes")
        .then();
        //    .log().all()
        //    .statusCode(201);
    }    

    @Test
    public void test18CriandoSimulacaoUpdateTestDeveRetornarStatusCode201() {
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.cpfs[17] + ",\n" +
                    "\"valor\": 23040,\n" +
                    "\"parcelas\": 6,\n" +
                    "\"seguro\": false\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .post("v1/simulacoes")
        .then();
        //    .log().all()
        //    .statusCode(201);
    }    

    @Test
    public void test19CriandoSimulacaoUpdateTestDeveRetornarStatusCode201() {
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.cpfs[18] + ",\n" +
                    "\"valor\": 23040,\n" +
                    "\"parcelas\": 6,\n" +
                    "\"seguro\": false\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .post("v1/simulacoes")
        .then();
        //    .log().all()
        //    .statusCode(201);
    }    

    @Test
    public void test20CriandoSimulacaoUpdateTestDeveRetornarStatusCode201() {
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.cpfs[19] + ",\n" +
                    "\"valor\": 23040,\n" +
                    "\"parcelas\": 6,\n" +
                    "\"seguro\": false\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .post("v1/simulacoes")
        .then();
        //    .log().all()
        //    .statusCode(201);
    }    
};


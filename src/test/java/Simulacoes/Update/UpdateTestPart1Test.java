package Simulacoes.Update;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

public class UpdateTestPart1Test {

    static class vars{
        static String[] cpfs ={
                "38947293439",
                "10928490238",
                "90384902342",
                "32098402933",
                "90328490323",
                "02938402332",
                "30498230324",
                "28923748923",
                "23984023942",
                "09238483247",
                "20938402938",
                "29283742938",
                "09283423645",
                "89473958234",
                "28374675920",
                "98374923743",
                "98273478263",
                "09238409232",
                "09384203423",
                "89273489273"

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


package Simulacoes.Update;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.core.StringContains.containsString;


public class UpdateTestPart2Test {

    static class vars{
        static String[] oldCpfs ={
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
            "89273489273"};
        
        static String[] newCpfs ={
            "48939489234",
            "48994032039",
            "40103492302",
            "46293847289",
            "46340283840",
            "47943853459",
            "43092384022",
            "48990293844",
            "40293482034",
            "46209204900",
            "92384029304",
            "20394802933",
            "20934803928",
            "43029029323",
            "02934387463",
            "48734628374",
            "92384792837",
            "20934802398",
            "20394032984",
            "48379428343"};
            
        static String[] emailsNValidos = {
            "\"ejrgioejrgie.com\"",
            "\"@.com\"",
            "\"www.ejrgioejr.com\""
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
    public void test1CriandoSimulacaoDeveRetornarStatusCode201() {
        //buga nr, não retorna
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.newCpfs[0] + ",\n" +
                    "\"valor\": 38000,\n" +
                    "\"parcelas\": 3,\n" +
                    "\"seguro\": true\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .put("v1/simulacoes/" + vars.oldCpfs[2])
        .then()
            //.log().all();
            .statusCode(201)
            .body(containsString("Simulação criada com sucesso"));
    }

    @Test
    public void test2CriandoSimulacaoDeveRetornarStatusCode400() {
        //bug r, cpf formato inválido
        given()
            .body("{\n" +
                "\"nome\": \"Colaborador Sicredi\",\n" +
                "\"email\": \"fulano@gmail.com\",\n" +
                "\"cpf\":" + "999.555.999-44" + ",\n" +
                "\"valor\": 38000,\n" +
                "\"parcelas\": 3,\n" +
                "\"seguro\": true\n" +
                "}")
            .contentType(ContentType.JSON)
        .when()
            .put("v1/simulacoes/" + vars.oldCpfs[3])
        .then()
            .log().all()
            .statusCode(400);
    }

    @Test
    public void test3CriandoSimulacaoDeveRetornarStatusCode400() {
        //bug r, bug em regra de negócio campo valor
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.newCpfs[2] +",\n" +
                    "\"valor\": 700,\n" +
                    "\"parcelas\": 3,\n" +
                    "\"seguro\": true\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .put("v1/simulacoes/" + vars.oldCpfs[4])
        .then()
            .log().all()
            .statusCode(400);
    }
    @Test
    public void test4CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
            .body("{\n" +
                    "\"nome\": \"\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.newCpfs[3] + ",\n" +
                    "\"valor\": 40002,\n" +
                    "\"parcelas\": 3,\n" +
                    "\"seguro\": true\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .put("v1/simulacoes/" + vars.oldCpfs[5])
        .then()
            //.log().all()
            .content(containsString("Valor deve ser menor ou igual a R$ 40.000"))
            .statusCode(400);
    }
    @Test
    public void test5CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
            .body("{\n" +
                    "\"nome\": \"gulherme fonseca\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.newCpfs[4] + ",\n" +
                    "\"valor\": 38000,\n" +
                    "\"parcelas\": 1,\n" +
                    "\"seguro\": true\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .put("v1/simulacoes/" + vars.oldCpfs[6])
        .then()
            //.log().all()
            .body(containsString("Parcelas deve ser igual ou maior que 2"))
            .statusCode(400);
    }
    @Test
    public void test6CriandoSimulacaoDeveRetornarStatusCode400() {
        //bug nr, em regra de negócio campo numero de parcela
        given()
            .body("{\n" +
                    "\"nome\": \"Augusto Sousa\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.newCpfs[5] + ",\n" +
                    "\"valor\": 38000,\n" +
                    "\"parcelas\": 49,\n" +
                    "\"seguro\": true\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .put("v1/simulacoes/" + vars.oldCpfs[7])
        .then()
            //.log().all();
            .statusCode(400);
    }
    @Test
    public void test7CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
        .body("{\n" +
                "\"nome\": \"Joao da Silva\",\n" +
                "\"email\":" + vars.emailsNValidos[2] + ",\n" +
                "\"cpf\":" + vars.newCpfs[6] + ",\n" +
                "\"valor\": 38000,\n" +
                "\"parcelas\": 3,\n" +
                "\"seguro\": true\n" +
                "}")
            .contentType(ContentType.JSON)
        .when()
            .put("v1/simulacoes/" + vars.oldCpfs[8])
        .then()
            //.body(containsString("E-mail deve ser um e-mail válido"))
            //.log().all()
            .statusCode(400);
    }
    @Test
    public void test9CriandoSimulacaoDeveRetornarStatusCode201() {
        given()
            .body("{\n" +
                    "\"nome\": \"\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.newCpfs[8] + ",\n" +
                    "\"valor\": 38000,\n" +
                    "\"parcelas\": 3,\n" +
                    "\"seguro\": true\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .put("v1/simulacoes/" + vars.oldCpfs[9])
        .then()
            //.log().all();
            .statusCode(201);
    }

    @Test
    public void test10CriandoSimulacaoDeveRetornarStatusCode400() {
    //bug nr, bug em campo nome sendo aceito com numeros e simbolos
        given()
            .body("{\n" +
                        "\"nome\": \"123456#$%&*\",\n" +
                        "\"email\": \"fulano@gmail.com\",\n" +
                        "\"cpf\":" + vars.newCpfs[9] + ",\n" +
                        "\"valor\": 24000,\n" +
                        "\"parcelas\": 34,\n" +
                        "\"seguro\": false\n" +
                        "}")
            .contentType(ContentType.JSON)
        .when()
            .put("v1/simulacoes/" + vars.oldCpfs[10])
        .then()
            //.log().all();
            .statusCode(400);
    }

    @Test
    public void test11CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
            .body("{\n" +
                    "\"nome\": \"fulano perereira\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.newCpfs[10] + ",\n" +
                    "\"valor\": abcd$%,\n" +
                    "\"parcelas\": 34,\n" +
                    "\"seguro\": false\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .put("v1/simulacoes/" + vars.oldCpfs[11])
        .then()
            //.log().all();
            .statusCode(400);
    }

    @Test
    public void test12CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
            .body("{\n" +
                    "\"nome\": \"fulano perereira\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.newCpfs[12] + ",\n" +
                    "\"valor\": 24000,\n" +
                    "\"parcelas\": abcd@#%¨,\n" +
                    "\"seguro\": true\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .put("v1/simulacoes/" + vars.oldCpfs[12])
        .then()
            //.log().all();
            .statusCode(400);
    }

    @Test
    public void test13CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
            .body("{\n" +
                    "\"nome\": \"fulano perereira\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.newCpfs[13] + ",\n" +
                    "\"valor\": 24000,\n" +
                    "\"parcelas\": abcd@#%¨,\n" +
                    "\"seguro\": false\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .put("v1/simulacoes/" + vars.oldCpfs[13])
        .then()
            //.log().all();
            .statusCode(400);
    }
    @Test
    public void test14CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
            .body("{\n" +
                    "\"nome\": \"fulano perereira\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.newCpfs[14] + ",\n" +
                    "\"valor\": 24000,\n" +
                    "\"parcelas\": 12¨,\n" +
                    "\"seguro\": 12345\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .put("v1/simulacoes/" + vars.oldCpfs[14])
        .then()
            //.log().all();
            .statusCode(400);
    }

    @Test
    public void test15CriandoSimulacaoDeveRetornarStatusCode400() {
        given()
            .body("{\n" +
                    "\"nome\": \"Colaborador Sicredi\",\n" +
                    "\"email\": \"fulano@gmail.com\",\n" +
                    "\"cpf\":" + vars.newCpfs[0] + ",\n" +
                    "\"valor\": 38000,\n" +
                    "\"parcelas\": 3,\n" +
                    "\"seguro\": true\n" +
                    "}")
            .contentType(ContentType.JSON)
        .when()
            .put("v1/simulacoes/" + vars.oldCpfs[1])
        .then()
            //.log().all();
            .statusCode(400)
            .body(containsString("CPF duplicado"));
    }

}

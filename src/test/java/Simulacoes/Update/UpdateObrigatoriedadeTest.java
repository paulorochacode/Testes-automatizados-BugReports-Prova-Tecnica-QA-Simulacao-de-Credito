package Simulacoes.Update;

import Simulacoes.Create.CreateObrigatoriedadeTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.BeforeClass;
import org.junit.Test;
import static io.restassured.RestAssured.*;
public class UpdateObrigatoriedadeTest {

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
                "32897489249",
                "34672897364",
                "34762378387",
                "49729078407",
                "86487327432",
                "47189273981",
                "48917298303"};
    }
    @BeforeClass
    public static void setup() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        baseURI = "http://localhost";
        port = 8080;
        basePath = "/api/";
    }


}

package br.com.sicredi.api.automacao.cenarios;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.basePath;
import io.restassured.http.ContentType;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import ch.qos.logback.core.net.SyslogOutputStream;


public class BaseTeste {

        @BeforeClass
        public static void setup(){
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        baseURI = "http://localhost";
        port = 8080 ;
        basePath = "/api";
        }

        public static void BaseTeste() {
                final String GET_RESTRICOES_ENDPOIT ="/restricoes/{cpf}";
                final String PUT_CADASTRAR_SIMULACOES_ENDPOINT = "/simulacoes/{cpf}";
                final String GET_CONSULTAR_SIMULACOES_ENDPOINT = "/";
                final String GET_CONSULTAR_TODAS_SIMULACOES = "/simulacoes";
                final String PUT_ALTERAR_SIMULACOES_ENDPOINT = "/";
                final String DELETE_DELETAR_SIMULACOES_ENDPOINT = "/simulacoes/{id}";

        }
}

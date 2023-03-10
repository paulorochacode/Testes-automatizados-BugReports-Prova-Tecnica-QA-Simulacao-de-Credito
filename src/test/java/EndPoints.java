
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


public class EndPoints {
    final String GET_RESTRICOES_ENDPOIT = "v1/restricoes/";
    final String PUT_CADASTRAR_SIMULACOES_ENDPOINT = "v1/simulacoes/";
    final String GET_CONSULTAR_SIMULACOES_ENDPOINT = "v1/simulacoes/";
    final String GET_CONSULTAR_TODAS_SIMULACOES = "v1/simulacoes/";
    final String PUT_ALTERAR_SIMULACOES_ENDPOINT = "v1/simulacoes/";
    final String DELETE_DELETAR_SIMULACOES_ENDPOINT = "v1/simulacoes/";
}
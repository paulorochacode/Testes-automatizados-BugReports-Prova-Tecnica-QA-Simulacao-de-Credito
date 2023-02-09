<h3>
 <a href="https://github.com/paulorochacode/Prova-Tecnica-API-Rest-Java-Spring-Simulacao-de-Credito">Link para repositório da api</a>
</h3>


 
<a></br>
    <ul><h3>Bugs encontrados :</h3>
        <li>Bug em regra que limita simulações com valores iguais ou menores que R$ 1000</br>
        <img src=https://raw.githubusercontent.com/paulorochacode/Testes-automatizados-BugReports-Prova-Tecnica-QA-Simulacao-de-Credito/main/images/bugs/bug1-criar-simulacao-valor-minimo.png>
        </li>
   </ul>
   <ul>
        <li>Bug em tipagem que permite criar simulações com mais ou menos casas do que se deveriam</br>
        e também permite entrada de qualquer tipo de caracteres</br>
        <img src=https://github.com/paulorochacode/Testes-automatizados-BugReports-Prova-Tecnica-QA-Simulacao-de-Credito/blob/main/images/bugs/bug2-criar-simulacao-cpf-type.png?raw=true>
        </li>
   </ul>
</a>
 

<h3>Testes Executados :</h3>

<h3>Como rodar testes automatizados :</h3>

##  Requisitos
 * Java 8+ JDK deve estar instalado
 * Maven deve estar instalado e configurado no path da aplicação
 * IDE eclipse/ intellij

## Como executar a API 

Na raiz do projeto, através de seu Prompt de Commando/Terminal/Console execute o comando como administrador do sistema 

mvn clean spring-boot:run -Dserver.port=8080

A aplicação estará disponível através da URL [http://localhost:8080](http://localhost:8080)

Você pode trocar a porta da aplicação, caso a _8080_ já estiver em uso, adicionando a propriedade JVM `server.port`.

Exemplo:

```bash
mvn clean spring-boot:run -Dserver.port=4444

## Como executar os testes automatizados

abra o projeto em uma IDE de preferencia

clique com direito e clique em executar todos os testes presentes na pasta com JUnit na seguinte pasta /src/test/JAVA


<!--

 -->

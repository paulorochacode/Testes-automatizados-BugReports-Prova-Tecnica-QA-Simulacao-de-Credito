<h3>
 <a href="https://github.com/paulorochacode/Prova-Tecnica-API-Rest-Java-Spring-Simulacao-de-Credito">Link para repositório da api</a>
</h3>


 
<a></br>
    <ul><h3>Bugs encontrados :</h3>
        <li>Bug em regra de negócio que limita simulações com valores iguais ou menores que R$ 1000</br>
        <img src=https://raw.githubusercontent.com/paulorochacode/Testes-automatizados-BugReports-Prova-Tecnica-QA-Simulacao-de-Credito/main/images/bugs/bug1-criar-simulacao-valor-minimo.png>
        </li>
        <li>Bug em regra de negócio que determina campo CPF como obrigatório ao criar simulação</br>
        <img src=>
        </li>
        <li>Bug em regra de negócio que determina campo Nome como obrigatório ao criar simulação</br>
        <img src=>
        </li>
        </li>
        <li>retorno de status code em falta de parametro "seguro" retorna 500 ao inves de 400</br>
        <img src=>
        </li>
        <li>Simulação criada com sucesso não retorna mensagem "Simulação criada com sucesso"</br>
        <img src=>
        </li>
        <li>bug em regra de negócio em número de parcelas para pagamento que deve ser menor ou igual a 48</br>
        <img src=>
        </li>
   </ul>
   <ul>
        <li>Bug em tipagem que permite criar simulações com mais ou menos casas do que se deveriam</br>
        e também permite entrada de qualquer tipo de caracteres</br>
        <img src=https://github.com/paulorochacode/Testes-automatizados-BugReports-Prova-Tecnica-QA-Simulacao-de-Credito/blob/main/images/bugs/bug2-criar-simulacao-cpf-type.png?raw=true>
        </li>
   </ul>
    <ul>
        <li>
        Inconsistencia com retorno real da api com documentação em restrições</br>
        (regra: Se possui restrição o HTTP Status 200 é retornado com a mensagem "O CPF 99999999999 possui restrição")</br>
        (retorno : "O CPF 99999999999 tem problema")</br>
        <img src=https://github.com/paulorochacode/Testes-automatizados-BugReports-Prova-Tecnica-QA-Simulacao-de-Credito/blob/main/images/bugs/inconsistencia1img1.png?raw=true></br>
        <img src=https://github.com/paulorochacode/Testes-automatizados-BugReports-Prova-Tecnica-QA-Simulacao-de-Credito/blob/main/images/bugs/inconsistencia1img2.png?raw=true></br>
        </li>
   </ul>
</a>
<!--
<h3>Testes Executados :</h3>
 -->
<h3>Como rodar testes automatizados :</h3>

<h4>Requisitos</h4>
 * Java 8+ JDK deve estar instalado
 * Maven deve estar instalado e configurado no path da aplicação
 * IDE eclipse/ intellij

<h4>Como executar a API</h4>

Na raiz do projeto, através de seu Prompt de Commando/Terminal/Console execute o comando como administrador do sistema 

```bash
mvn clean spring-boot:run -Dserver.port=8080
```

A aplicação estará disponível através da URL [http://localhost:8080](http://localhost:8080) 

<h4>Como executar os testes automatizados</h4>

abra o projeto em uma IDE de preferencia

clique com direito e clique em executar todos os testes presentes na pasta com JUnit na seguinte pasta /src/test/JAVA



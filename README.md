# turingTestMalysonSouzaBackend

### Requisitos:

* Ter um servidor postgres rodando no fundo na porta 5432.
username:postgres
senha:123456
(podendo ser alterado em aplication.properties)
Database chamado "postgres" (padrão do postgres) com schema "public"

* Openjdk15 (opcional)

### Como executar.

Você pode preparar o ambiente pelo STS

- Abra um terminal nesta pasta (caso Powershell ou bash).
- > ./mvnw package
- Caso cmd
- > mvnw package

- vá até a pasta target e execute
- > cd target
- > Java -jar turingtest-1.0.0-Release.jar

E estará rodando normalmente (caso o banco esteja rodando).

### Abrindo e testando pelo Swagger

Você poderá testar a API com ferramentas como Postman

ou até mesmo pelo swagger.

localhost:8080/swagger-ui.html
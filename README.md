# turingTestMalysonSouzaBackend

### Requisitos:

* Ter um servidor postgres rodando no fundo na porta 5432.
username:postgres
senha:123456
(podendo ser alterado em aplication.properties)
Database chamado "postgres" (padrão do postgres) com schema "public"

* Openjdk15 (opcional)

### Como executar.

Você pode preparar o ambiente pelo STS.

ou

- Abra um terminal nesta pasta (caso Powershell ou bash).
  > ./mvnw package
- Caso cmd
  > mvnw package

- vá até a pasta target e execute
  > cd target
  > Java -jar turingtest-1.0.0-Release.jar

E estará rodando normalmente (caso o banco esteja rodando).

<hr>

### Abrindo e testando pelo Swagger

Você poderá testar a API com ferramentas como Postman

#### Adicionar Contato:
POST: localhost:8080/agenda/contato
body:
{
    "nome":"Raul Seixas",
    "apelido":"Raulzito",
    "numeroPrincipal":"(84) 6666-6666",
    "numeroSecundario":"",
    "email":"raul@seixas.com"
}

#### Listar todos contatos:
GET: localhost:8080/agenda/contato

#### Consultar contato:
GET: localhost:8080/agenda/contato/{id}

#### Editar contato:
PUT: localhost:8080/agenda/contato
body:
{
    "id": 1,
    "nome":"Raul Seixas",
    "apelido":"Raulzito",
    "numeroPrincipal":"(84) 6666-6666",
    "numeroSecundario":"(21) 6969-69696",
    "email":"raul@seixas.com"
}

#### Deletar contato dado o objeto:
DELETE: localhost:8080/agenda/contato
body:
{
    "id": 1,
    "nome":"Raul Seixas",
    "apelido":"Raulzito",
    "numeroPrincipal":"(84) 6666-6666",
    "numeroSecundario":"(21) 6969-69696",
    "email":"raul@seixas.com"
}

#### Deletar contato dado o id:
DELETE: localhost:8080/agenda/contato/{id}

<HR>

Veja a documentação pelo Swagger e faça os testes por lá também:

localhost:8080/swagger-ui.html


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
POST: localhost:8080/agenda/contato<br>
body:<br>
{<br>
    "nome":"Raul Seixas",<br>
    "apelido":"Raulzito",<br>
    "numeroPrincipal":"(84) 6666-6666",<br>
    "numeroSecundario":"",<br>
    "email":"raul@seixas.com"<br>
}

#### Listar todos contatos:
GET: localhost:8080/agenda/contato

#### Consultar contato:
GET: localhost:8080/agenda/contato/{id}

#### Editar contato:
PUT: localhost:8080/agenda/contato<br>
body:<br>
{<br>
    "id": 1,<br>
    "nome":"Raul Seixas",<br>
    "apelido":"Raulzito",<br>
    "numeroPrincipal":"(84) 6666-6666",<br>
    "numeroSecundario":"(21) 6969-69696",<br>
    "email":"raul@seixas.com"<br>
}

#### Deletar contato dado o objeto:
DELETE: localhost:8080/agenda/contato<br>
body:<br>
{<br>
    "id": 1,<br>
    "nome":"Raul Seixas",<br>
    "apelido":"Raulzito",<br>
    "numeroPrincipal":"(84) 6666-6666",<br>
    "numeroSecundario":"(21) 6969-69696",<br>
    "email":"raul@seixas.com"<br>
}

#### Deletar contato dado o id:
DELETE: localhost:8080/agenda/contato/{id}

<HR>

Veja a documentação pelo Swagger e faça os testes por lá também:

localhost:8080/swagger-ui.html


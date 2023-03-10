
# UserCrud Backend

O projeto trata-se de um C.R.U.D de usuários, onde é possível criar um usuário que possui Nome, Nome de Usuário e e-mail.



## Stack utilizada

**Back-end:** Java (JDK 17), SpringBoot ˆ3.0.0

**Database** MySQL

## Rodando localmente

Clone o projeto

```bash
  git clone https://github.com/jpcchaves/usercrud-backend.git
```

Entre no diretório do projeto

```bash
  cd usercrud-backend
```

Aguarde o Maven instalar as dependências

Inicie o servidor (se estiver utilizando o IntelliJ, utilize o comando abaixo. Caso não, busque a opção Run Application da sua IDE de preferência)

```bash
  CTRL + SHIFT + F10
```




## Documentação da API

#### Retorna todos os usuários

```http
  GET /users
```

#### Retorna um usuário

```http
  GET /user/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do usuário que você quer |

#### Cria um usuário

```http
  POST /user
```

| Request Body   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `name`      | `string` | **Obrigatório**. O nome do usuário que você quer |
| `username`      | `string` | **Obrigatório**. O username do usuário que você quer|
| `email`      | `string` | **Obrigatório**. O email do usuário que você quer |

#### Atualiza dos dados de um usuário

```http
  PUT /user/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do usuário que você quer |

| Request Body   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `name`      | `string` | **Obrigatório**. O nome do usuário que você quer atualizar |
| `username`      | `string` | **Obrigatório**. O username do usuário que você quer atualizar|
| `email`      | `string` | **Obrigatório**. O email do usuário que você quer atualizar |


#### Deleta um usuário

```http
  DELETE /user/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do usuário que você quer |


## Aprendizados

Aprendi a utilizar o framework Spring Boot para desenvolver uma API Rest com os principais endpoints: GET, PUT, POST, DELETE.

Também foi de grande valia para aprender mais sobre tratamento de exceções em Java e validação dos dados enviados pelo usuário por meio da validação disponibilizada pelo Spring Boot (Bean Validation with Hibernate validator).




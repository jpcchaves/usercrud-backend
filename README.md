
# UserCrud Backend

O projeto trata-se de um C.R.U.D de usuários, onde é possível criar um usuário que possui Nome, Nome de Usuário e e-mail.



## Stack utilizada

**Back-end:** Java (JDK 17), SpringBoot ˆ3.0.0

**Database** MySQL


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





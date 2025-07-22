# PedidosApi

Este projeto é uma API de pedidos desenvolvida em Java com Spring Boot, utilizando RabbitMQ para mensageria e MongoDB para persistência de dados.

## Tecnologias Utilizadas

- Java 21: Linguagem de programação.
- Spring Boot 3.5.0: Framework para construção da aplicação.
- Spring AMQP: Integração com RabbitMQ para comunicação assíncrona.
- Spring Data MongoDB: Interação com o banco de dados MongoDB.
- RabbitMQ: Broker de mensagens para processamento assíncrono de pedidos.
- MongoDB: Banco de dados NoSQL para armazenamento de informações de pedidos.
- Docker e Docker Compose: Para orquestração e execução dos serviços.

## Para Executar a Aplicação

### Primeiros Passos

Para rodar este projeto localmente, siga os passos abaixo:

Pré-requisitos:
- Certifique-se de ter o Docker e o Docker Compose instalados em sua máquina.

### 1. Subir os Serviços com Docker Compose

Navegue até o diretório raiz do projeto onde o arquivo docker-compose.yml está localizado e execute o seguinte comando:
Bash

```docker-compose up -d```

Este comando irá iniciar os contêineres do MongoDB e do RabbitMQ. O -d no final é para rodar em segundo plano.

### 2. Acessar as Interfaces dos Serviços

**RabbitMQ Management Interface:**
Você pode acessar a interface de gerenciamento do RabbitMQ em seu navegador através da URL:
```http://localhost:15672```
As credenciais padrão são guest para usuário e guest para senha.

Após o login, você pode acessar a fila específica do projeto em:
```http://localhost:15672/#/queues/%2F/pedidos-order-created```

**MongoDB:**
O MongoDB estará acessível na porta 27017. Você pode se conectar a ele usando um cliente MongoDB (como MongoDB Compass, Robo 3T, ou mongosh) com as seguintes credenciais:
``` Host: localhost
    Porta: 27017
    Usuário: admin
    Senha: 123456
```

### 3. Rodar a Aplicação Spring Boot

Com os serviços do Docker Compose em execução, você pode iniciar a aplicação Spring Boot. Navegue até o diretório raiz do projeto e execute:
``` ./mvnw spring-boot:run ```

Ou, se preferir usar sua IDE (IntelliJ IDEA, VS Code, Eclipse), importe o projeto Maven e execute a classe principal da aplicação.

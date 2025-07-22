Para subir o Docker:
docker-compose up


Para acessar o RabbitMQ
http://localhost:15672/#/queues/%2F/pedidos-order-created

Payload example:

{   
    "codigoPedido": 1002,
    "codigoCliente": 1,
    "itens": [
        {
            "produto": "notebook",
            "quantidade": 1,
            "preco": 2300.00
        },
        {
            "produto": "mouse",
            "quantidade": 1,
            "preco": 250.00
        }
    ]
}
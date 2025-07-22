package br.com.tfmm.spring.pedidosapi.listener.dto;

import java.util.List;

public record OrderCreatedEvent(Long codigoPedido,
                                Long codigoCliente,
                                List<OrderItemEvent> itens) {
}

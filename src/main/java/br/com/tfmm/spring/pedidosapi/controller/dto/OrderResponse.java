package br.com.tfmm.spring.pedidosapi.controller.dto;

import br.com.tfmm.spring.pedidosapi.entity.OrderEntity;

import java.math.BigDecimal;

public record OrderResponse(Long orderId,
                            Long costumerId,
                            BigDecimal total) {

    public static OrderResponse fromEntity(OrderEntity orderEntity) {
        return new OrderResponse(orderEntity.getOrderId(), orderEntity.getCustomerId(), orderEntity.getTotal());
    }
}

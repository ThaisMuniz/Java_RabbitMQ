package br.com.tfmm.spring.pedidosapi.controller;

import br.com.tfmm.spring.pedidosapi.controller.dto.ApiResponse;
import br.com.tfmm.spring.pedidosapi.controller.dto.OrderResponse;
import br.com.tfmm.spring.pedidosapi.controller.dto.PaginationResponse;
import br.com.tfmm.spring.pedidosapi.service.OrderService;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/custumers/{custumerId}/orders")
    public ResponseEntity<ApiResponse<OrderResponse>> listOrders(
            @PathVariable("custumerId") Long custumerId,
            @RequestParam(name="page", defaultValue = "0") Integer page,
            @RequestParam(name="pageSize", defaultValue = "10") Integer pageSize) {

        var pageResponse = orderService.findAllByCustomerId(custumerId, PageRequest.of(page, pageSize));

        var totalOnOrders = orderService.findTotalOnOrdersByCustomerId(custumerId);

        return ResponseEntity.ok(new ApiResponse<>(
                Map.of("totalOnOrders",totalOnOrders),
                pageResponse.getContent(),
                PaginationResponse.fromPage(pageResponse)));
    }


}

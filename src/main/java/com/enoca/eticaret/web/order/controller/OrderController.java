package com.enoca.eticaret.web.order.controller;

import com.enoca.eticaret.web.order.model.OrderResponse;
import com.enoca.eticaret.web.order.service.impl.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    @GetMapping()
    public ResponseEntity<List<OrderResponse>> GetAllOrdersForCustomer(){
        return ResponseEntity.ok(orderService.GetAllOrdersForCustomer());
    }
    @GetMapping("/code/{code}")
    public ResponseEntity<List<OrderResponse>> GetOrderForCode(@RequestParam Integer code){
        return ResponseEntity.ok(orderService.GetOrderForCode(code));
    }
}
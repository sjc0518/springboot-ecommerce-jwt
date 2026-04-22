package com.example.demo.controller;

import com.example.demo.model.Order;
import com.example.demo.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @PostMapping("/place")
    public Order place(@RequestParam Long userId) {
        return service.placeOrder(userId);
    }
}
package com.example.demo.controller;

import com.example.demo.model.CartItem;
import com.example.demo.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
@RequiredArgsConstructor
public class CartController {

    private final CartService service;

    @PostMapping("/add")
    public CartItem add(
            @RequestParam Long userId,
            @RequestParam Long productId,
            @RequestParam int qty) {

        return service.addToCart(userId, productId, qty);
    }

    @GetMapping("/{userId}")
    public List<CartItem> getCart(@PathVariable Long userId) {
        return service.getCart(userId);
    }
}
package com.example.demo.service;

import com.example.demo.model.*;
import com.example.demo.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepo;
    private final CartService cartService;
    private final ProductService productService;

    public Order placeOrder(Long userId) {

        List<CartItem> items = cartService.getCart(userId);

        double total = items.stream()
                .mapToDouble(i ->
                        productService.getById(i.getProductId()).getPrice() * i.getQuantity()
                ).sum();

        Order order = new Order();
        order.setUserId(userId);
        order.setTotalAmount(total);
        order.setStatus("PLACED");

        return orderRepo.save(order);
    }
}

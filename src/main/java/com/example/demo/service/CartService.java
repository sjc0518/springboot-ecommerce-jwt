package com.example.demo.service;

import com.example.demo.model.*;
import com.example.demo.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartService {

    private final CartRepository cartRepo;
    private final CartItemRepository itemRepo;

    public Cart getOrCreateCart(Long userId) {
        return cartRepo.findByUserId(userId)
                .orElseGet(() -> {
                    Cart c = new Cart();
                    c.setUserId(userId);
                    return cartRepo.save(c);
                });
    }

    public CartItem addToCart(Long userId, Long productId, int qty) {
        Cart cart = getOrCreateCart(userId);

        CartItem item = new CartItem();
        item.setCart(cart);
        item.setProductId(productId);
        item.setQuantity(qty);

        return itemRepo.save(item);
    }

    public List<CartItem> getCart(Long userId) {
        Cart cart = getOrCreateCart(userId);
        return itemRepo.findByCartId(cart.getId());
    }
}
package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repo;

    // 🔍 Get user by username (used for login / security)
    public User getUserByUsername(String username) {
        return repo.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    // 💾 Save/Register user
    public User saveUser(User user) {
        return repo.save(user);
    }

    // 📋 Get all users (optional)
    public java.util.List<User> getAllUsers() {
        return repo.findAll();
    }

    // ❌ Delete user (optional)
    public void deleteUser(Long id) {
        repo.deleteById(id);
    }
}
package com.skillguru.backend.controller.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @GetMapping
    public ResponseEntity<?> getUsers() {
        return ResponseEntity.ok(Map.of(
                "message", "Get users endpoint ready",
                "endpoint", "/api/v1/users"
        ));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Get user by ID endpoint ready",
                "endpoint", "/api/v1/users/" + id,
                "id", id
        ));
    }

    @PostMapping
    public ResponseEntity<?> createUser() {
        return ResponseEntity.ok(Map.of(
                "message", "Create user endpoint ready",
                "endpoint", "/api/v1/users"
        ));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Update user endpoint ready",
                "endpoint", "/api/v1/users/" + id,
                "id", id
        ));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Delete user endpoint ready",
                "endpoint", "/api/v1/users/" + id,
                "id", id
        ));
    }

    @PatchMapping("/{id}/status")
    public ResponseEntity<?> updateUserStatus(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Update user status endpoint ready",
                "endpoint", "/api/v1/users/" + id + "/status",
                "id", id
        ));
    }

    @PatchMapping("/{id}/role")
    public ResponseEntity<?> updateUserRole(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Update user role endpoint ready",
                "endpoint", "/api/v1/users/" + id + "/role",
                "id", id
        ));
    }
}

package com.skillguru.backend.controller.auth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @PostMapping("/register")
    public ResponseEntity<?> register() {
        return ResponseEntity.ok(Map.of(
                "message", "Register endpoint ready",
                "endpoint", "/api/v1/auth/register"
        ));
    }

    @PostMapping("/login")
    public ResponseEntity<?> login() {
        return ResponseEntity.ok(Map.of(
                "message", "Login endpoint ready",
                "endpoint", "/api/v1/auth/login"
        ));
    }

    @PostMapping("/refresh")
    public ResponseEntity<?> refresh() {
        return ResponseEntity.ok(Map.of(
                "message", "Refresh token endpoint ready",
                "endpoint", "/api/v1/auth/refresh"
        ));
    }

    @PostMapping("/logout")
    public ResponseEntity<?> logout() {
        return ResponseEntity.ok(Map.of(
                "message", "Logout endpoint ready",
                "endpoint", "/api/v1/auth/logout"
        ));
    }

    @GetMapping("/me")
    public ResponseEntity<?> me() {
        return ResponseEntity.ok(Map.of(
                "message", "Current user endpoint ready",
                "endpoint", "/api/v1/auth/me"
        ));
    }

    @PostMapping("/verify-email")
    public ResponseEntity<?> verifyEmail() {
        return ResponseEntity.ok(Map.of(
                "message", "Email verification endpoint ready",
                "endpoint", "/api/v1/auth/verify-email"
        ));
    }

    @PostMapping("/resend-verification")
    public ResponseEntity<?> resendVerification() {
        return ResponseEntity.ok(Map.of(
                "message", "Resend verification endpoint ready",
                "endpoint", "/api/v1/auth/resend-verification"
        ));
    }

    @PostMapping("/forgot-password")
    public ResponseEntity<?> forgotPassword() {
        return ResponseEntity.ok(Map.of(
                "message", "Forgot password endpoint ready",
                "endpoint", "/api/v1/auth/forgot-password"
        ));
    }

    @PostMapping("/reset-password")
    public ResponseEntity<?> resetPassword() {
        return ResponseEntity.ok(Map.of(
                "message", "Reset password endpoint ready",
                "endpoint", "/api/v1/auth/reset-password"
        ));
    }

    @PostMapping("/change-password")
    public ResponseEntity<?> changePassword() {
        return ResponseEntity.ok(Map.of(
                "message", "Change password endpoint ready",
                "endpoint", "/api/v1/auth/change-password"
        ));
    }

    @PostMapping("/validate-token")
    public ResponseEntity<?> validateToken() {
        return ResponseEntity.ok(Map.of(
                "message", "Validate token endpoint ready",
                "endpoint", "/api/v1/auth/validate-token"
        ));
    }
}

package com.skillguru.backend.controller.transaction;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Transactions API
 * ============================================================
 *
 * MASTER API CATEGORY
 * No. 36 - Transactions
 *
 * Total Endpoints: 3
 *
 * API Base:
 * /api/v1
 *
 * Authentication:
 * JWT Bearer
 *
 * Roles:
 * ADMIN / TEACHER / MENTOR / STUDENT
 *
 * ============================================================
 *
 * MASTER ENDPOINTS
 *
 * 01. GET
 *     /api/v1/transactions
 *
 * 02. GET
 *     /api/v1/transactions/{id}
 *
 * 03. GET
 *     /api/v1/students/{studentId}/transactions
 *
 * ============================================================
 *
 * IMPORTANT:
 *
 * Transactions are read-oriented in the master API.
 *
 * No POST, PUT or DELETE transaction endpoint is added.
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * payment gateway integration, transaction history and
 * validation will be implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1")
public class TransactionController {

    /**
     * 01
     * GET /api/v1/transactions
     */
    @GetMapping("/transactions")
    public ResponseEntity<?> getTransactions() {
        return ResponseEntity.ok(Map.of(
                "message", "Get transactions endpoint ready",
                "endpoint", "/api/v1/transactions"
        ));
    }

    /**
     * 02
     * GET /api/v1/transactions/{id}
     */
    @GetMapping("/transactions/{id}")
    public ResponseEntity<?> getTransactionById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get transaction by ID endpoint ready",
                "endpoint", "/api/v1/transactions/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * GET /api/v1/students/{studentId}/transactions
     */
    @GetMapping("/students/{studentId}/transactions")
    public ResponseEntity<?> getStudentTransactions(
            @PathVariable Long studentId) {

        return ResponseEntity.ok(Map.of(
                "message", "Get student transactions endpoint ready",
                "endpoint",
                "/api/v1/students/" + studentId + "/transactions",
                "studentId", studentId
        ));
    }
}

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
 *     /api/v1/transactions/{id}/invoice
 *
 * ============================================================
 *
 * IMPORTANT:
 *
 * Transactions are read-only according to the master API.
 *
 * No POST, PUT, PATCH or DELETE endpoint is added.
 *
 *  * ============================================================
 */
@RestController
@RequestMapping("/api/v1/transactions")
public class TransactionController {

    /**
     * 01
     * GET /api/v1/transactions
     */
    @GetMapping
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
    @GetMapping("/{id}")
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
     * GET /api/v1/transactions/{id}/invoice
     */
    @GetMapping("/{id}/invoice")
    public ResponseEntity<?> getTransactionInvoice(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get transaction invoice endpoint ready",
                "endpoint",
                "/api/v1/transactions/" + id + "/invoice",
                "id", id
        ));
    }
}

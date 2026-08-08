package com.skillguru.backend.controller.auditlog;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Audit Logs API
 * ============================================================
 *
 * MASTER API CATEGORY
 * No. 53 - Audit Logs
 *
 * Total Endpoints: 3
 *
 * API Base:
 * /api/v1
 *
 * Authentication:
 * JWT Bearer
 *
 * ============================================================
 *
 * MASTER ENDPOINTS
 *
 * 01. GET
 *     /api/v1/audit-logs
 *
 * 02. GET
 *     /api/v1/audit-logs/{id}
 *
 * 03. GET
 *     /api/v1/users/{userId}/audit-logs
 *
 * ============================================================
 *
 * IMPORTANT:
 *
 * Audit Logs is READ-ONLY according to the Master API.
 *
 * No POST, PUT, PATCH or DELETE endpoint is added.
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, filtering,
 * pagination, audit persistence and validation will be
 * implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1")
public class AuditLogController {

    /**
     * 01
     * GET /api/v1/audit-logs
     */
    @GetMapping("/audit-logs")
    public ResponseEntity<?> getAuditLogs() {
        return ResponseEntity.ok(Map.of(
                "message", "Get audit logs endpoint ready",
                "endpoint", "/api/v1/audit-logs"
        ));
    }

    /**
     * 02
     * GET /api/v1/audit-logs/{id}
     */
    @GetMapping("/audit-logs/{id}")
    public ResponseEntity<?> getAuditLogById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get audit log by ID endpoint ready",
                "endpoint", "/api/v1/audit-logs/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * GET /api/v1/users/{userId}/audit-logs
     */
    @GetMapping("/users/{userId}/audit-logs")
    public ResponseEntity<?> getUserAuditLogs(
            @PathVariable Long userId) {

        return ResponseEntity.ok(Map.of(
                "message", "Get user audit logs endpoint ready",
                "endpoint",
                "/api/v1/users/" + userId + "/audit-logs",
                "userId", userId
        ));
    }
}

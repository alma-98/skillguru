package com.skillguru.backend.controller.permission;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Permissions API
 * ============================================================
 *
 * MASTER API CATEGORY
 * No. 51 - Permissions
 *
 * Total Endpoints: 5
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
 *     /api/v1/permissions
 *
 * 02. GET
 *     /api/v1/permissions/{id}
 *
 * 03. POST
 *     /api/v1/permissions
 *
 * 04. PUT
 *     /api/v1/permissions/{id}
 *
 * 05. DELETE
 *     /api/v1/permissions/{id}
 *
 * ============================================================
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * permission validation and role-permission relationships
 * will be implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1/permissions")
public class PermissionController {

    /**
     * 01
     * GET /api/v1/permissions
     */
    @GetMapping
    public ResponseEntity<?> getPermissions() {
        return ResponseEntity.ok(Map.of(
                "message", "Get permissions endpoint ready",
                "endpoint", "/api/v1/permissions"
        ));
    }

    /**
     * 02
     * GET /api/v1/permissions/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getPermissionById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get permission by ID endpoint ready",
                "endpoint", "/api/v1/permissions/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/permissions
     */
    @PostMapping
    public ResponseEntity<?> createPermission() {
        return ResponseEntity.ok(Map.of(
                "message", "Create permission endpoint ready",
                "endpoint", "/api/v1/permissions"
        ));
    }

    /**
     * 04
     * PUT /api/v1/permissions/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> updatePermission(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update permission endpoint ready",
                "endpoint", "/api/v1/permissions/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/permissions/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePermission(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete permission endpoint ready",
                "endpoint", "/api/v1/permissions/" + id,
                "id", id
        ));
    }
}

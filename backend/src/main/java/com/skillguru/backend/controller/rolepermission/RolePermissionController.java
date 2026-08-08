package com.skillguru.backend.controller.rolepermission;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Role Permissions API
 * ============================================================
 *
 * MASTER API CATEGORY
 * No. 52 - Role Permissions
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
 *     /api/v1/role-permissions
 *
 * 02. POST
 *     /api/v1/role-permissions
 *
 * 03. DELETE
 *     /api/v1/role-permissions/{id}
 *
 * ============================================================
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * role-permission relationship management and validation
 * will be implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1/role-permissions")
public class RolePermissionController {

    /**
     * 01
     * GET /api/v1/role-permissions
     */
    @GetMapping
    public ResponseEntity<?> getRolePermissions() {
        return ResponseEntity.ok(Map.of(
                "message", "Get role permissions endpoint ready",
                "endpoint", "/api/v1/role-permissions"
        ));
    }

    /**
     * 02
     * POST /api/v1/role-permissions
     */
    @PostMapping
    public ResponseEntity<?> createRolePermission() {
        return ResponseEntity.ok(Map.of(
                "message", "Create role permission endpoint ready",
                "endpoint", "/api/v1/role-permissions"
        ));
    }

    /**
     * 03
     * DELETE /api/v1/role-permissions/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteRolePermission(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete role permission endpoint ready",
                "endpoint", "/api/v1/role-permissions/" + id,
                "id", id
        ));
    }
}

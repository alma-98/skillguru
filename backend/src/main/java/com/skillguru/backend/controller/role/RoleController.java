package com.skillguru.backend.controller.role;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Roles API
 * ============================================================
 *
 * MASTER API CATEGORY
 * No. 50 - Roles
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
 *     /api/v1/roles
 *
 * 02. GET
 *     /api/v1/roles/{id}
 *
 * 03. POST
 *     /api/v1/roles
 *
 * 04. PUT
 *     /api/v1/roles/{id}
 *
 * 05. DELETE
 *     /api/v1/roles/{id}
 *
 * ============================================================
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * permission relationships and validation will be
 * implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1/roles")
public class RoleController {

    /**
     * 01
     * GET /api/v1/roles
     */
    @GetMapping
    public ResponseEntity<?> getRoles() {
        return ResponseEntity.ok(Map.of(
                "message", "Get roles endpoint ready",
                "endpoint", "/api/v1/roles"
        ));
    }

    /**
     * 02
     * GET /api/v1/roles/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getRoleById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get role by ID endpoint ready",
                "endpoint", "/api/v1/roles/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/roles
     */
    @PostMapping
    public ResponseEntity<?> createRole() {
        return ResponseEntity.ok(Map.of(
                "message", "Create role endpoint ready",
                "endpoint", "/api/v1/roles"
        ));
    }

    /**
     * 04
     * PUT /api/v1/roles/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> updateRole(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update role endpoint ready",
                "endpoint", "/api/v1/roles/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/roles/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteRole(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete role endpoint ready",
                "endpoint", "/api/v1/roles/" + id,
                "id", id
        ));
    }
}

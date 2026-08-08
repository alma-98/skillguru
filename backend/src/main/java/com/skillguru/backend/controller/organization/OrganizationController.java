package com.skillguru.backend.controller.organization;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Organizations API
 * ============================================================
 *
 * MASTER API CATEGORY
 * No. 55 - Organizations
 *
 * Total Endpoints: 5
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
 *     /api/v1/organizations
 *
 * 02. GET
 *     /api/v1/organizations/{id}
 *
 * 03. POST
 *     /api/v1/organizations
 *
 * 04. PUT
 *     /api/v1/organizations/{id}
 *
 * 05. DELETE
 *     /api/v1/organizations/{id}
 *
 * ============================================================
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * organization management and validation will be
 * implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1/organizations")
public class OrganizationController {

    /**
     * 01
     * GET /api/v1/organizations
     */
    @GetMapping
    public ResponseEntity<?> getOrganizations() {
        return ResponseEntity.ok(Map.of(
                "message", "Get organizations endpoint ready",
                "endpoint", "/api/v1/organizations"
        ));
    }

    /**
     * 02
     * GET /api/v1/organizations/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getOrganizationById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get organization by ID endpoint ready",
                "endpoint", "/api/v1/organizations/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/organizations
     */
    @PostMapping
    public ResponseEntity<?> createOrganization() {
        return ResponseEntity.ok(Map.of(
                "message", "Create organization endpoint ready",
                "endpoint", "/api/v1/organizations"
        ));
    }

    /**
     * 04
     * PUT /api/v1/organizations/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> updateOrganization(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update organization endpoint ready",
                "endpoint", "/api/v1/organizations/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/organizations/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteOrganization(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete organization endpoint ready",
                "endpoint", "/api/v1/organizations/" + id,
                "id", id
        ));
    }
}

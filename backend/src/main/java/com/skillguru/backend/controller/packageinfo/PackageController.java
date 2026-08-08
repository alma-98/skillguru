package com.skillguru.backend.controller.packageinfo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Packages API
 * ============================================================
 *
 * MASTER API CATEGORY
 * No. 37 - Packages
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
 *     /api/v1/packages
 *
 * 02. GET
 *     /api/v1/packages/{id}
 *
 * 03. POST
 *     /api/v1/packages
 *
 * 04. PUT
 *     /api/v1/packages/{id}
 *
 * 05. DELETE
 *     /api/v1/packages/{id}
 *
 * ============================================================
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * package-course relationships, pricing and validation
 * will be implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1/packages")
public class PackageController {

    /**
     * 01
     * GET /api/v1/packages
     */
    @GetMapping
    public ResponseEntity<?> getPackages() {
        return ResponseEntity.ok(Map.of(
                "message", "Get packages endpoint ready",
                "endpoint", "/api/v1/packages"
        ));
    }

    /**
     * 02
     * GET /api/v1/packages/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getPackageById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get package by ID endpoint ready",
                "endpoint", "/api/v1/packages/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/packages
     */
    @PostMapping
    public ResponseEntity<?> createPackage() {
        return ResponseEntity.ok(Map.of(
                "message", "Create package endpoint ready",
                "endpoint", "/api/v1/packages"
        ));
    }

    /**
     * 04
     * PUT /api/v1/packages/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> updatePackage(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update package endpoint ready",
                "endpoint", "/api/v1/packages/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/packages/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePackage(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete package endpoint ready",
                "endpoint", "/api/v1/packages/" + id,
                "id", id
        ));
    }
}

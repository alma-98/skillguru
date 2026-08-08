package com.skillguru.backend.controller.institution;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Institutions API
 * ============================================================
 *
 * MASTER API CATEGORY
 * No. 56 - Institutions
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
 *     /api/v1/institutions
 *
 * 02. GET
 *     /api/v1/institutions/{id}
 *
 * 03. POST
 *     /api/v1/institutions
 *
 * 04. PUT
 *     /api/v1/institutions/{id}
 *
 * 05. DELETE
 *     /api/v1/institutions/{id}
 *
 * ============================================================
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * institution management and validation will be
 * implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1/institutions")
public class InstitutionController {

    /**
     * 01
     * GET /api/v1/institutions
     */
    @GetMapping
    public ResponseEntity<?> getInstitutions() {
        return ResponseEntity.ok(Map.of(
                "message", "Get institutions endpoint ready",
                "endpoint", "/api/v1/institutions"
        ));
    }

    /**
     * 02
     * GET /api/v1/institutions/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getInstitutionById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get institution by ID endpoint ready",
                "endpoint", "/api/v1/institutions/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/institutions
     */
    @PostMapping
    public ResponseEntity<?> createInstitution() {
        return ResponseEntity.ok(Map.of(
                "message", "Create institution endpoint ready",
                "endpoint", "/api/v1/institutions"
        ));
    }

    /**
     * 04
     * PUT /api/v1/institutions/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> updateInstitution(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update institution endpoint ready",
                "endpoint", "/api/v1/institutions/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/institutions/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteInstitution(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete institution endpoint ready",
                "endpoint", "/api/v1/institutions/" + id,
                "id", id
        ));
    }
}

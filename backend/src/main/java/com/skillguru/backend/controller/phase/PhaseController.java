package com.skillguru.backend.controller.phase;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Phases API
 * ============================================================
 *
 * API Base:
 * /api/v1/phases
 *
 * Authentication:
 * JWT Bearer
 *
 * Roles:
 * ADMIN / TEACHER / MENTOR / STUDENT
 *
 * ============================================================
 *
 * MASTER API ENDPOINTS - GROUP 09
 *
 * 01. GET
 *     /api/v1/phases
 *     List all phases
 *
 * 02. GET
 *     /api/v1/phases/{id}
 *     Get phase detail
 *
 * 03. POST
 *     /api/v1/phases
 *     Create phase
 *
 * 04. PUT
 *     /api/v1/phases/{id}
 *     Update phase
 *
 * 05. DELETE
 *     /api/v1/phases/{id}
 *     Delete phase
 *
 * ============================================================
 * Master API:
 * SkillGuru_Master_API_Swagger_v1.xlsx
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * JWT authorization and validation will be implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1/phases")
public class PhaseController {

    /**
     * 01
     * GET /api/v1/phases
     */
    @GetMapping
    public ResponseEntity<?> getPhases() {
        return ResponseEntity.ok(Map.of(
                "message", "Get phases endpoint ready",
                "endpoint", "/api/v1/phases"
        ));
    }

    /**
     * 02
     * GET /api/v1/phases/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getPhaseById(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Get phase by ID endpoint ready",
                "endpoint", "/api/v1/phases/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/phases
     */
    @PostMapping
    public ResponseEntity<?> createPhase() {
        return ResponseEntity.ok(Map.of(
                "message", "Create phase endpoint ready",
                "endpoint", "/api/v1/phases"
        ));
    }

    /**
     * 04
     * PUT /api/v1/phases/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> updatePhase(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Update phase endpoint ready",
                "endpoint", "/api/v1/phases/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/phases/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePhase(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Delete phase endpoint ready",
                "endpoint", "/api/v1/phases/" + id,
                "id", id
        ));
    }
}

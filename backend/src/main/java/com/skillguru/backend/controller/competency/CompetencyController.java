package com.skillguru.backend.controller.competency;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Competencies API
 * ============================================================
 *
 * API Base:
 * /api/v1/competencies
 *
 * Authentication:
 * JWT Bearer
 *
 * Roles:
 * ADMIN / TEACHER / MENTOR / STUDENT
 *
 * ============================================================
 *
 * MASTER API ENDPOINTS - GROUP 11
 *
 * 01. GET
 *     /api/v1/competencies
 *     List all competencies
 *
 * 02. GET
 *     /api/v1/competencies/{id}
 *     Get competency detail
 *
 * 03. POST
 *     /api/v1/competencies
 *     Create competency
 *
 * 04. PUT
 *     /api/v1/competencies/{id}
 *     Update competency
 *
 * 05. DELETE
 *     /api/v1/competencies/{id}
 *     Delete competency
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
@RequestMapping("/api/v1/competencies")
public class CompetencyController {

    /**
     * 01
     * GET /api/v1/competencies
     */
    @GetMapping
    public ResponseEntity<?> getCompetencies() {
        return ResponseEntity.ok(Map.of(
                "message", "Get competencies endpoint ready",
                "endpoint", "/api/v1/competencies"
        ));
    }

    /**
     * 02
     * GET /api/v1/competencies/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getCompetencyById(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Get competency by ID endpoint ready",
                "endpoint", "/api/v1/competencies/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/competencies
     */
    @PostMapping
    public ResponseEntity<?> createCompetency() {
        return ResponseEntity.ok(Map.of(
                "message", "Create competency endpoint ready",
                "endpoint", "/api/v1/competencies"
        ));
    }

    /**
     * 04
     * PUT /api/v1/competencies/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> updateCompetency(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Update competency endpoint ready",
                "endpoint", "/api/v1/competencies/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/competencies/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCompetency(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Delete competency endpoint ready",
                "endpoint", "/api/v1/competencies/" + id,
                "id", id
        ));
    }
}

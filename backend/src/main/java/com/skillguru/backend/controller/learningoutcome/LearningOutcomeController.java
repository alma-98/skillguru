package com.skillguru.backend.controller.learningoutcome;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Learning Outcomes API
 * ============================================================
 *
 * API Base:
 * /api/v1/learning-outcomes
 *
 * Authentication:
 * JWT Bearer
 *
 * Roles:
 * ADMIN / TEACHER / MENTOR / STUDENT
 *
 * ============================================================
 *
 * MASTER API ENDPOINTS - GROUP 12
 *
 * 01. GET
 *     /api/v1/learning-outcomes
 *     List all learning outcomes
 *
 * 02. GET
 *     /api/v1/learning-outcomes/{id}
 *     Get learning outcome detail
 *
 * 03. POST
 *     /api/v1/learning-outcomes
 *     Create learning outcome
 *
 * 04. PUT
 *     /api/v1/learning-outcomes/{id}
 *     Update learning outcome
 *
 * 05. DELETE
 *     /api/v1/learning-outcomes/{id}
 *     Delete learning outcome
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
@RequestMapping("/api/v1/learning-outcomes")
public class LearningOutcomeController {

    /**
     * 01
     * GET /api/v1/learning-outcomes
     */
    @GetMapping
    public ResponseEntity<?> getLearningOutcomes() {
        return ResponseEntity.ok(Map.of(
                "message", "Get learning outcomes endpoint ready",
                "endpoint", "/api/v1/learning-outcomes"
        ));
    }

    /**
     * 02
     * GET /api/v1/learning-outcomes/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getLearningOutcomeById(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Get learning outcome by ID endpoint ready",
                "endpoint", "/api/v1/learning-outcomes/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/learning-outcomes
     */
    @PostMapping
    public ResponseEntity<?> createLearningOutcome() {
        return ResponseEntity.ok(Map.of(
                "message", "Create learning outcome endpoint ready",
                "endpoint", "/api/v1/learning-outcomes"
        ));
    }

    /**
     * 04
     * PUT /api/v1/learning-outcomes/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> updateLearningOutcome(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Update learning outcome endpoint ready",
                "endpoint", "/api/v1/learning-outcomes/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/learning-outcomes/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteLearningOutcome(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Delete learning outcome endpoint ready",
                "endpoint", "/api/v1/learning-outcomes/" + id,
                "id", id
        ));
    }
}

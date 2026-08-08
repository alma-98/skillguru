package com.skillguru.backend.controller.learningobjective;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Learning Objectives API
 * ============================================================
 *
 * API Base:
 * /api/v1/learning-objectives
 *
 * Authentication:
 * JWT Bearer
 *
 * Roles:
 * ADMIN / TEACHER / MENTOR / STUDENT
 *
 * ============================================================
 *
 * MASTER API ENDPOINTS - GROUP 13
 *
 * 01. GET
 *     /api/v1/learning-objectives
 *     List all learning objectives
 *
 * 02. GET
 *     /api/v1/learning-objectives/{id}
 *     Get learning objective detail
 *
 * 03. POST
 *     /api/v1/learning-objectives
 *     Create learning objective
 *
 * 04. PUT
 *     /api/v1/learning-objectives/{id}
 *     Update learning objective
 *
 * 05. DELETE
 *     /api/v1/learning-objectives/{id}
 *     Delete learning objective
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
@RequestMapping("/api/v1/learning-objectives")
public class LearningObjectiveController {

    /**
     * 01
     * GET /api/v1/learning-objectives
     */
    @GetMapping
    public ResponseEntity<?> getLearningObjectives() {
        return ResponseEntity.ok(Map.of(
                "message", "Get learning objectives endpoint ready",
                "endpoint", "/api/v1/learning-objectives"
        ));
    }

    /**
     * 02
     * GET /api/v1/learning-objectives/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getLearningObjectiveById(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Get learning objective by ID endpoint ready",
                "endpoint", "/api/v1/learning-objectives/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/learning-objectives
     */
    @PostMapping
    public ResponseEntity<?> createLearningObjective() {
        return ResponseEntity.ok(Map.of(
                "message", "Create learning objective endpoint ready",
                "endpoint", "/api/v1/learning-objectives"
        ));
    }

    /**
     * 04
     * PUT /api/v1/learning-objectives/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> updateLearningObjective(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Update learning objective endpoint ready",
                "endpoint", "/api/v1/learning-objectives/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/learning-objectives/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteLearningObjective(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Delete learning objective endpoint ready",
                "endpoint", "/api/v1/learning-objectives/" + id,
                "id", id
        ));
    }
}

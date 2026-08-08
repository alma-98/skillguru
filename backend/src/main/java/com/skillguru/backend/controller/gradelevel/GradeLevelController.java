package com.skillguru.backend.controller.gradelevel;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Grade Levels API
 * ============================================================
 *
 * API Base:
 * /api/v1/grade-levels
 *
 * Authentication:
 * JWT Bearer
 *
 * Roles:
 * ADMIN / TEACHER / MENTOR / STUDENT
 *
 * ============================================================
 *
 * MASTER API ENDPOINTS - GROUP 08
 *
 * 01. GET
 *     /api/v1/grade-levels
 *     List all grade levels
 *
 * 02. GET
 *     /api/v1/grade-levels/{id}
 *     Get grade level detail
 *
 * 03. POST
 *     /api/v1/grade-levels
 *     Create grade level
 *
 * 04. PUT
 *     /api/v1/grade-levels/{id}
 *     Update grade level
 *
 * 05. DELETE
 *     /api/v1/grade-levels/{id}
 *     Delete grade level
 *
 * ============================================================
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * JWT authorization and validation will be implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1/grade-levels")
public class GradeLevelController {

    /**
     * 01
     * GET /api/v1/grade-levels
     */
    @GetMapping
    public ResponseEntity<?> getGradeLevels() {
        return ResponseEntity.ok(Map.of(
                "message", "Get grade levels endpoint ready",
                "endpoint", "/api/v1/grade-levels"
        ));
    }

    /**
     * 02
     * GET /api/v1/grade-levels/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getGradeLevelById(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Get grade level by ID endpoint ready",
                "endpoint", "/api/v1/grade-levels/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/grade-levels
     */
    @PostMapping
    public ResponseEntity<?> createGradeLevel() {
        return ResponseEntity.ok(Map.of(
                "message", "Create grade level endpoint ready",
                "endpoint", "/api/v1/grade-levels"
        ));
    }

    /**
     * 04
     * PUT /api/v1/grade-levels/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> updateGradeLevel(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Update grade level endpoint ready",
                "endpoint", "/api/v1/grade-levels/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/grade-levels/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteGradeLevel(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Delete grade level endpoint ready",
                "endpoint", "/api/v1/grade-levels/" + id,
                "id", id
        ));
    }
}

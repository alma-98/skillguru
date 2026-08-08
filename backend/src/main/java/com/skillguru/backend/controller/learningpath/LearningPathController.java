package com.skillguru.backend.controller.learningpath;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Learning Paths API
 * ============================================================
 *
 * MASTER API CATEGORY
 * No. 48 - Learning Paths
 *
 * Total Endpoints: 6
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
 *     /api/v1/learning-paths
 *
 * 02. GET
 *     /api/v1/learning-paths/{id}
 *
 * 03. POST
 *     /api/v1/learning-paths
 *
 * 04. PUT
 *     /api/v1/learning-paths/{id}
 *
 * 05. DELETE
 *     /api/v1/learning-paths/{id}
 *
 * 06. GET
 *     /api/v1/learning-paths/{id}/courses
 *
 * ============================================================
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * learning-path/course relationships and validation will
 * be implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1/learning-paths")
public class LearningPathController {

    /**
     * 01
     * GET /api/v1/learning-paths
     */
    @GetMapping
    public ResponseEntity<?> getLearningPaths() {
        return ResponseEntity.ok(Map.of(
                "message", "Get learning paths endpoint ready",
                "endpoint", "/api/v1/learning-paths"
        ));
    }

    /**
     * 02
     * GET /api/v1/learning-paths/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getLearningPathById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get learning path by ID endpoint ready",
                "endpoint", "/api/v1/learning-paths/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/learning-paths
     */
    @PostMapping
    public ResponseEntity<?> createLearningPath() {
        return ResponseEntity.ok(Map.of(
                "message", "Create learning path endpoint ready",
                "endpoint", "/api/v1/learning-paths"
        ));
    }

    /**
     * 04
     * PUT /api/v1/learning-paths/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> updateLearningPath(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update learning path endpoint ready",
                "endpoint", "/api/v1/learning-paths/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/learning-paths/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteLearningPath(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete learning path endpoint ready",
                "endpoint", "/api/v1/learning-paths/" + id,
                "id", id
        ));
    }

    /**
     * 06
     * GET /api/v1/learning-paths/{id}/courses
     */
    @GetMapping("/{id}/courses")
    public ResponseEntity<?> getLearningPathCourses(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get learning path courses endpoint ready",
                "endpoint",
                "/api/v1/learning-paths/" + id + "/courses",
                "id", id
        ));
    }
}

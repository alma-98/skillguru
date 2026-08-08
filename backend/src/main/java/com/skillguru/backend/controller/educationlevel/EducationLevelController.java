package com.skillguru.backend.controller.educationlevel;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Education Levels API
 * ============================================================
 *
 * API Base:
 * /api/v1/education-levels
 *
 * Authentication:
 * JWT Bearer
 *
 * Roles:
 * ADMIN / TEACHER / MENTOR / STUDENT
 *
 * ============================================================
 *
 * MASTER API ENDPOINTS - GROUP 07
 *
 * 01. GET
 *     /api/v1/education-levels
 *     List all education levels
 *
 * 02. GET
 *     /api/v1/education-levels/{id}
 *     Get education level detail
 *
 * 03. POST
 *     /api/v1/education-levels
 *     Create education level
 *
 * 04. PUT
 *     /api/v1/education-levels/{id}
 *     Update education level
 *
 * 05. DELETE
 *     /api/v1/education-levels/{id}
 *     Delete education level
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
@RequestMapping("/api/v1/education-levels")
public class EducationLevelController {

    /**
     * 01
     * GET /api/v1/education-levels
     */
    @GetMapping
    public ResponseEntity<?> getEducationLevels() {
        return ResponseEntity.ok(Map.of(
                "message", "Get education levels endpoint ready",
                "endpoint", "/api/v1/education-levels"
        ));
    }

    /**
     * 02
     * GET /api/v1/education-levels/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getEducationLevelById(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Get education level by ID endpoint ready",
                "endpoint", "/api/v1/education-levels/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/education-levels
     */
    @PostMapping
    public ResponseEntity<?> createEducationLevel() {
        return ResponseEntity.ok(Map.of(
                "message", "Create education level endpoint ready",
                "endpoint", "/api/v1/education-levels"
        ));
    }

    /**
     * 04
     * PUT /api/v1/education-levels/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> updateEducationLevel(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Update education level endpoint ready",
                "endpoint", "/api/v1/education-levels/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/education-levels/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEducationLevel(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Delete education level endpoint ready",
                "endpoint", "/api/v1/education-levels/" + id,
                "id", id
        ));
    }
}

package com.skillguru.backend.controller.progress;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Progress API
 * ============================================================
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
 * MASTER API ENDPOINTS - GROUP 26
 *
 * 01. GET
 *     /api/v1/progress
 *     List all progress records
 *
 * 02. GET
 *     /api/v1/progress/{id}
 *     Get progress detail
 *
 * 03. POST
 *     /api/v1/progress
 *     Create progress record
 *
 * 04. PUT
 *     /api/v1/progress/{id}
 *     Update progress record
 *
 * 05. DELETE
 *     /api/v1/progress/{id}
 *     Delete progress record
 *
 * 06. GET
 *     /api/v1/students/{studentId}/progress
 *     Get progress belonging to a student
 *
 * 07. GET
 *     /api/v1/courses/{courseId}/progress
 *     Get progress belonging to a course
 *
 * ============================================================
 * Master API:
 * SkillGuru_Master_API_Swagger_v1.xlsx
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * JWT authorization, progress calculation and validation
 * will be implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1")
public class ProgressController {

    /**
     * 01
     * GET /api/v1/progress
     */
    @GetMapping("/progress")
    public ResponseEntity<?> getProgress() {
        return ResponseEntity.ok(Map.of(
                "message", "Get progress endpoint ready",
                "endpoint", "/api/v1/progress"
        ));
    }

    /**
     * 02
     * GET /api/v1/progress/{id}
     */
    @GetMapping("/progress/{id}")
    public ResponseEntity<?> getProgressById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get progress by ID endpoint ready",
                "endpoint", "/api/v1/progress/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/progress
     */
    @PostMapping("/progress")
    public ResponseEntity<?> createProgress() {
        return ResponseEntity.ok(Map.of(
                "message", "Create progress endpoint ready",
                "endpoint", "/api/v1/progress"
        ));
    }

    /**
     * 04
     * PUT /api/v1/progress/{id}
     */
    @PutMapping("/progress/{id}")
    public ResponseEntity<?> updateProgress(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update progress endpoint ready",
                "endpoint", "/api/v1/progress/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/progress/{id}
     */
    @DeleteMapping("/progress/{id}")
    public ResponseEntity<?> deleteProgress(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete progress endpoint ready",
                "endpoint", "/api/v1/progress/" + id,
                "id", id
        ));
    }

    /**
     * 06
     * GET /api/v1/students/{studentId}/progress
     */
    @GetMapping("/students/{studentId}/progress")
    public ResponseEntity<?> getStudentProgress(
            @PathVariable Long studentId) {

        return ResponseEntity.ok(Map.of(
                "message", "Get student progress endpoint ready",
                "endpoint", "/api/v1/students/" + studentId + "/progress",
                "studentId", studentId
        ));
    }

    /**
     * 07
     * GET /api/v1/courses/{courseId}/progress
     */
    @GetMapping("/courses/{courseId}/progress")
    public ResponseEntity<?> getCourseProgress(
            @PathVariable Long courseId) {

        return ResponseEntity.ok(Map.of(
                "message", "Get course progress endpoint ready",
                "endpoint", "/api/v1/courses/" + courseId + "/progress",
                "courseId", courseId
        ));
    }
}

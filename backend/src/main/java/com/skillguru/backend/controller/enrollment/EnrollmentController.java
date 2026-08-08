package com.skillguru.backend.controller.enrollment;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Enrollments API
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
 * MASTER API ENDPOINTS - GROUP 25
 *
 * 01. GET
 *     /api/v1/enrollments
 *     List all enrollments
 *
 * 02. GET
 *     /api/v1/enrollments/{id}
 *     Get enrollment detail
 *
 * 03. POST
 *     /api/v1/enrollments
 *     Create enrollment
 *
 * 04. PATCH
 *     /api/v1/enrollments/{id}/status
 *     Update enrollment status
 *
 * 05. DELETE
 *     /api/v1/enrollments/{id}
 *     Delete enrollment
 *
 * 06. GET
 *     /api/v1/students/{studentId}/enrollments
 *     Get enrollments belonging to a student
 *
 * 07. GET
 *     /api/v1/courses/{courseId}/enrollments
 *     Get enrollments belonging to a course
 *
 * ============================================================
 * Master API:
 * SkillGuru_Master_API_Swagger_v1.xlsx
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * JWT authorization, enrollment validation and status
 * management will be implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1")
public class EnrollmentController {

    /**
     * 01
     * GET /api/v1/enrollments
     */
    @GetMapping("/enrollments")
    public ResponseEntity<?> getEnrollments() {
        return ResponseEntity.ok(Map.of(
                "message", "Get enrollments endpoint ready",
                "endpoint", "/api/v1/enrollments"
        ));
    }

    /**
     * 02
     * GET /api/v1/enrollments/{id}
     */
    @GetMapping("/enrollments/{id}")
    public ResponseEntity<?> getEnrollmentById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get enrollment by ID endpoint ready",
                "endpoint", "/api/v1/enrollments/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/enrollments
     */
    @PostMapping("/enrollments")
    public ResponseEntity<?> createEnrollment() {
        return ResponseEntity.ok(Map.of(
                "message", "Create enrollment endpoint ready",
                "endpoint", "/api/v1/enrollments"
        ));
    }

    /**
     * 04
     * PATCH /api/v1/enrollments/{id}/status
     */
    @PatchMapping("/enrollments/{id}/status")
    public ResponseEntity<?> updateEnrollmentStatus(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update enrollment status endpoint ready",
                "endpoint", "/api/v1/enrollments/" + id + "/status",
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/enrollments/{id}
     */
    @DeleteMapping("/enrollments/{id}")
    public ResponseEntity<?> deleteEnrollment(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete enrollment endpoint ready",
                "endpoint", "/api/v1/enrollments/" + id,
                "id", id
        ));
    }

    /**
     * 06
     * GET /api/v1/students/{studentId}/enrollments
     */
    @GetMapping("/students/{studentId}/enrollments")
    public ResponseEntity<?> getStudentEnrollments(
            @PathVariable Long studentId) {

        return ResponseEntity.ok(Map.of(
                "message", "Get student enrollments endpoint ready",
                "endpoint", "/api/v1/students/" + studentId + "/enrollments",
                "studentId", studentId
        ));
    }

    /**
     * 07
     * GET /api/v1/courses/{courseId}/enrollments
     */
    @GetMapping("/courses/{courseId}/enrollments")
    public ResponseEntity<?> getCourseEnrollments(
            @PathVariable Long courseId) {

        return ResponseEntity.ok(Map.of(
                "message", "Get course enrollments endpoint ready",
                "endpoint", "/api/v1/courses/" + courseId + "/enrollments",
                "courseId", courseId
        ));
    }
}

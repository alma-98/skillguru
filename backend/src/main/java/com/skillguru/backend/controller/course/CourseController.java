package com.skillguru.backend.controller.course;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Courses API
 * ============================================================
 *
 * API Base:
 * /api/v1/courses
 *
 * Authentication:
 * JWT Bearer
 *
 * Roles:
 * ADMIN / TEACHER / MENTOR / STUDENT
 *
 * ============================================================
 *
 * MASTER API ENDPOINTS - GROUP 16
 *
 * 01. GET
 *     /api/v1/courses
 *     List all courses
 *
 * 02. GET
 *     /api/v1/courses/{id}
 *     Get course detail
 *
 * 03. POST
 *     /api/v1/courses
 *     Create course
 *
 * 04. PUT
 *     /api/v1/courses/{id}
 *     Update course
 *
 * 05. PATCH
 *     /api/v1/courses/{id}/status
 *     Update course status
 *
 * 06. DELETE
 *     /api/v1/courses/{id}
 *     Delete course
 *
 * 07. POST
 *     /api/v1/courses/{id}/publish
 *     Publish course
 *
 * 08. POST
 *     /api/v1/courses/{id}/unpublish
 *     Unpublish course
 *
 * 09. GET
 *     /api/v1/courses/{id}/students
 *     Get enrolled students
 *
 * 10. GET
 *     /api/v1/courses/{id}/teachers
 *     Get course teachers
 *
 * 11. GET
 *     /api/v1/courses/{id}/progress
 *     Get course progress
 *
 * 12. GET
 *     /api/v1/courses/{id}/reviews
 *     Get course reviews
 *
 * 13. GET
 *     /api/v1/courses/{id}/analytics
 *     Get course analytics
 *
 * 14. GET
 *     /api/v1/courses/{id}/curriculum
 *     Get course curriculum
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
@RequestMapping("/api/v1/courses")
public class CourseController {

    /**
     * 01
     * GET /api/v1/courses
     */
    @GetMapping
    public ResponseEntity<?> getCourses() {
        return ResponseEntity.ok(Map.of(
                "message", "Get courses endpoint ready",
                "endpoint", "/api/v1/courses"
        ));
    }

    /**
     * 02
     * GET /api/v1/courses/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getCourseById(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Get course by ID endpoint ready",
                "endpoint", "/api/v1/courses/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/courses
     */
    @PostMapping
    public ResponseEntity<?> createCourse() {
        return ResponseEntity.ok(Map.of(
                "message", "Create course endpoint ready",
                "endpoint", "/api/v1/courses"
        ));
    }

    /**
     * 04
     * PUT /api/v1/courses/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> updateCourse(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Update course endpoint ready",
                "endpoint", "/api/v1/courses/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * PATCH /api/v1/courses/{id}/status
     */
    @PatchMapping("/{id}/status")
    public ResponseEntity<?> updateCourseStatus(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Update course status endpoint ready",
                "endpoint", "/api/v1/courses/" + id + "/status",
                "id", id
        ));
    }

    /**
     * 06
     * DELETE /api/v1/courses/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCourse(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Delete course endpoint ready",
                "endpoint", "/api/v1/courses/" + id,
                "id", id
        ));
    }

    /**
     * 07
     * POST /api/v1/courses/{id}/publish
     */
    @PostMapping("/{id}/publish")
    public ResponseEntity<?> publishCourse(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Publish course endpoint ready",
                "endpoint", "/api/v1/courses/" + id + "/publish",
                "id", id
        ));
    }

    /**
     * 08
     * POST /api/v1/courses/{id}/unpublish
     */
    @PostMapping("/{id}/unpublish")
    public ResponseEntity<?> unpublishCourse(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Unpublish course endpoint ready",
                "endpoint", "/api/v1/courses/" + id + "/unpublish",
                "id", id
        ));
    }

    /**
     * 09
     * GET /api/v1/courses/{id}/students
     */
    @GetMapping("/{id}/students")
    public ResponseEntity<?> getCourseStudents(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Course students endpoint ready",
                "endpoint", "/api/v1/courses/" + id + "/students",
                "id", id
        ));
    }

    /**
     * 10
     * GET /api/v1/courses/{id}/teachers
     */
    @GetMapping("/{id}/teachers")
    public ResponseEntity<?> getCourseTeachers(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Course teachers endpoint ready",
                "endpoint", "/api/v1/courses/" + id + "/teachers",
                "id", id
        ));
    }

    /**
     * 11
     * GET /api/v1/courses/{id}/progress
     */
    @GetMapping("/{id}/progress")
    public ResponseEntity<?> getCourseProgress(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Course progress endpoint ready",
                "endpoint", "/api/v1/courses/" + id + "/progress",
                "id", id
        ));
    }

    /**
     * 12
     * GET /api/v1/courses/{id}/reviews
     */
    @GetMapping("/{id}/reviews")
    public ResponseEntity<?> getCourseReviews(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Course reviews endpoint ready",
                "endpoint", "/api/v1/courses/" + id + "/reviews",
                "id", id
        ));
    }

    /**
     * 13
     * GET /api/v1/courses/{id}/analytics
     */
    @GetMapping("/{id}/analytics")
    public ResponseEntity<?> getCourseAnalytics(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Course analytics endpoint ready",
                "endpoint", "/api/v1/courses/" + id + "/analytics",
                "id", id
        ));
    }

    /**
     * 14
     * GET /api/v1/courses/{id}/curriculum
     */
    @GetMapping("/{id}/curriculum")
    public ResponseEntity<?> getCourseCurriculum(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Course curriculum endpoint ready",
                "endpoint", "/api/v1/courses/" + id + "/curriculum",
                "id", id
        ));
    }
}

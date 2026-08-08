package com.skillguru.backend.controller.lesson;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Lessons API
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
 * MASTER API ENDPOINTS - GROUP 18
 *
 * 01. GET
 *     /api/v1/courses/{courseId}/lessons
 *     List lessons belonging to a course
 *
 * 02. GET
 *     /api/v1/lessons/{id}
 *     Get lesson detail
 *
 * 03. POST
 *     /api/v1/lessons
 *     Create lesson
 *
 * 04. PUT
 *     /api/v1/lessons/{id}
 *     Update lesson
 *
 * 05. DELETE
 *     /api/v1/lessons/{id}
 *     Delete lesson
 *
 * 06. PATCH
 *     /api/v1/lessons/{id}/order
 *     Update lesson order
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
@RequestMapping("/api/v1")
public class LessonController {

    /**
     * 01
     * GET /api/v1/courses/{courseId}/lessons
     */
    @GetMapping("/courses/{courseId}/lessons")
    public ResponseEntity<?> getCourseLessons(
            @PathVariable Long courseId) {

        return ResponseEntity.ok(Map.of(
                "message", "Get course lessons endpoint ready",
                "endpoint", "/api/v1/courses/" + courseId + "/lessons",
                "courseId", courseId
        ));
    }

    /**
     * 02
     * GET /api/v1/lessons/{id}
     */
    @GetMapping("/lessons/{id}")
    public ResponseEntity<?> getLessonById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get lesson by ID endpoint ready",
                "endpoint", "/api/v1/lessons/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/lessons
     */
    @PostMapping("/lessons")
    public ResponseEntity<?> createLesson() {

        return ResponseEntity.ok(Map.of(
                "message", "Create lesson endpoint ready",
                "endpoint", "/api/v1/lessons"
        ));
    }

    /**
     * 04
     * PUT /api/v1/lessons/{id}
     */
    @PutMapping("/lessons/{id}")
    public ResponseEntity<?> updateLesson(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update lesson endpoint ready",
                "endpoint", "/api/v1/lessons/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/lessons/{id}
     */
    @DeleteMapping("/lessons/{id}")
    public ResponseEntity<?> deleteLesson(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete lesson endpoint ready",
                "endpoint", "/api/v1/lessons/" + id,
                "id", id
        ));
    }

    /**
     * 06
     * PATCH /api/v1/lessons/{id}/order
     */
    @PatchMapping("/lessons/{id}/order")
    public ResponseEntity<?> updateLessonOrder(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update lesson order endpoint ready",
                "endpoint", "/api/v1/lessons/" + id + "/order",
                "id", id
        ));
    }
}

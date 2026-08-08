package com.skillguru.backend.controller.review;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Reviews & Ratings API
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
 * MASTER API ENDPOINTS - GROUP 28
 *
 * 01. GET
 *     /api/v1/reviews
 *     List all reviews
 *
 * 02. GET
 *     /api/v1/reviews/{id}
 *     Get review detail
 *
 * 03. POST
 *     /api/v1/courses/{courseId}/reviews
 *     Create review for a course
 *
 * 04. PUT
 *     /api/v1/reviews/{id}
 *     Update review
 *
 * 05. DELETE
 *     /api/v1/reviews/{id}
 *     Delete review
 *
 * 06. GET
 *     /api/v1/courses/{courseId}/rating
 *     Get course rating
 *
 * ============================================================
 * Master API:
 * SkillGuru_Master_API_Swagger_v1.xlsx
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * JWT authorization, rating calculation and validation
 * will be implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1")
public class ReviewController {

    /**
     * 01
     * GET /api/v1/reviews
     */
    @GetMapping("/reviews")
    public ResponseEntity<?> getReviews() {
        return ResponseEntity.ok(Map.of(
                "message", "Get reviews endpoint ready",
                "endpoint", "/api/v1/reviews"
        ));
    }

    /**
     * 02
     * GET /api/v1/reviews/{id}
     */
    @GetMapping("/reviews/{id}")
    public ResponseEntity<?> getReviewById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get review by ID endpoint ready",
                "endpoint", "/api/v1/reviews/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/courses/{courseId}/reviews
     */
    @PostMapping("/courses/{courseId}/reviews")
    public ResponseEntity<?> createCourseReview(
            @PathVariable Long courseId) {

        return ResponseEntity.ok(Map.of(
                "message", "Create course review endpoint ready",
                "endpoint", "/api/v1/courses/" + courseId + "/reviews",
                "courseId", courseId
        ));
    }

    /**
     * 04
     * PUT /api/v1/reviews/{id}
     */
    @PutMapping("/reviews/{id}")
    public ResponseEntity<?> updateReview(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update review endpoint ready",
                "endpoint", "/api/v1/reviews/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/reviews/{id}
     */
    @DeleteMapping("/reviews/{id}")
    public ResponseEntity<?> deleteReview(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete review endpoint ready",
                "endpoint", "/api/v1/reviews/" + id,
                "id", id
        ));
    }

    /**
     * 06
     * GET /api/v1/courses/{courseId}/rating
     */
    @GetMapping("/courses/{courseId}/rating")
    public ResponseEntity<?> getCourseRating(
            @PathVariable Long courseId) {

        return ResponseEntity.ok(Map.of(
                "message", "Get course rating endpoint ready",
                "endpoint", "/api/v1/courses/" + courseId + "/rating",
                "courseId", courseId
        ));
    }
}

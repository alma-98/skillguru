package com.skillguru.backend.controller.wishlist;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Wishlist API
 * ============================================================
 *
 * GROUP 29 - WISHLIST
 *
 * MASTER ENDPOINTS
 *
 * 01. GET
 *     /api/v1/wishlist
 *
 * 02. POST
 *     /api/v1/wishlist/courses/{courseId}
 *
 * 03. DELETE
 *     /api/v1/wishlist/courses/{courseId}
 *
 * 04. GET
 *     /api/v1/students/{studentId}/wishlist
 *
 * ============================================================
 *
 * REMOVED FROM PREVIOUS IMPLEMENTATION
 *
 * GET    /api/v1/wishlist/{id}
 * DELETE /api/v1/wishlist/{id}
 *
 * ============================================================
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
public class WishlistController {

    /**
     * 01
     * GET /api/v1/wishlist
     */
    @GetMapping("/wishlist")
    public ResponseEntity<?> getWishlist() {
        return ResponseEntity.ok(Map.of(
                "message", "Get wishlist endpoint ready",
                "endpoint", "/api/v1/wishlist"
        ));
    }

    /**
     * 02
     * POST /api/v1/wishlist/courses/{courseId}
     */
    @PostMapping("/wishlist/courses/{courseId}")
    public ResponseEntity<?> addCourseToWishlist(
            @PathVariable Long courseId) {

        return ResponseEntity.ok(Map.of(
                "message", "Add course to wishlist endpoint ready",
                "endpoint",
                "/api/v1/wishlist/courses/" + courseId,
                "courseId", courseId
        ));
    }

    /**
     * 03
     * DELETE /api/v1/wishlist/courses/{courseId}
     */
    @DeleteMapping("/wishlist/courses/{courseId}")
    public ResponseEntity<?> removeCourseFromWishlist(
            @PathVariable Long courseId) {

        return ResponseEntity.ok(Map.of(
                "message", "Remove course from wishlist endpoint ready",
                "endpoint",
                "/api/v1/wishlist/courses/" + courseId,
                "courseId", courseId
        ));
    }

    /**
     * 04
     * GET /api/v1/students/{studentId}/wishlist
     */
    @GetMapping("/students/{studentId}/wishlist")
    public ResponseEntity<?> getStudentWishlist(
            @PathVariable Long studentId) {

        return ResponseEntity.ok(Map.of(
                "message", "Get student wishlist endpoint ready",
                "endpoint",
                "/api/v1/students/" + studentId + "/wishlist",
                "studentId", studentId
        ));
    }
}

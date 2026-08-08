package com.skillguru.backend.controller.wishlist;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Wishlist API
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
 * MASTER API ENDPOINTS - GROUP 29
 *
 * 01. GET
 *     /api/v1/wishlist
 *     List wishlist items
 *
 * 02. GET
 *     /api/v1/wishlist/{id}
 *     Get wishlist item detail
 *
 * 03. POST
 *     /api/v1/wishlist
 *     Add item to wishlist
 *
 * 04. DELETE
 *     /api/v1/wishlist/{id}
 *     Remove item from wishlist
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
@RequestMapping("/api/v1/wishlist")
public class WishlistController {

    /**
     * 01
     * GET /api/v1/wishlist
     */
    @GetMapping
    public ResponseEntity<?> getWishlist() {
        return ResponseEntity.ok(Map.of(
                "message", "Get wishlist endpoint ready",
                "endpoint", "/api/v1/wishlist"
        ));
    }

    /**
     * 02
     * GET /api/v1/wishlist/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getWishlistById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get wishlist item by ID endpoint ready",
                "endpoint", "/api/v1/wishlist/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/wishlist
     */
    @PostMapping
    public ResponseEntity<?> addToWishlist() {
        return ResponseEntity.ok(Map.of(
                "message", "Add item to wishlist endpoint ready",
                "endpoint", "/api/v1/wishlist"
        ));
    }

    /**
     * 04
     * DELETE /api/v1/wishlist/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> removeFromWishlist(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Remove item from wishlist endpoint ready",
                "endpoint", "/api/v1/wishlist/" + id,
                "id", id
        ));
    }
}

package com.skillguru.backend.controller.coupon;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Coupons API
 * ============================================================
 *
 * MASTER API CATEGORY
 * No. 38 - Coupons
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
 *     /api/v1/coupons
 *
 * 02. GET
 *     /api/v1/coupons/{id}
 *
 * 03. POST
 *     /api/v1/coupons
 *
 * 04. PUT
 *     /api/v1/coupons/{id}
 *
 * 05. DELETE
 *     /api/v1/coupons/{id}
 *
 * 06. POST
 *     /api/v1/coupons/validate
 *
 * ============================================================
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * coupon validation, discount calculation, expiration
 * handling and usage limits will be implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1/coupons")
public class CouponController {

    /**
     * 01
     * GET /api/v1/coupons
     */
    @GetMapping
    public ResponseEntity<?> getCoupons() {
        return ResponseEntity.ok(Map.of(
                "message", "Get coupons endpoint ready",
                "endpoint", "/api/v1/coupons"
        ));
    }

    /**
     * 02
     * GET /api/v1/coupons/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getCouponById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get coupon by ID endpoint ready",
                "endpoint", "/api/v1/coupons/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/coupons
     */
    @PostMapping
    public ResponseEntity<?> createCoupon() {
        return ResponseEntity.ok(Map.of(
                "message", "Create coupon endpoint ready",
                "endpoint", "/api/v1/coupons"
        ));
    }

    /**
     * 04
     * PUT /api/v1/coupons/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> updateCoupon(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update coupon endpoint ready",
                "endpoint", "/api/v1/coupons/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/coupons/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCoupon(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete coupon endpoint ready",
                "endpoint", "/api/v1/coupons/" + id,
                "id", id
        ));
    }

    /**
     * 06
     * POST /api/v1/coupons/validate
     */
    @PostMapping("/validate")
    public ResponseEntity<?> validateCoupon() {
        return ResponseEntity.ok(Map.of(
                "message", "Validate coupon endpoint ready",
                "endpoint", "/api/v1/coupons/validate"
        ));
    }
}

package com.skillguru.backend.controller.publicapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Public API
 * ============================================================
 *
 * MASTER API CATEGORY
 * No. 57 - Public API
 *
 * Total Endpoints: 5
 *
 * API Base:
 * /api/v1
 *
 * Authentication:
 * Public
 *
 * Roles:
 * PUBLIC
 *
 * ============================================================
 *
 * MASTER ENDPOINTS
 *
 * 01. GET
 *     /api/v1/public/courses
 *
 * 02. GET
 *     /api/v1/public/courses/{id}
 *
 * 03. GET
 *     /api/v1/public/categories
 *
 * 04. GET
 *     /api/v1/public/teachers
 *
 * 05. GET
 *     /api/v1/public/config
 *
 * ============================================================
 *
 * IMPORTANT:
 *
 * Public API does not require JWT authentication.
 *
 * These endpoints are intended for public-facing pages,
 * course discovery, category discovery, teacher discovery,
 * and public platform configuration.
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * public data filtering, caching and validation will be
 * implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1/public")
public class PublicApiController {

    /**
     * 01
     * GET /api/v1/public/courses
     */
    @GetMapping("/courses")
    public ResponseEntity<?> getPublicCourses() {
        return ResponseEntity.ok(Map.of(
                "message", "Public courses endpoint ready",
                "endpoint", "/api/v1/public/courses"
        ));
    }

    /**
     * 02
     * GET /api/v1/public/courses/{id}
     */
    @GetMapping("/courses/{id}")
    public ResponseEntity<?> getPublicCourseById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Public course by ID endpoint ready",
                "endpoint", "/api/v1/public/courses/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * GET /api/v1/public/categories
     */
    @GetMapping("/categories")
    public ResponseEntity<?> getPublicCategories() {
        return ResponseEntity.ok(Map.of(
                "message", "Public categories endpoint ready",
                "endpoint", "/api/v1/public/categories"
        ));
    }

    /**
     * 04
     * GET /api/v1/public/teachers
     */
    @GetMapping("/teachers")
    public ResponseEntity<?> getPublicTeachers() {
        return ResponseEntity.ok(Map.of(
                "message", "Public teachers endpoint ready",
                "endpoint", "/api/v1/public/teachers"
        ));
    }

    /**
     * 05
     * GET /api/v1/public/config
     */
    @GetMapping("/config")
    public ResponseEntity<?> getPublicConfig() {
        return ResponseEntity.ok(Map.of(
                "message", "Public configuration endpoint ready",
                "endpoint", "/api/v1/public/config"
        ));
    }
}

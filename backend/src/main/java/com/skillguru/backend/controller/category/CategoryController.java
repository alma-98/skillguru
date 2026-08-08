package com.skillguru.backend.controller.category;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Categories API
 * ============================================================
 *
 * API Base:
 * /api/v1/categories
 *
 * Authentication:
 * JWT Bearer
 *
 * Roles:
 * ADMIN / TEACHER / MENTOR / STUDENT
 *
 * ============================================================
 *
 * MASTER API ENDPOINTS - GROUP 15
 *
 * 01. GET
 *     /api/v1/categories
 *     List all categories
 *
 * 02. GET
 *     /api/v1/categories/{id}
 *     Get category detail
 *
 * 03. POST
 *     /api/v1/categories
 *     Create category
 *
 * 04. PUT
 *     /api/v1/categories/{id}
 *     Update category
 *
 * 05. DELETE
 *     /api/v1/categories/{id}
 *     Delete category
 *
 * 06. GET
 *     /api/v1/categories/{id}/courses
 *     Get courses associated with category
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
@RequestMapping("/api/v1/categories")
public class CategoryController {

    /**
     * 01
     * GET /api/v1/categories
     */
    @GetMapping
    public ResponseEntity<?> getCategories() {
        return ResponseEntity.ok(Map.of(
                "message", "Get categories endpoint ready",
                "endpoint", "/api/v1/categories"
        ));
    }

    /**
     * 02
     * GET /api/v1/categories/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getCategoryById(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Get category by ID endpoint ready",
                "endpoint", "/api/v1/categories/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/categories
     */
    @PostMapping
    public ResponseEntity<?> createCategory() {
        return ResponseEntity.ok(Map.of(
                "message", "Create category endpoint ready",
                "endpoint", "/api/v1/categories"
        ));
    }

    /**
     * 04
     * PUT /api/v1/categories/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> updateCategory(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Update category endpoint ready",
                "endpoint", "/api/v1/categories/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/categories/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCategory(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Delete category endpoint ready",
                "endpoint", "/api/v1/categories/" + id,
                "id", id
        ));
    }

    /**
     * 06
     * GET /api/v1/categories/{id}/courses
     */
    @GetMapping("/{id}/courses")
    public ResponseEntity<?> getCategoryCourses(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Category courses endpoint ready",
                "endpoint", "/api/v1/categories/" + id + "/courses",
                "id", id
        ));
    }
}

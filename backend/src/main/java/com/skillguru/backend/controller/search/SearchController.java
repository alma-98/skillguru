package com.skillguru.backend.controller.search;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Search API
 * ============================================================
 *
 * MASTER API CATEGORY
 * No. 41 - Search
 *
 * Total Endpoints: 5
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
 *     /api/v1/search
 *
 * 02. GET
 *     /api/v1/search/courses
 *
 * 03. GET
 *     /api/v1/search/teachers
 *
 * 04. GET
 *     /api/v1/search/materials
 *
 * 05. GET
 *     /api/v1/search/students
 *
 * ============================================================
 *
 * IMPORTANT:
 *
 * Search endpoints are read-only according to the
 * Master API.
 *
 * No POST, PUT, PATCH or DELETE endpoint is added.
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, search service, filtering, pagination,
 * sorting, indexing and validation will be implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1/search")
public class SearchController {

    /**
     * 01
     * GET /api/v1/search
     */
    @GetMapping
    public ResponseEntity<?> search() {
        return ResponseEntity.ok(Map.of(
                "message", "Global search endpoint ready",
                "endpoint", "/api/v1/search"
        ));
    }

    /**
     * 02
     * GET /api/v1/search/courses
     */
    @GetMapping("/courses")
    public ResponseEntity<?> searchCourses() {
        return ResponseEntity.ok(Map.of(
                "message", "Course search endpoint ready",
                "endpoint", "/api/v1/search/courses"
        ));
    }

    /**
     * 03
     * GET /api/v1/search/teachers
     */
    @GetMapping("/teachers")
    public ResponseEntity<?> searchTeachers() {
        return ResponseEntity.ok(Map.of(
                "message", "Teacher search endpoint ready",
                "endpoint", "/api/v1/search/teachers"
        ));
    }

    /**
     * 04
     * GET /api/v1/search/materials
     */
    @GetMapping("/materials")
    public ResponseEntity<?> searchMaterials() {
        return ResponseEntity.ok(Map.of(
                "message", "Material search endpoint ready",
                "endpoint", "/api/v1/search/materials"
        ));
    }

    /**
     * 05
     * GET /api/v1/search/students
     */
    @GetMapping("/students")
    public ResponseEntity<?> searchStudents() {
        return ResponseEntity.ok(Map.of(
                "message", "Student search endpoint ready",
                "endpoint", "/api/v1/search/students"
        ));
    }
}

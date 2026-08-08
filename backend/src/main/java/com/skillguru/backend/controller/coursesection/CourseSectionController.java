package com.skillguru.backend.controller.coursesection;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Course Sections API
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
 * MASTER API ENDPOINTS - GROUP 17
 *
 * 01. GET
 *     /api/v1/courses/{courseId}/sections
 *     List sections belonging to a course
 *
 * 02. POST
 *     /api/v1/courses/{courseId}/sections
 *     Create a section for a course
 *
 * 03. GET
 *     /api/v1/sections/{id}
 *     Get section detail
 *
 * 04. PUT
 *     /api/v1/sections/{id}
 *     Update section
 *
 * 05. DELETE
 *     /api/v1/sections/{id}
 *     Delete section
 *
 * 06. PATCH
 *     /api/v1/sections/{id}/order
 *     Update section order
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
public class CourseSectionController {

    /**
     * 01
     * GET /api/v1/courses/{courseId}/sections
     */
    @GetMapping("/courses/{courseId}/sections")
    public ResponseEntity<?> getCourseSections(
            @PathVariable Long courseId) {

        return ResponseEntity.ok(Map.of(
                "message", "Get course sections endpoint ready",
                "endpoint", "/api/v1/courses/" + courseId + "/sections",
                "courseId", courseId
        ));
    }

    /**
     * 02
     * POST /api/v1/courses/{courseId}/sections
     */
    @PostMapping("/courses/{courseId}/sections")
    public ResponseEntity<?> createCourseSection(
            @PathVariable Long courseId) {

        return ResponseEntity.ok(Map.of(
                "message", "Create course section endpoint ready",
                "endpoint", "/api/v1/courses/" + courseId + "/sections",
                "courseId", courseId
        ));
    }

    /**
     * 03
     * GET /api/v1/sections/{id}
     */
    @GetMapping("/sections/{id}")
    public ResponseEntity<?> getSectionById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get section by ID endpoint ready",
                "endpoint", "/api/v1/sections/" + id,
                "id", id
        ));
    }

    /**
     * 04
     * PUT /api/v1/sections/{id}
     */
    @PutMapping("/sections/{id}")
    public ResponseEntity<?> updateSection(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update section endpoint ready",
                "endpoint", "/api/v1/sections/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/sections/{id}
     */
    @DeleteMapping("/sections/{id}")
    public ResponseEntity<?> deleteSection(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete section endpoint ready",
                "endpoint", "/api/v1/sections/" + id,
                "id", id
        ));
    }

    /**
     * 06
     * PATCH /api/v1/sections/{id}/order
     */
    @PatchMapping("/sections/{id}/order")
    public ResponseEntity<?> updateSectionOrder(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update section order endpoint ready",
                "endpoint", "/api/v1/sections/" + id + "/order",
                "id", id
        ));
    }
}

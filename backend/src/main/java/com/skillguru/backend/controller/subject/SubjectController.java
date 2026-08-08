package com.skillguru.backend.controller.subject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Subjects API
 * ============================================================
 *
 * API Base:
 * /api/v1/subjects
 *
 * Authentication:
 * JWT Bearer
 *
 * Roles:
 * ADMIN / TEACHER / MENTOR / STUDENT
 *
 * ============================================================
 *
 * MASTER API ENDPOINTS - GROUP 10
 *
 * 01. GET
 *     /api/v1/subjects
 *     List all subjects
 *
 * 02. GET
 *     /api/v1/subjects/{id}
 *     Get subject detail
 *
 * 03. POST
 *     /api/v1/subjects
 *     Create subject
 *
 * 04. PUT
 *     /api/v1/subjects/{id}
 *     Update subject
 *
 * 05. DELETE
 *     /api/v1/subjects/{id}
 *     Delete subject
 *
 * 06. GET
 *     /api/v1/subjects/{id}/courses
 *     Get courses associated with subject
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
@RequestMapping("/api/v1/subjects")
public class SubjectController {

    /**
     * 01
     * GET /api/v1/subjects
     */
    @GetMapping
    public ResponseEntity<?> getSubjects() {
        return ResponseEntity.ok(Map.of(
                "message", "Get subjects endpoint ready",
                "endpoint", "/api/v1/subjects"
        ));
    }

    /**
     * 02
     * GET /api/v1/subjects/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getSubjectById(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Get subject by ID endpoint ready",
                "endpoint", "/api/v1/subjects/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/subjects
     */
    @PostMapping
    public ResponseEntity<?> createSubject() {
        return ResponseEntity.ok(Map.of(
                "message", "Create subject endpoint ready",
                "endpoint", "/api/v1/subjects"
        ));
    }

    /**
     * 04
     * PUT /api/v1/subjects/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> updateSubject(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Update subject endpoint ready",
                "endpoint", "/api/v1/subjects/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/subjects/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSubject(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Delete subject endpoint ready",
                "endpoint", "/api/v1/subjects/" + id,
                "id", id
        ));
    }

    /**
     * 06
     * GET /api/v1/subjects/{id}/courses
     */
    @GetMapping("/{id}/courses")
    public ResponseEntity<?> getSubjectCourses(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Subject courses endpoint ready",
                "endpoint", "/api/v1/subjects/" + id + "/courses",
                "id", id
        ));
    }
}

package com.skillguru.backend.controller.assignment;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Assignments API
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
 * MASTER API ENDPOINTS - ASSIGNMENTS
 *
 * 01. GET
 *     /api/v1/assignments
 *     List all assignments
 *
 * 02. GET
 *     /api/v1/assignments/{id}
 *     Get assignment detail
 *
 * 03. POST
 *     /api/v1/assignments
 *     Create assignment
 *
 * 04. PUT
 *     /api/v1/assignments/{id}
 *     Update assignment
 *
 * 05. DELETE
 *     /api/v1/assignments/{id}
 *     Delete assignment
 *
 * 06. POST
 *     /api/v1/assignments/{id}/submit
 *     Submit assignment
 *
 * 07. GET
 *     /api/v1/assignments/{id}/submissions
 *     Get assignment submissions
 *
 * 08. POST
 *     /api/v1/submissions/{id}/grade
 *     Grade assignment submission
 *
 * ============================================================
 * Master API:
 * SkillGuru_Master_API_Swagger_v1.xlsx
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * JWT authorization, file handling, submission processing,
 * grading and validation will be implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1")
public class AssignmentController {

    /**
     * 01
     * GET /api/v1/assignments
     */
    @GetMapping("/assignments")
    public ResponseEntity<?> getAssignments() {
        return ResponseEntity.ok(Map.of(
                "message", "Get assignments endpoint ready",
                "endpoint", "/api/v1/assignments"
        ));
    }

    /**
     * 02
     * GET /api/v1/assignments/{id}
     */
    @GetMapping("/assignments/{id}")
    public ResponseEntity<?> getAssignmentById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get assignment by ID endpoint ready",
                "endpoint", "/api/v1/assignments/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/assignments
     */
    @PostMapping("/assignments")
    public ResponseEntity<?> createAssignment() {
        return ResponseEntity.ok(Map.of(
                "message", "Create assignment endpoint ready",
                "endpoint", "/api/v1/assignments"
        ));
    }

    /**
     * 04
     * PUT /api/v1/assignments/{id}
     */
    @PutMapping("/assignments/{id}")
    public ResponseEntity<?> updateAssignment(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update assignment endpoint ready",
                "endpoint", "/api/v1/assignments/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/assignments/{id}
     */
    @DeleteMapping("/assignments/{id}")
    public ResponseEntity<?> deleteAssignment(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete assignment endpoint ready",
                "endpoint", "/api/v1/assignments/" + id,
                "id", id
        ));
    }

    /**
     * 06
     * POST /api/v1/assignments/{id}/submit
     */
    @PostMapping("/assignments/{id}/submit")
    public ResponseEntity<?> submitAssignment(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Submit assignment endpoint ready",
                "endpoint", "/api/v1/assignments/" + id + "/submit",
                "id", id
        ));
    }

    /**
     * 07
     * GET /api/v1/assignments/{id}/submissions
     */
    @GetMapping("/assignments/{id}/submissions")
    public ResponseEntity<?> getAssignmentSubmissions(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get assignment submissions endpoint ready",
                "endpoint", "/api/v1/assignments/" + id + "/submissions",
                "id", id
        ));
    }

    /**
     * 08
     * POST /api/v1/submissions/{id}/grade
     */
    @PostMapping("/submissions/{id}/grade")
    public ResponseEntity<?> gradeSubmission(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Grade submission endpoint ready",
                "endpoint", "/api/v1/submissions/" + id + "/grade",
                "id", id
        ));
    }
}

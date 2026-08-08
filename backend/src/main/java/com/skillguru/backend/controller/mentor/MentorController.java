package com.skillguru.backend.controller.mentor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Mentors API
 * ============================================================
 *
 * API Base:
 * /api/v1/mentors
 *
 * Authentication:
 * JWT Bearer
 *
 * Roles:
 * ADMIN / MENTOR / TEACHER / STUDENT
 *
 * ============================================================
 *
 * ENDPOINTS
 *
 * 01. GET    /api/v1/mentors
 *     List all mentors
 *
 * 02. GET    /api/v1/mentors/{id}
 *     Get mentor detail
 *
 * 03. POST   /api/v1/mentors
 *     Create mentor
 *
 * 04. PUT    /api/v1/mentors/{id}
 *     Update mentor
 *
 * 05. PATCH  /api/v1/mentors/{id}/status
 *     Update mentor status
 *
 * 06. DELETE /api/v1/mentors/{id}
 *     Delete mentor
 *
 * 07. GET    /api/v1/mentors/{id}/students
 *     Get mentor students
 *
 * 08. GET    /api/v1/mentors/{id}/schedule
 *     Get mentor schedule
 *
 * ============================================================
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * JWT authorization and validation will be implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1/mentors")
public class MentorController {

    /**
     * 01
     * GET /api/v1/mentors
     */
    @GetMapping
    public ResponseEntity<?> getMentors() {
        return ResponseEntity.ok(Map.of(
                "message", "Get mentors endpoint ready",
                "endpoint", "/api/v1/mentors"
        ));
    }

    /**
     * 02
     * GET /api/v1/mentors/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getMentorById(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Get mentor by ID endpoint ready",
                "endpoint", "/api/v1/mentors/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/mentors
     */
    @PostMapping
    public ResponseEntity<?> createMentor() {
        return ResponseEntity.ok(Map.of(
                "message", "Create mentor endpoint ready",
                "endpoint", "/api/v1/mentors"
        ));
    }

    /**
     * 04
     * PUT /api/v1/mentors/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> updateMentor(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Update mentor endpoint ready",
                "endpoint", "/api/v1/mentors/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * PATCH /api/v1/mentors/{id}/status
     */
    @PatchMapping("/{id}/status")
    public ResponseEntity<?> updateMentorStatus(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Update mentor status endpoint ready",
                "endpoint", "/api/v1/mentors/" + id + "/status",
                "id", id
        ));
    }

    /**
     * 06
     * DELETE /api/v1/mentors/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMentor(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Delete mentor endpoint ready",
                "endpoint", "/api/v1/mentors/" + id,
                "id", id
        ));
    }

    /**
     * 07
     * GET /api/v1/mentors/{id}/students
     */
    @GetMapping("/{id}/students")
    public ResponseEntity<?> getMentorStudents(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Mentor students endpoint ready",
                "endpoint", "/api/v1/mentors/" + id + "/students",
                "id", id
        ));
    }

    /**
     * 08
     * GET /api/v1/mentors/{id}/schedule
     */
    @GetMapping("/{id}/schedule")
    public ResponseEntity<?> getMentorSchedule(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Mentor schedule endpoint ready",
                "endpoint", "/api/v1/mentors/" + id + "/schedule",
                "id", id
        ));
    }
}

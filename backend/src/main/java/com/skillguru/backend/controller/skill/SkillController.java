package com.skillguru.backend.controller.skill;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Skills API
 * ============================================================
 *
 * MASTER API CATEGORY
 * No. 49 - Skills
 *
 * Total Endpoints: 6
 *
 * API Base:
 * /api/v1
 *
 * Authentication:
 * JWT Bearer
 *
 * ============================================================
 *
 * MASTER ENDPOINTS
 *
 * 01. GET
 *     /api/v1/skills
 *
 * 02. GET
 *     /api/v1/skills/{id}
 *
 * 03. POST
 *     /api/v1/skills
 *
 * 04. PUT
 *     /api/v1/skills/{id}
 *
 * 05. DELETE
 *     /api/v1/skills/{id}
 *
 * 06. GET
 *     /api/v1/skills/{id}/courses
 *
 * ============================================================
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * skill-course relationships and validation will be
 * implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1/skills")
public class SkillController {

    /**
     * 01
     * GET /api/v1/skills
     */
    @GetMapping
    public ResponseEntity<?> getSkills() {
        return ResponseEntity.ok(Map.of(
                "message", "Get skills endpoint ready",
                "endpoint", "/api/v1/skills"
        ));
    }

    /**
     * 02
     * GET /api/v1/skills/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getSkillById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get skill by ID endpoint ready",
                "endpoint", "/api/v1/skills/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/skills
     */
    @PostMapping
    public ResponseEntity<?> createSkill() {
        return ResponseEntity.ok(Map.of(
                "message", "Create skill endpoint ready",
                "endpoint", "/api/v1/skills"
        ));
    }

    /**
     * 04
     * PUT /api/v1/skills/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> updateSkill(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update skill endpoint ready",
                "endpoint", "/api/v1/skills/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/skills/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSkill(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete skill endpoint ready",
                "endpoint", "/api/v1/skills/" + id,
                "id", id
        ));
    }

    /**
     * 06
     * GET /api/v1/skills/{id}/courses
     */
    @GetMapping("/{id}/courses")
    public ResponseEntity<?> getSkillCourses(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get skill courses endpoint ready",
                "endpoint", "/api/v1/skills/" + id + "/courses",
                "id", id
        ));
    }
}

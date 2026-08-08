package com.skillguru.backend.controller.skill;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * SkillGuru
 * Group 49 - Skills
 *
 * MASTER ENDPOINTS:
 *
 * GET    /api/v1/skills
 * GET    /api/v1/skills/{id}
 * POST   /api/v1/skills
 * PUT    /api/v1/skills/{id}
 * DELETE /api/v1/skills/{id}
 * GET    /api/v1/students/{studentId}/skills
 */
@RestController
@RequestMapping("/api/v1")
public class SkillController {

    @GetMapping("/skills")
    public ResponseEntity<?> getSkills() {
        return ResponseEntity.ok(Map.of(
                "message", "Get skills endpoint ready",
                "endpoint", "/api/v1/skills"
        ));
    }

    @GetMapping("/skills/{id}")
    public ResponseEntity<?> getSkillById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get skill by ID endpoint ready",
                "endpoint", "/api/v1/skills/" + id,
                "id", id
        ));
    }

    @PostMapping("/skills")
    public ResponseEntity<?> createSkill() {
        return ResponseEntity.ok(Map.of(
                "message", "Create skill endpoint ready",
                "endpoint", "/api/v1/skills"
        ));
    }

    @PutMapping("/skills/{id}")
    public ResponseEntity<?> updateSkill(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update skill endpoint ready",
                "endpoint", "/api/v1/skills/" + id,
                "id", id
        ));
    }

    @DeleteMapping("/skills/{id}")
    public ResponseEntity<?> deleteSkill(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete skill endpoint ready",
                "endpoint", "/api/v1/skills/" + id,
                "id", id
        ));
    }

    @GetMapping("/students/{studentId}/skills")
    public ResponseEntity<?> getStudentSkills(
            @PathVariable Long studentId) {

        return ResponseEntity.ok(Map.of(
                "message", "Get student skills endpoint ready",
                "endpoint",
                "/api/v1/students/" + studentId + "/skills",
                "studentId", studentId
        ));
    }
}

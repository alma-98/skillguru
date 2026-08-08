package com.skillguru.backend.controller.curriculumprogram;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Curriculum Programs API
 * ============================================================
 *
 * API Base:
 * /api/v1/curriculum-programs
 *
 * Authentication:
 * JWT Bearer
 *
 * Roles:
 * ADMIN / TEACHER / MENTOR / STUDENT
 *
 * ============================================================
 *
 * MASTER API ENDPOINTS - GROUP 14
 *
 * 01. GET
 *     /api/v1/curriculum-programs
 *     List all curriculum programs
 *
 * 02. GET
 *     /api/v1/curriculum-programs/{id}
 *     Get curriculum program detail
 *
 * 03. POST
 *     /api/v1/curriculum-programs
 *     Create curriculum program
 *
 * 04. PUT
 *     /api/v1/curriculum-programs/{id}
 *     Update curriculum program
 *
 * 05. DELETE
 *     /api/v1/curriculum-programs/{id}
 *     Delete curriculum program
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
@RequestMapping("/api/v1/curriculum-programs")
public class CurriculumProgramController {

    /**
     * 01
     * GET /api/v1/curriculum-programs
     */
    @GetMapping
    public ResponseEntity<?> getCurriculumPrograms() {
        return ResponseEntity.ok(Map.of(
                "message", "Get curriculum programs endpoint ready",
                "endpoint", "/api/v1/curriculum-programs"
        ));
    }

    /**
     * 02
     * GET /api/v1/curriculum-programs/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getCurriculumProgramById(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Get curriculum program by ID endpoint ready",
                "endpoint", "/api/v1/curriculum-programs/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/curriculum-programs
     */
    @PostMapping
    public ResponseEntity<?> createCurriculumProgram() {
        return ResponseEntity.ok(Map.of(
                "message", "Create curriculum program endpoint ready",
                "endpoint", "/api/v1/curriculum-programs"
        ));
    }

    /**
     * 04
     * PUT /api/v1/curriculum-programs/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> updateCurriculumProgram(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Update curriculum program endpoint ready",
                "endpoint", "/api/v1/curriculum-programs/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/curriculum-programs/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCurriculumProgram(@PathVariable Long id) {
        return ResponseEntity.ok(Map.of(
                "message", "Delete curriculum program endpoint ready",
                "endpoint", "/api/v1/curriculum-programs/" + id,
                "id", id
        ));
    }
}

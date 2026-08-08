package com.skillguru.backend.controller.material;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Materials API
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
 * MASTER API ENDPOINTS - GROUP 19
 *
 * 01. GET
 *     /api/v1/materials
 *     List all materials
 *
 * 02. GET
 *     /api/v1/materials/{id}
 *     Get material detail
 *
 * 03. POST
 *     /api/v1/materials
 *     Create material
 *
 * 04. PUT
 *     /api/v1/materials/{id}
 *     Update material
 *
 * 05. DELETE
 *     /api/v1/materials/{id}
 *     Delete material
 *
 * 06. GET
 *     /api/v1/lessons/{lessonId}/materials
 *     List materials belonging to a lesson
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
public class MaterialController {

    /**
     * 01
     * GET /api/v1/materials
     */
    @GetMapping("/materials")
    public ResponseEntity<?> getMaterials() {
        return ResponseEntity.ok(Map.of(
                "message", "Get materials endpoint ready",
                "endpoint", "/api/v1/materials"
        ));
    }

    /**
     * 02
     * GET /api/v1/materials/{id}
     */
    @GetMapping("/materials/{id}")
    public ResponseEntity<?> getMaterialById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get material by ID endpoint ready",
                "endpoint", "/api/v1/materials/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/materials
     */
    @PostMapping("/materials")
    public ResponseEntity<?> createMaterial() {
        return ResponseEntity.ok(Map.of(
                "message", "Create material endpoint ready",
                "endpoint", "/api/v1/materials"
        ));
    }

    /**
     * 04
     * PUT /api/v1/materials/{id}
     */
    @PutMapping("/materials/{id}")
    public ResponseEntity<?> updateMaterial(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update material endpoint ready",
                "endpoint", "/api/v1/materials/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/materials/{id}
     */
    @DeleteMapping("/materials/{id}")
    public ResponseEntity<?> deleteMaterial(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete material endpoint ready",
                "endpoint", "/api/v1/materials/" + id,
                "id", id
        ));
    }

    /**
     * 06
     * GET /api/v1/lessons/{lessonId}/materials
     */
    @GetMapping("/lessons/{lessonId}/materials")
    public ResponseEntity<?> getLessonMaterials(
            @PathVariable Long lessonId) {

        return ResponseEntity.ok(Map.of(
                "message", "Get lesson materials endpoint ready",
                "endpoint", "/api/v1/lessons/" + lessonId + "/materials",
                "lessonId", lessonId
        ));
    }
}

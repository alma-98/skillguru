package com.skillguru.backend.controller.setting;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Settings API
 * ============================================================
 *
 * MASTER API CATEGORY
 * No. 54 - Settings
 *
 * Total Endpoints: 4
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
 *     /api/v1/settings
 *
 * 02. GET
 *     /api/v1/settings/{id}
 *
 * 03. PUT
 *     /api/v1/settings/{id}
 *
 * 04. DELETE
 *     /api/v1/settings/{id}
 *
 * ============================================================
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * configuration management and validation will be
 * implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1/settings")
public class SettingController {

    /**
     * 01
     * GET /api/v1/settings
     */
    @GetMapping
    public ResponseEntity<?> getSettings() {
        return ResponseEntity.ok(Map.of(
                "message", "Get settings endpoint ready",
                "endpoint", "/api/v1/settings"
        ));
    }

    /**
     * 02
     * GET /api/v1/settings/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getSettingById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get setting by ID endpoint ready",
                "endpoint", "/api/v1/settings/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * PUT /api/v1/settings/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> updateSetting(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update setting endpoint ready",
                "endpoint", "/api/v1/settings/" + id,
                "id", id
        ));
    }

    /**
     * 04
     * DELETE /api/v1/settings/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSetting(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete setting endpoint ready",
                "endpoint", "/api/v1/settings/" + id,
                "id", id
        ));
    }
}

package com.skillguru.backend.controller.setting;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * SkillGuru
 * Group 54 - Settings
 *
 * MASTER ENDPOINTS:
 *
 * GET   /api/v1/settings
 * GET   /api/v1/settings/{key}
 * PUT   /api/v1/settings/{key}
 * PATCH /api/v1/settings/{key}
 */
@RestController
@RequestMapping("/api/v1/settings")
public class SettingController {

    @GetMapping
    public ResponseEntity<?> getSettings() {
        return ResponseEntity.ok(Map.of(
                "message", "Get settings endpoint ready",
                "endpoint", "/api/v1/settings"
        ));
    }

    @GetMapping("/{key}")
    public ResponseEntity<?> getSettingByKey(
            @PathVariable String key) {

        return ResponseEntity.ok(Map.of(
                "message", "Get setting by key endpoint ready",
                "endpoint", "/api/v1/settings/" + key,
                "key", key
        ));
    }

    @PutMapping("/{key}")
    public ResponseEntity<?> updateSetting(
            @PathVariable String key) {

        return ResponseEntity.ok(Map.of(
                "message", "Update setting endpoint ready",
                "endpoint", "/api/v1/settings/" + key,
                "key", key
        ));
    }

    @PatchMapping("/{key}")
    public ResponseEntity<?> patchSetting(
            @PathVariable String key) {

        return ResponseEntity.ok(Map.of(
                "message", "Patch setting endpoint ready",
                "endpoint", "/api/v1/settings/" + key,
                "key", key
        ));
    }
}

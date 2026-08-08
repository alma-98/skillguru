package com.skillguru.backend.controller.system;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - System API
 * ============================================================
 *
 * MASTER API CATEGORY
 * No. 58 - System
 *
 * Total Endpoints: 5
 *
 * ============================================================
 *
 * MASTER ENDPOINTS
 *
 * 01. GET
 *     /api/v1/health
 *
 * 02. GET
 *     /api/v1/version
 *
 * 03. GET
 *     /actuator/health
 *
 * 04. GET
 *     /actuator/info
 *
 * 05. GET
 *     /actuator/metrics
 *
 * ============================================================
 *
 * IMPORTANT:
 *
 * /api/v1/health and /api/v1/version are application
 * endpoints implemented by this controller.
 *
 * /actuator/health
 * /actuator/info
 * /actuator/metrics
 *
 * are Spring Boot Actuator endpoints and MUST NOT be
 * duplicated by controller mappings.
 *
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1")
public class SystemController {

    /**
     * 01
     * GET /api/v1/health
     */
    @GetMapping("/health")
    public ResponseEntity<?> health() {
        return ResponseEntity.ok(Map.of(
                "status", "UP",
                "service", "SkillGuru",
                "endpoint", "/api/v1/health"
        ));
    }

    /**
     * 02
     * GET /api/v1/version
     */
    @GetMapping("/version")
    public ResponseEntity<?> version() {
        return ResponseEntity.ok(Map.of(
                "service", "SkillGuru",
                "version", "1.0.0",
                "endpoint", "/api/v1/version"
        ));
    }
}

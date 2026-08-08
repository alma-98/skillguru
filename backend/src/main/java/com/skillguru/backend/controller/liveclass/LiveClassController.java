package com.skillguru.backend.controller.liveclass;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Live Classes API
 * ============================================================
 *
 * GROUP 32 - LIVE CLASSES
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
 * MASTER API ENDPOINTS
 *
 * 01. GET
 *     /api/v1/live-classes
 *
 * 02. GET
 *     /api/v1/live-classes/{id}
 *
 * 03. POST
 *     /api/v1/live-classes
 *
 * 04. PUT
 *     /api/v1/live-classes/{id}
 *
 * 05. DELETE
 *     /api/v1/live-classes/{id}
 *
 * 06. POST
 *     /api/v1/live-classes/{id}/start
 *
 * 07. POST
 *     /api/v1/live-classes/{id}/end
 *
 * 08. GET
 *     /api/v1/live-classes/{id}/participants
 *
 * ============================================================
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * JWT authorization, scheduling, meeting integration,
 * participant management and validation will be implemented
 * later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1/live-classes")
public class LiveClassController {

    /**
     * 01
     * GET /api/v1/live-classes
     */
    @GetMapping
    public ResponseEntity<?> getLiveClasses() {
        return ResponseEntity.ok(Map.of(
                "message", "Get live classes endpoint ready",
                "endpoint", "/api/v1/live-classes"
        ));
    }

    /**
     * 02
     * GET /api/v1/live-classes/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getLiveClassById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get live class by ID endpoint ready",
                "endpoint", "/api/v1/live-classes/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/live-classes
     */
    @PostMapping
    public ResponseEntity<?> createLiveClass() {
        return ResponseEntity.ok(Map.of(
                "message", "Create live class endpoint ready",
                "endpoint", "/api/v1/live-classes"
        ));
    }

    /**
     * 04
     * PUT /api/v1/live-classes/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> updateLiveClass(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update live class endpoint ready",
                "endpoint", "/api/v1/live-classes/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/live-classes/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteLiveClass(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete live class endpoint ready",
                "endpoint", "/api/v1/live-classes/" + id,
                "id", id
        ));
    }

    /**
     * 06
     * POST /api/v1/live-classes/{id}/start
     */
    @PostMapping("/{id}/start")
    public ResponseEntity<?> startLiveClass(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Start live class endpoint ready",
                "endpoint", "/api/v1/live-classes/" + id + "/start",
                "id", id
        ));
    }

    /**
     * 07
     * POST /api/v1/live-classes/{id}/end
     */
    @PostMapping("/{id}/end")
    public ResponseEntity<?> endLiveClass(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "End live class endpoint ready",
                "endpoint", "/api/v1/live-classes/" + id + "/end",
                "id", id
        ));
    }

    /**
     * 08
     * GET /api/v1/live-classes/{id}/participants
     */
    @GetMapping("/{id}/participants")
    public ResponseEntity<?> getLiveClassParticipants(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get live class participants endpoint ready",
                "endpoint",
                "/api/v1/live-classes/" + id + "/participants",
                "id", id
        ));
    }
}

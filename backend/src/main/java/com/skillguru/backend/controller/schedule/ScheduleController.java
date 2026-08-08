package com.skillguru.backend.controller.schedule;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Schedules API
 * ============================================================
 *
 * GROUP 33 - SCHEDULES
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
 *     /api/v1/schedules
 *
 * 02. GET
 *     /api/v1/schedules/{id}
 *
 * 03. POST
 *     /api/v1/schedules
 *
 * 04. PUT
 *     /api/v1/schedules/{id}
 *
 * 05. DELETE
 *     /api/v1/schedules/{id}
 *
 * ============================================================
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * JWT authorization, scheduling validation and conflict
 * detection will be implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1/schedules")
public class ScheduleController {

    /**
     * 01
     * GET /api/v1/schedules
     */
    @GetMapping
    public ResponseEntity<?> getSchedules() {
        return ResponseEntity.ok(Map.of(
                "message", "Get schedules endpoint ready",
                "endpoint", "/api/v1/schedules"
        ));
    }

    /**
     * 02
     * GET /api/v1/schedules/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getScheduleById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get schedule by ID endpoint ready",
                "endpoint", "/api/v1/schedules/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/schedules
     */
    @PostMapping
    public ResponseEntity<?> createSchedule() {
        return ResponseEntity.ok(Map.of(
                "message", "Create schedule endpoint ready",
                "endpoint", "/api/v1/schedules"
        ));
    }

    /**
     * 04
     * PUT /api/v1/schedules/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> updateSchedule(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update schedule endpoint ready",
                "endpoint", "/api/v1/schedules/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/schedules/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSchedule(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete schedule endpoint ready",
                "endpoint", "/api/v1/schedules/" + id,
                "id", id
        ));
    }
}

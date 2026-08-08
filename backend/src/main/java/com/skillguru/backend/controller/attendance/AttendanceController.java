package com.skillguru.backend.controller.attendance;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Attendance API
 * ============================================================
 *
 * MASTER API CATEGORY
 * No. 34 - Attendance
 *
 * Total Endpoints: 5
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
 * MASTER ENDPOINTS
 *
 * 01. GET
 *     /api/v1/attendance
 *
 * 02. POST
 *     /api/v1/attendance/check-in
 *
 * 03. POST
 *     /api/v1/attendance/check-out
 *
 * 04. PUT
 *     /api/v1/attendance/{id}
 *
 * 05. GET
 *     /api/v1/courses/{courseId}/attendance
 *
 * ============================================================
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * JWT authorization, attendance validation and course
 * attendance processing will be implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1")
public class AttendanceController {

    /**
     * 01
     * GET /api/v1/attendance
     */
    @GetMapping("/attendance")
    public ResponseEntity<?> getAttendance() {
        return ResponseEntity.ok(Map.of(
                "message", "Get attendance endpoint ready",
                "endpoint", "/api/v1/attendance"
        ));
    }

    /**
     * 02
     * POST /api/v1/attendance/check-in
     */
    @PostMapping("/attendance/check-in")
    public ResponseEntity<?> checkIn() {
        return ResponseEntity.ok(Map.of(
                "message", "Attendance check-in endpoint ready",
                "endpoint", "/api/v1/attendance/check-in"
        ));
    }

    /**
     * 03
     * POST /api/v1/attendance/check-out
     */
    @PostMapping("/attendance/check-out")
    public ResponseEntity<?> checkOut() {
        return ResponseEntity.ok(Map.of(
                "message", "Attendance check-out endpoint ready",
                "endpoint", "/api/v1/attendance/check-out"
        ));
    }

    /**
     * 04
     * PUT /api/v1/attendance/{id}
     */
    @PutMapping("/attendance/{id}")
    public ResponseEntity<?> updateAttendance(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update attendance endpoint ready",
                "endpoint", "/api/v1/attendance/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * GET /api/v1/courses/{courseId}/attendance
     */
    @GetMapping("/courses/{courseId}/attendance")
    public ResponseEntity<?> getCourseAttendance(
            @PathVariable Long courseId) {

        return ResponseEntity.ok(Map.of(
                "message", "Get course attendance endpoint ready",
                "endpoint",
                "/api/v1/courses/" + courseId + "/attendance",
                "courseId", courseId
        ));
    }
}

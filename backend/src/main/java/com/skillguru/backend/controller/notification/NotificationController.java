package com.skillguru.backend.controller.notification;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Notifications API
 * ============================================================
 *
 * MASTER API CATEGORY
 * No. 39 - Notifications
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
 *     /api/v1/notifications
 *
 * 02. GET
 *     /api/v1/notifications/{id}
 *
 * 03. PATCH
 *     /api/v1/notifications/{id}/read
 *
 * 04. PATCH
 *     /api/v1/notifications/read-all
 *
 * 05. DELETE
 *     /api/v1/notifications/{id}
 *
 * ============================================================
 *
 * IMPORTANT:
 *
 * This controller follows the latest Master API.
 *
 * No additional notification endpoint is added.
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * JWT authorization, notification delivery and validation
 * will be implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1/notifications")
public class NotificationController {

    /**
     * 01
     * GET /api/v1/notifications
     */
    @GetMapping
    public ResponseEntity<?> getNotifications() {
        return ResponseEntity.ok(Map.of(
                "message", "Get notifications endpoint ready",
                "endpoint", "/api/v1/notifications"
        ));
    }

    /**
     * 02
     * GET /api/v1/notifications/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getNotificationById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get notification by ID endpoint ready",
                "endpoint", "/api/v1/notifications/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * PATCH /api/v1/notifications/{id}/read
     */
    @PatchMapping("/{id}/read")
    public ResponseEntity<?> markAsRead(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Mark notification as read endpoint ready",
                "endpoint", "/api/v1/notifications/" + id + "/read",
                "id", id
        ));
    }

    /**
     * 04
     * PATCH /api/v1/notifications/read-all
     */
    @PatchMapping("/read-all")
    public ResponseEntity<?> markAllAsRead() {

        return ResponseEntity.ok(Map.of(
                "message", "Mark all notifications as read endpoint ready",
                "endpoint", "/api/v1/notifications/read-all"
        ));
    }

    /**
     * 05
     * DELETE /api/v1/notifications/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteNotification(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete notification endpoint ready",
                "endpoint", "/api/v1/notifications/" + id,
                "id", id
        ));
    }
}

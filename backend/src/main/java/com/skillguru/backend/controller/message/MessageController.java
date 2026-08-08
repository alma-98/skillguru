package com.skillguru.backend.controller.message;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Messages API
 * ============================================================
 *
 * MASTER API CATEGORY
 * No. 40 - Messages
 *
 * Total Endpoints: 5
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
 *     /api/v1/messages
 *
 * 02. GET
 *     /api/v1/messages/{id}
 *
 * 03. POST
 *     /api/v1/messages
 *
 * 04. PATCH
 *     /api/v1/messages/{id}/read
 *
 * 05. DELETE
 *     /api/v1/messages/{id}
 *
 * ============================================================
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * messaging, read-state handling and validation will be
 * implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1/messages")
public class MessageController {

    /**
     * 01
     * GET /api/v1/messages
     */
    @GetMapping
    public ResponseEntity<?> getMessages() {
        return ResponseEntity.ok(Map.of(
                "message", "Get messages endpoint ready",
                "endpoint", "/api/v1/messages"
        ));
    }

    /**
     * 02
     * GET /api/v1/messages/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getMessageById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get message by ID endpoint ready",
                "endpoint", "/api/v1/messages/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/messages
     */
    @PostMapping
    public ResponseEntity<?> createMessage() {
        return ResponseEntity.ok(Map.of(
                "message", "Create message endpoint ready",
                "endpoint", "/api/v1/messages"
        ));
    }

    /**
     * 04
     * PATCH /api/v1/messages/{id}/read
     */
    @PatchMapping("/{id}/read")
    public ResponseEntity<?> markMessageAsRead(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Mark message as read endpoint ready",
                "endpoint", "/api/v1/messages/" + id + "/read",
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/messages/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMessage(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete message endpoint ready",
                "endpoint", "/api/v1/messages/" + id,
                "id", id
        ));
    }
}

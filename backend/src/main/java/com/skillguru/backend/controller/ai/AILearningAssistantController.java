package com.skillguru.backend.controller.ai;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - AI Learning Assistant API
 * ============================================================
 *
 * MASTER API CATEGORY
 * No. 45 - AI Learning Assistant
 *
 * Total Endpoints: 4
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
 * 01. POST
 *     /api/v1/ai/assistant/chat
 *
 * 02. GET
 *     /api/v1/ai/assistant/conversations
 *
 * 03. GET
 *     /api/v1/ai/assistant/conversations/{id}
 *
 * 04. DELETE
 *     /api/v1/ai/assistant/conversations/{id}
 *
 * ============================================================
 *
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, AI model
 * integration, conversation persistence and validation
 * will be implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1/ai/assistant")
public class AILearningAssistantController {

    /**
     * 01
     * POST /api/v1/ai/assistant/chat
     */
    @PostMapping("/chat")
    public ResponseEntity<?> chat() {
        return ResponseEntity.ok(Map.of(
                "message", "AI assistant chat endpoint ready",
                "endpoint", "/api/v1/ai/assistant/chat"
        ));
    }

    /**
     * 02
     * GET /api/v1/ai/assistant/conversations
     */
    @GetMapping("/conversations")
    public ResponseEntity<?> getConversations() {
        return ResponseEntity.ok(Map.of(
                "message", "Get AI assistant conversations endpoint ready",
                "endpoint", "/api/v1/ai/assistant/conversations"
        ));
    }

    /**
     * 03
     * GET /api/v1/ai/assistant/conversations/{id}
     */
    @GetMapping("/conversations/{id}")
    public ResponseEntity<?> getConversationById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get AI assistant conversation endpoint ready",
                "endpoint",
                "/api/v1/ai/assistant/conversations/" + id,
                "id", id
        ));
    }

    /**
     * 04
     * DELETE /api/v1/ai/assistant/conversations/{id}
     */
    @DeleteMapping("/conversations/{id}")
    public ResponseEntity<?> deleteConversation(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete AI assistant conversation endpoint ready",
                "endpoint",
                "/api/v1/ai/assistant/conversations/" + id,
                "id", id
        ));
    }
}

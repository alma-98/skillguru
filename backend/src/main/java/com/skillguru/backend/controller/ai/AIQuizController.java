package com.skillguru.backend.controller.ai;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - AI Quiz API
 * ============================================================
 *
 * MASTER API CATEGORY
 * No. 46 - AI Quiz
 *
 * Total Endpoints: 3
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
 *     /api/v1/ai/quiz/generate
 *
 * 02. POST
 *     /api/v1/ai/quiz/explain
 *
 * 03. POST
 *     /api/v1/ai/quiz/recommend
 *
 * ============================================================
 *
 * IMPORTANT:
 *
 * AI Quiz endpoints are POST only according to the
 * latest Master API.
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, AI model
 * integration, quiz generation, answer explanation,
 * recommendation engine and validation will be implemented
 * later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1/ai/quiz")
public class AIQuizController {

    /**
     * 01
     * POST /api/v1/ai/quiz/generate
     */
    @PostMapping("/generate")
    public ResponseEntity<?> generateQuiz() {
        return ResponseEntity.ok(Map.of(
                "message", "AI quiz generation endpoint ready",
                "endpoint", "/api/v1/ai/quiz/generate"
        ));
    }

    /**
     * 02
     * POST /api/v1/ai/quiz/explain
     */
    @PostMapping("/explain")
    public ResponseEntity<?> explainQuizAnswer() {
        return ResponseEntity.ok(Map.of(
                "message", "AI quiz explanation endpoint ready",
                "endpoint", "/api/v1/ai/quiz/explain"
        ));
    }

    /**
     * 03
     * POST /api/v1/ai/quiz/recommend
     */
    @PostMapping("/recommend")
    public ResponseEntity<?> recommendQuiz() {
        return ResponseEntity.ok(Map.of(
                "message", "AI quiz recommendation endpoint ready",
                "endpoint", "/api/v1/ai/quiz/recommend"
        ));
    }
}

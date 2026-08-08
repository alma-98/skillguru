package com.skillguru.backend.controller.quiz;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Quizzes API
 * ============================================================
 *
 * API Base:
 * /api/v1/quizzes
 *
 * Authentication:
 * JWT Bearer
 *
 * Roles:
 * ADMIN / TEACHER / MENTOR / STUDENT
 *
 * ============================================================
 *
 * MASTER API ENDPOINTS - GROUP 22
 *
 * 01. GET
 *     /api/v1/quizzes
 *     List all quizzes
 *
 * 02. GET
 *     /api/v1/quizzes/{id}
 *     Get quiz detail
 *
 * 03. POST
 *     /api/v1/quizzes
 *     Create quiz
 *
 * 04. PUT
 *     /api/v1/quizzes/{id}
 *     Update quiz
 *
 * 05. DELETE
 *     /api/v1/quizzes/{id}
 *     Delete quiz
 *
 * 06. POST
 *     /api/v1/quizzes/{id}/publish
 *     Publish quiz
 *
 * 07. POST
 *     /api/v1/quizzes/{id}/start
 *     Start quiz attempt
 *
 * 08. POST
 *     /api/v1/quizzes/{id}/submit
 *     Submit quiz attempt
 *
 * 09. GET
 *     /api/v1/quizzes/{id}/results
 *     Get quiz results
 *
 * ============================================================
 * Master API:
 * SkillGuru_Master_API_Swagger_v1.xlsx
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * JWT authorization, quiz evaluation and validation
 * will be implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1/quizzes")
public class QuizController {

    /**
     * 01
     * GET /api/v1/quizzes
     */
    @GetMapping
    public ResponseEntity<?> getQuizzes() {
        return ResponseEntity.ok(Map.of(
                "message", "Get quizzes endpoint ready",
                "endpoint", "/api/v1/quizzes"
        ));
    }

    /**
     * 02
     * GET /api/v1/quizzes/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getQuizById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get quiz by ID endpoint ready",
                "endpoint", "/api/v1/quizzes/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/quizzes
     */
    @PostMapping
    public ResponseEntity<?> createQuiz() {
        return ResponseEntity.ok(Map.of(
                "message", "Create quiz endpoint ready",
                "endpoint", "/api/v1/quizzes"
        ));
    }

    /**
     * 04
     * PUT /api/v1/quizzes/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> updateQuiz(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update quiz endpoint ready",
                "endpoint", "/api/v1/quizzes/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/quizzes/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteQuiz(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete quiz endpoint ready",
                "endpoint", "/api/v1/quizzes/" + id,
                "id", id
        ));
    }

    /**
     * 06
     * POST /api/v1/quizzes/{id}/publish
     */
    @PostMapping("/{id}/publish")
    public ResponseEntity<?> publishQuiz(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Publish quiz endpoint ready",
                "endpoint", "/api/v1/quizzes/" + id + "/publish",
                "id", id
        ));
    }

    /**
     * 07
     * POST /api/v1/quizzes/{id}/start
     */
    @PostMapping("/{id}/start")
    public ResponseEntity<?> startQuiz(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Start quiz endpoint ready",
                "endpoint", "/api/v1/quizzes/" + id + "/start",
                "id", id
        ));
    }

    /**
     * 08
     * POST /api/v1/quizzes/{id}/submit
     */
    @PostMapping("/{id}/submit")
    public ResponseEntity<?> submitQuiz(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Submit quiz endpoint ready",
                "endpoint", "/api/v1/quizzes/" + id + "/submit",
                "id", id
        ));
    }

    /**
     * 09
     * GET /api/v1/quizzes/{id}/results
     */
    @GetMapping("/{id}/results")
    public ResponseEntity<?> getQuizResults(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get quiz results endpoint ready",
                "endpoint", "/api/v1/quizzes/" + id + "/results",
                "id", id
        ));
    }
}

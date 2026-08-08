package com.skillguru.backend.controller.question;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Questions API
 * ============================================================
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
 * MASTER API ENDPOINTS - GROUP 23
 *
 * 01. GET
 *     /api/v1/quizzes/{quizId}/questions
 *     List questions belonging to a quiz
 *
 * 02. GET
 *     /api/v1/questions/{id}
 *     Get question detail
 *
 * 03. POST
 *     /api/v1/quizzes/{quizId}/questions
 *     Create question for a quiz
 *
 * 04. PUT
 *     /api/v1/questions/{id}
 *     Update question
 *
 * 05. DELETE
 *     /api/v1/questions/{id}
 *     Delete question
 *
 * 06. PATCH
 *     /api/v1/questions/{id}/order
 *     Update question order
 *
 * ============================================================
 * Master API:
 * SkillGuru_Master_API_Swagger_v1.xlsx
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * JWT authorization, quiz validation and question
 * management will be implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1")
public class QuestionController {

    /**
     * 01
     * GET /api/v1/quizzes/{quizId}/questions
     */
    @GetMapping("/quizzes/{quizId}/questions")
    public ResponseEntity<?> getQuizQuestions(
            @PathVariable Long quizId) {

        return ResponseEntity.ok(Map.of(
                "message", "Get quiz questions endpoint ready",
                "endpoint", "/api/v1/quizzes/" + quizId + "/questions",
                "quizId", quizId
        ));
    }

    /**
     * 02
     * GET /api/v1/questions/{id}
     */
    @GetMapping("/questions/{id}")
    public ResponseEntity<?> getQuestionById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get question by ID endpoint ready",
                "endpoint", "/api/v1/questions/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/quizzes/{quizId}/questions
     */
    @PostMapping("/quizzes/{quizId}/questions")
    public ResponseEntity<?> createQuizQuestion(
            @PathVariable Long quizId) {

        return ResponseEntity.ok(Map.of(
                "message", "Create quiz question endpoint ready",
                "endpoint", "/api/v1/quizzes/" + quizId + "/questions",
                "quizId", quizId
        ));
    }

    /**
     * 04
     * PUT /api/v1/questions/{id}
     */
    @PutMapping("/questions/{id}")
    public ResponseEntity<?> updateQuestion(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update question endpoint ready",
                "endpoint", "/api/v1/questions/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/questions/{id}
     */
    @DeleteMapping("/questions/{id}")
    public ResponseEntity<?> deleteQuestion(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete question endpoint ready",
                "endpoint", "/api/v1/questions/" + id,
                "id", id
        ));
    }

    /**
     * 06
     * PATCH /api/v1/questions/{id}/order
     */
    @PatchMapping("/questions/{id}/order")
    public ResponseEntity<?> updateQuestionOrder(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update question order endpoint ready",
                "endpoint", "/api/v1/questions/" + id + "/order",
                "id", id
        ));
    }
}

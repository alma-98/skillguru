package com.skillguru.backend.controller.questionoption;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Question Options API
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
 * MASTER API ENDPOINTS - GROUP 24
 *
 * 01. GET
 *     /api/v1/questions/{questionId}/options
 *     List options belonging to a question
 *
 * 02. GET
 *     /api/v1/options/{id}
 *     Get option detail
 *
 * 03. POST
 *     /api/v1/questions/{questionId}/options
 *     Create option for a question
 *
 * 04. PUT
 *     /api/v1/options/{id}
 *     Update option
 *
 * 05. DELETE
 *     /api/v1/options/{id}
 *     Delete option
 *
 * ============================================================
 * Master API:
 * SkillGuru_Master_API_Swagger_v1.xlsx
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * JWT authorization, quiz validation and question-option
 * management will be implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1")
public class QuestionOptionController {

    /**
     * 01
     * GET /api/v1/questions/{questionId}/options
     */
    @GetMapping("/questions/{questionId}/options")
    public ResponseEntity<?> getQuestionOptions(
            @PathVariable Long questionId) {

        return ResponseEntity.ok(Map.of(
                "message", "Get question options endpoint ready",
                "endpoint", "/api/v1/questions/" + questionId + "/options",
                "questionId", questionId
        ));
    }

    /**
     * 02
     * GET /api/v1/options/{id}
     */
    @GetMapping("/options/{id}")
    public ResponseEntity<?> getOptionById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get option by ID endpoint ready",
                "endpoint", "/api/v1/options/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/questions/{questionId}/options
     */
    @PostMapping("/questions/{questionId}/options")
    public ResponseEntity<?> createQuestionOption(
            @PathVariable Long questionId) {

        return ResponseEntity.ok(Map.of(
                "message", "Create question option endpoint ready",
                "endpoint", "/api/v1/questions/" + questionId + "/options",
                "questionId", questionId
        ));
    }

    /**
     * 04
     * PUT /api/v1/options/{id}
     */
    @PutMapping("/options/{id}")
    public ResponseEntity<?> updateOption(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update option endpoint ready",
                "endpoint", "/api/v1/options/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/options/{id}
     */
    @DeleteMapping("/options/{id}")
    public ResponseEntity<?> deleteOption(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete option endpoint ready",
                "endpoint", "/api/v1/options/" + id,
                "id", id
        ));
    }
}

package com.skillguru.backend.controller.discussion;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Discussions API
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
 * MASTER API ENDPOINTS - GROUP 30
 *
 * 01. GET
 *     /api/v1/discussions
 *     List all discussions
 *
 * 02. GET
 *     /api/v1/discussions/{id}
 *     Get discussion detail
 *
 * 03. POST
 *     /api/v1/discussions
 *     Create discussion
 *
 * 04. PUT
 *     /api/v1/discussions/{id}
 *     Update discussion
 *
 * 05. DELETE
 *     /api/v1/discussions/{id}
 *     Delete discussion
 *
 * 06. GET
 *     /api/v1/discussions/{id}/comments
 *     Get discussion comments
 *
 * 07. POST
 *     /api/v1/discussions/{id}/comments
 *     Create discussion comment
 *
 * ============================================================
 * Master API:
 * SkillGuru_Master_API_Swagger_v1.xlsx
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * JWT authorization, comments and validation will be
 * implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1")
public class DiscussionController {

    /**
     * 01
     * GET /api/v1/discussions
     */
    @GetMapping("/discussions")
    public ResponseEntity<?> getDiscussions() {
        return ResponseEntity.ok(Map.of(
                "message", "Get discussions endpoint ready",
                "endpoint", "/api/v1/discussions"
        ));
    }

    /**
     * 02
     * GET /api/v1/discussions/{id}
     */
    @GetMapping("/discussions/{id}")
    public ResponseEntity<?> getDiscussionById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get discussion by ID endpoint ready",
                "endpoint", "/api/v1/discussions/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/discussions
     */
    @PostMapping("/discussions")
    public ResponseEntity<?> createDiscussion() {
        return ResponseEntity.ok(Map.of(
                "message", "Create discussion endpoint ready",
                "endpoint", "/api/v1/discussions"
        ));
    }

    /**
     * 04
     * PUT /api/v1/discussions/{id}
     */
    @PutMapping("/discussions/{id}")
    public ResponseEntity<?> updateDiscussion(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update discussion endpoint ready",
                "endpoint", "/api/v1/discussions/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/discussions/{id}
     */
    @DeleteMapping("/discussions/{id}")
    public ResponseEntity<?> deleteDiscussion(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete discussion endpoint ready",
                "endpoint", "/api/v1/discussions/" + id,
                "id", id
        ));
    }

    /**
     * 06
     * GET /api/v1/discussions/{id}/comments
     */
    @GetMapping("/discussions/{id}/comments")
    public ResponseEntity<?> getDiscussionComments(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get discussion comments endpoint ready",
                "endpoint", "/api/v1/discussions/" + id + "/comments",
                "discussionId", id
        ));
    }

    /**
     * 07
     * POST /api/v1/discussions/{id}/comments
     */
    @PostMapping("/discussions/{id}/comments")
    public ResponseEntity<?> createDiscussionComment(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Create discussion comment endpoint ready",
                "endpoint", "/api/v1/discussions/" + id + "/comments",
                "discussionId", id
        ));
    }
}

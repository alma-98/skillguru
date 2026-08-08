package com.skillguru.backend.controller.comment;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Comments API
 * ============================================================
 *
 * GROUP 31 - COMMENTS
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
 * MASTER API ENDPOINTS - GROUP 31
 *
 * 01. PUT
 *     /api/v1/comments/{id}
 *     Update comment
 *
 * 02. DELETE
 *     /api/v1/comments/{id}
 *     Delete comment
 *
 * ============================================================
 *
 * IMPORTANT:
 *
 * Discussion comment creation/listing belongs to GROUP 30:
 *
 * GET
 * /api/v1/discussions/{id}/comments
 *
 * POST
 * /api/v1/discussions/{id}/comments
 *
 * This controller only contains the two comment
 * management endpoints defined by the master API.
 *
 * ============================================================
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * JWT authorization and validation will be implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {

    /**
     * 01
     * PUT /api/v1/comments/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> updateComment(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update comment endpoint ready",
                "endpoint", "/api/v1/comments/" + id,
                "id", id
        ));
    }

    /**
     * 02
     * DELETE /api/v1/comments/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteComment(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete comment endpoint ready",
                "endpoint", "/api/v1/comments/" + id,
                "id", id
        ));
    }
}

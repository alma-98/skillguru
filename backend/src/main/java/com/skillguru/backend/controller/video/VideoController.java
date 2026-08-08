package com.skillguru.backend.controller.video;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Videos API
 * ============================================================
 *
 * API Base:
 * /api/v1/videos
 *
 * Authentication:
 * JWT Bearer
 *
 * Roles:
 * ADMIN / TEACHER / MENTOR / STUDENT
 *
 * ============================================================
 *
 * MASTER API ENDPOINTS - GROUP 20
 *
 * 01. GET
 *     /api/v1/videos
 *     List all videos
 *
 * 02. GET
 *     /api/v1/videos/{id}
 *     Get video detail
 *
 * 03. POST
 *     /api/v1/videos
 *     Create video
 *
 * 04. PUT
 *     /api/v1/videos/{id}
 *     Update video
 *
 * 05. DELETE
 *     /api/v1/videos/{id}
 *     Delete video
 *
 * 06. POST
 *     /api/v1/videos/{id}/process
 *     Process video
 *
 * 07. GET
 *     /api/v1/videos/{id}/stream
 *     Stream video
 *
 * 08. GET
 *     /api/v1/videos/{id}/progress
 *     Get video progress
 *
 * ============================================================
 * Master API:
 * SkillGuru_Master_API_Swagger_v1.xlsx
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * JWT authorization, storage integration and validation
 * will be implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1/videos")
public class VideoController {

    /**
     * 01
     * GET /api/v1/videos
     */
    @GetMapping
    public ResponseEntity<?> getVideos() {
        return ResponseEntity.ok(Map.of(
                "message", "Get videos endpoint ready",
                "endpoint", "/api/v1/videos"
        ));
    }

    /**
     * 02
     * GET /api/v1/videos/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getVideoById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get video by ID endpoint ready",
                "endpoint", "/api/v1/videos/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/videos
     */
    @PostMapping
    public ResponseEntity<?> createVideo() {
        return ResponseEntity.ok(Map.of(
                "message", "Create video endpoint ready",
                "endpoint", "/api/v1/videos"
        ));
    }

    /**
     * 04
     * PUT /api/v1/videos/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> updateVideo(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update video endpoint ready",
                "endpoint", "/api/v1/videos/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/videos/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteVideo(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete video endpoint ready",
                "endpoint", "/api/v1/videos/" + id,
                "id", id
        ));
    }

    /**
     * 06
     * POST /api/v1/videos/{id}/process
     */
    @PostMapping("/{id}/process")
    public ResponseEntity<?> processVideo(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Process video endpoint ready",
                "endpoint", "/api/v1/videos/" + id + "/process",
                "id", id
        ));
    }

    /**
     * 07
     * GET /api/v1/videos/{id}/stream
     */
    @GetMapping("/{id}/stream")
    public ResponseEntity<?> streamVideo(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Stream video endpoint ready",
                "endpoint", "/api/v1/videos/" + id + "/stream",
                "id", id
        ));
    }

    /**
     * 08
     * GET /api/v1/videos/{id}/progress
     */
    @GetMapping("/{id}/progress")
    public ResponseEntity<?> getVideoProgress(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get video progress endpoint ready",
                "endpoint", "/api/v1/videos/" + id + "/progress",
                "id", id
        ));
    }
}

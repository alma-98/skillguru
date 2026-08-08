package com.skillguru.backend.controller.progress;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Progress API
 * ============================================================
 *
 * GROUP 26 - PROGRESS
 *
 * MASTER ENDPOINTS
 *
 * 01. GET
 *     /api/v1/progress
 *
 * 02. GET
 *     /api/v1/progress/{id}
 *
 * 03. POST
 *     /api/v1/progress
 *
 * 04. PUT
 *     /api/v1/progress/{id}
 *
 * 05. POST
 *     /api/v1/progress/lessons/{lessonId}/complete
 *
 * 06. POST
 *     /api/v1/progress/videos/{videoId}/watch
 *
 * 07. GET
 *     /api/v1/students/{studentId}/progress
 *
 * ============================================================
 *
 * REMOVED FROM PREVIOUS IMPLEMENTATION
 *
 * DELETE /api/v1/progress/{id}
 * GET    /api/v1/courses/{courseId}/progress
 *
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1")
public class ProgressController {

    /**
     * 01
     * GET /api/v1/progress
     */
    @GetMapping("/progress")
    public ResponseEntity<?> getProgress() {
        return ResponseEntity.ok(Map.of(
                "message", "Get progress endpoint ready",
                "endpoint", "/api/v1/progress"
        ));
    }

    /**
     * 02
     * GET /api/v1/progress/{id}
     */
    @GetMapping("/progress/{id}")
    public ResponseEntity<?> getProgressById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get progress by ID endpoint ready",
                "endpoint", "/api/v1/progress/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/progress
     */
    @PostMapping("/progress")
    public ResponseEntity<?> createProgress() {
        return ResponseEntity.ok(Map.of(
                "message", "Create progress endpoint ready",
                "endpoint", "/api/v1/progress"
        ));
    }

    /**
     * 04
     * PUT /api/v1/progress/{id}
     */
    @PutMapping("/progress/{id}")
    public ResponseEntity<?> updateProgress(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Update progress endpoint ready",
                "endpoint", "/api/v1/progress/" + id,
                "id", id
        ));
    }

    /**
     * 05
     * POST /api/v1/progress/lessons/{lessonId}/complete
     */
    @PostMapping("/progress/lessons/{lessonId}/complete")
    public ResponseEntity<?> completeLesson(
            @PathVariable Long lessonId) {

        return ResponseEntity.ok(Map.of(
                "message", "Complete lesson progress endpoint ready",
                "endpoint",
                "/api/v1/progress/lessons/" + lessonId + "/complete",
                "lessonId", lessonId
        ));
    }

    /**
     * 06
     * POST /api/v1/progress/videos/{videoId}/watch
     */
    @PostMapping("/progress/videos/{videoId}/watch")
    public ResponseEntity<?> watchVideo(
            @PathVariable Long videoId) {

        return ResponseEntity.ok(Map.of(
                "message", "Watch video progress endpoint ready",
                "endpoint",
                "/api/v1/progress/videos/" + videoId + "/watch",
                "videoId", videoId
        ));
    }

    /**
     * 07
     * GET /api/v1/students/{studentId}/progress
     */
    @GetMapping("/students/{studentId}/progress")
    public ResponseEntity<?> getStudentProgress(
            @PathVariable Long studentId) {

        return ResponseEntity.ok(Map.of(
                "message", "Get student progress endpoint ready",
                "endpoint",
                "/api/v1/students/" + studentId + "/progress",
                "studentId", studentId
        ));
    }
}

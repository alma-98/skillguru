package com.skillguru.backend.controller.ai;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * SkillGuru
 * Group 44 - AI Recommendation
 *
 * MASTER ENDPOINTS:
 *
 * GET  /api/v1/ai/recommendations
 * GET  /api/v1/ai/recommendations/courses
 * GET  /api/v1/ai/recommendations/learning-path
 * POST /api/v1/ai/recommendations/refresh
 */
@RestController
@RequestMapping("/api/v1/ai/recommendations")
public class AIRecommendationController {

    @GetMapping
    public ResponseEntity<?> getRecommendations() {
        return ResponseEntity.ok(Map.of(
                "message", "AI recommendations endpoint ready",
                "endpoint", "/api/v1/ai/recommendations"
        ));
    }

    @GetMapping("/courses")
    public ResponseEntity<?> getCourseRecommendations() {
        return ResponseEntity.ok(Map.of(
                "message", "AI course recommendations endpoint ready",
                "endpoint", "/api/v1/ai/recommendations/courses"
        ));
    }

    @GetMapping("/learning-path")
    public ResponseEntity<?> getLearningPathRecommendations() {
        return ResponseEntity.ok(Map.of(
                "message", "AI learning path recommendations endpoint ready",
                "endpoint", "/api/v1/ai/recommendations/learning-path"
        ));
    }

    @PostMapping("/refresh")
    public ResponseEntity<?> refreshRecommendations() {
        return ResponseEntity.ok(Map.of(
                "message", "AI recommendation refresh endpoint ready",
                "endpoint", "/api/v1/ai/recommendations/refresh"
        ));
    }
}

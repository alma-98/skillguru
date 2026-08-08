package com.skillguru.backend.controller.file;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Files / Media API
 * ============================================================
 *
 * API Base:
 * /api/v1/files
 *
 * Authentication:
 * JWT Bearer
 *
 * Roles:
 * ADMIN / TEACHER / MENTOR / STUDENT
 *
 * ============================================================
 *
 * MASTER API ENDPOINTS - GROUP 21
 *
 * 01. POST
 *     /api/v1/files/upload
 *     Upload file / media
 *
 * 02. POST
 *     /api/v1/files/presigned-url
 *     Generate presigned upload/download URL
 *
 * 03. GET
 *     /api/v1/files/{id}
 *     Get file / media detail
 *
 * 04. GET
 *     /api/v1/files/{id}/download
 *     Download file / media
 *
 * 05. DELETE
 *     /api/v1/files/{id}
 *     Delete file / media
 *
 * ============================================================
 * Master API:
 * SkillGuru_Master_API_Swagger_v1.xlsx
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * object storage integration, JWT authorization and
 * validation will be implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1/files")
public class FileController {

    /**
     * 01
     * POST /api/v1/files/upload
     */
    @PostMapping("/upload")
    public ResponseEntity<?> uploadFile() {
        return ResponseEntity.ok(Map.of(
                "message", "Upload file endpoint ready",
                "endpoint", "/api/v1/files/upload"
        ));
    }

    /**
     * 02
     * POST /api/v1/files/presigned-url
     */
    @PostMapping("/presigned-url")
    public ResponseEntity<?> generatePresignedUrl() {
        return ResponseEntity.ok(Map.of(
                "message", "Generate presigned URL endpoint ready",
                "endpoint", "/api/v1/files/presigned-url"
        ));
    }

    /**
     * 03
     * GET /api/v1/files/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getFileById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get file by ID endpoint ready",
                "endpoint", "/api/v1/files/" + id,
                "id", id
        ));
    }

    /**
     * 04
     * GET /api/v1/files/{id}/download
     */
    @GetMapping("/{id}/download")
    public ResponseEntity<?> downloadFile(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Download file endpoint ready",
                "endpoint", "/api/v1/files/" + id + "/download",
                "id", id
        ));
    }

    /**
     * 05
     * DELETE /api/v1/files/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteFile(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete file endpoint ready",
                "endpoint", "/api/v1/files/" + id,
                "id", id
        ));
    }
}

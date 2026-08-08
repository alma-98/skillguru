package com.skillguru.backend.controller.certificate;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ============================================================
 * SkillGuru - Certificates API
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
 * MASTER API ENDPOINTS - GROUP 27
 *
 * 01. GET
 *     /api/v1/certificates
 *     List all certificates
 *
 * 02. GET
 *     /api/v1/certificates/{id}
 *     Get certificate detail
 *
 * 03. POST
 *     /api/v1/certificates
 *     Create certificate
 *
 * 04. GET
 *     /api/v1/certificates/{id}/download
 *     Download certificate
 *
 * 05. GET
 *     /api/v1/certificates/verify/{code}
 *     Verify certificate by code
 *
 * 06. DELETE
 *     /api/v1/certificates/{id}
 *     Delete certificate
 *
 * ============================================================
 * Master API:
 * SkillGuru_Master_API_Swagger_v1.xlsx
 *
 * Current implementation:
 * Endpoint skeleton only.
 *
 * Business logic, DTO, service, repository, database,
 * JWT authorization, certificate generation, PDF generation,
 * verification and validation will be implemented later.
 * ============================================================
 */
@RestController
@RequestMapping("/api/v1/certificates")
public class CertificateController {

    /**
     * 01
     * GET /api/v1/certificates
     */
    @GetMapping
    public ResponseEntity<?> getCertificates() {
        return ResponseEntity.ok(Map.of(
                "message", "Get certificates endpoint ready",
                "endpoint", "/api/v1/certificates"
        ));
    }

    /**
     * 02
     * GET /api/v1/certificates/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getCertificateById(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Get certificate by ID endpoint ready",
                "endpoint", "/api/v1/certificates/" + id,
                "id", id
        ));
    }

    /**
     * 03
     * POST /api/v1/certificates
     */
    @PostMapping
    public ResponseEntity<?> createCertificate() {
        return ResponseEntity.ok(Map.of(
                "message", "Create certificate endpoint ready",
                "endpoint", "/api/v1/certificates"
        ));
    }

    /**
     * 04
     * GET /api/v1/certificates/{id}/download
     */
    @GetMapping("/{id}/download")
    public ResponseEntity<?> downloadCertificate(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Download certificate endpoint ready",
                "endpoint", "/api/v1/certificates/" + id + "/download",
                "id", id
        ));
    }

    /**
     * 05
     * GET /api/v1/certificates/verify/{code}
     */
    @GetMapping("/verify/{code}")
    public ResponseEntity<?> verifyCertificate(
            @PathVariable String code) {

        return ResponseEntity.ok(Map.of(
                "message", "Verify certificate endpoint ready",
                "endpoint", "/api/v1/certificates/verify/" + code,
                "code", code
        ));
    }

    /**
     * 06
     * DELETE /api/v1/certificates/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCertificate(
            @PathVariable Long id) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete certificate endpoint ready",
                "endpoint", "/api/v1/certificates/" + id,
                "id", id
        ));
    }
}

package com.skillguru.backend.controller.rolepermission;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * SkillGuru
 * Group 52 - Role Permissions
 *
 * MASTER ENDPOINTS:
 *
 * GET    /api/v1/roles/{roleId}/permissions
 * POST   /api/v1/roles/{roleId}/permissions
 * DELETE /api/v1/roles/{roleId}/permissions/{permissionId}
 */
@RestController
@RequestMapping("/api/v1/roles")
public class RolePermissionController {

    @GetMapping("/{roleId}/permissions")
    public ResponseEntity<?> getRolePermissions(
            @PathVariable Long roleId) {

        return ResponseEntity.ok(Map.of(
                "message", "Get role permissions endpoint ready",
                "endpoint",
                "/api/v1/roles/" + roleId + "/permissions",
                "roleId", roleId
        ));
    }

    @PostMapping("/{roleId}/permissions")
    public ResponseEntity<?> createRolePermission(
            @PathVariable Long roleId) {

        return ResponseEntity.ok(Map.of(
                "message", "Create role permission endpoint ready",
                "endpoint",
                "/api/v1/roles/" + roleId + "/permissions",
                "roleId", roleId
        ));
    }

    @DeleteMapping("/{roleId}/permissions/{permissionId}")
    public ResponseEntity<?> deleteRolePermission(
            @PathVariable Long roleId,
            @PathVariable Long permissionId) {

        return ResponseEntity.ok(Map.of(
                "message", "Delete role permission endpoint ready",
                "endpoint",
                "/api/v1/roles/" + roleId
                        + "/permissions/" + permissionId,
                "roleId", roleId,
                "permissionId", permissionId
        ));
    }
}

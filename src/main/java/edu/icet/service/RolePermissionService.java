package edu.icet.service;

import edu.icet.dto.RolePermissionDto;

import java.util.List;

public interface RolePermissionService {
    void addRolePermission(RolePermissionDto rolePermissionDto);
    void updateRolePermission(RolePermissionDto rolePermissionDto);
    void deleteRolePermission(Integer id);
    RolePermissionDto searchById(Integer id);
    List<RolePermissionDto> getAll();
}

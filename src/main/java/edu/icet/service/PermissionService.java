package edu.icet.service;

import edu.icet.dto.PermissionDto;

import java.util.List;

public interface PermissionService {
    void addPermission(PermissionDto permissionDto);
    void updatePermission(PermissionDto permissionDto);
    void deletePermission(Integer id);
    PermissionDto searchById(Integer id);
    List<PermissionDto> getAll();
}

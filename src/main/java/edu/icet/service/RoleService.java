package edu.icet.service;

import edu.icet.dto.RoleDto;

import java.util.List;

public interface RoleService {
    void addRole(RoleDto roleDto);
    void updateRole(RoleDto roleDto);
    void deleteRole(Integer id);
    RoleDto searchById(Integer id);
    List<RoleDto> getAll();
}

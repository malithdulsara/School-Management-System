package edu.icet.controller;

import edu.icet.dto.RolePermissionDto;
import edu.icet.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rolePermission")
public class RolePermissionController {
    @Autowired
    RolePermissionService service;

    @PostMapping("/add")
    public void addRolePermission(@RequestBody RolePermissionDto rolePermissionDto) {
        service.addRolePermission(rolePermissionDto);
    }

    @PutMapping("/update")
    public void updateRolePermission(@RequestBody RolePermissionDto rolePermissionDto) {
        service.updateRolePermission(rolePermissionDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRolePermission(@PathVariable Integer id) {
        service.deleteRolePermission(id);
    }

    @GetMapping("/get/{id}")
    public RolePermissionDto getRolePermission(@PathVariable Integer id) {
        return service.searchById(id);
    }

    @GetMapping("/get-All")
    public List<RolePermissionDto> getAllRolePermissions() {
        return service.getAll();
    }

}

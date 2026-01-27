package edu.icet.controller;

import edu.icet.dto.PermissionDto;
import edu.icet.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/permission")
public class PermissionController {
    @Autowired
    PermissionService service;

    @PostMapping("/add")
    public void addPermission(@RequestBody PermissionDto permissionDto){
        service.addPermission(permissionDto);
    }

    @PutMapping("/update")
    public void updatePermission(@RequestBody PermissionDto permissionDto){
        service.updatePermission(permissionDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePermission(@PathVariable Integer id){
        service.deletePermission(id);
    }

    @GetMapping("/get/{id}")
    public PermissionDto getPermission(@PathVariable Integer id){
        return service.searchById(id);
    }

    @GetMapping("/get-All")
    public List<PermissionDto> getAllPermissions(){
        return service.getAll();
    }
}

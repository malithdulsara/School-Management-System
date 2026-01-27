package edu.icet.controller;

import edu.icet.dto.RoleDto;
import edu.icet.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    RoleService service;

    @PostMapping("/add")
    public void addRole(@RequestBody RoleDto roleDto){
        service.addRole(roleDto);
    }

    @PutMapping("/update")
    public void updateRole(@RequestBody  RoleDto roleDto){
        service.updateRole(roleDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRole(@PathVariable Integer id){
        service.deleteRole(id);
    }

    @GetMapping("/get/{id}")
    public RoleDto getRole(@PathVariable Integer id){
        return service.searchById(id);
    }

    @GetMapping("/get-All")
    public List<RoleDto> getAllRolles(){
        return service.getAll();
    }
}

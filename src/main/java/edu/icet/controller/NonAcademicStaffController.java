package edu.icet.controller;

import edu.icet.dto.NonAcademicStaffDto;
import edu.icet.service.NonAcademicStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nonAcademicStaff")
public class NonAcademicStaffController {
    @Autowired
    NonAcademicStaffService service;

    @PostMapping("/add")
    public void addNonAcademicStaff(@RequestBody NonAcademicStaffDto nonAcademicStaffDto){
        service.addNonAcademicStaff(nonAcademicStaffDto);
    }

    @PutMapping("/update")
    public void updateNonAcademicStaff(@RequestBody NonAcademicStaffDto nonAcademicStaffDto){
        service.addNonAcademicStaff(nonAcademicStaffDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteNonAcademicStaff(@PathVariable Integer id){
        service.deleteAcademicStaff(id);
    }

    @GetMapping("/get/{id}")
    public NonAcademicStaffDto getNonAcademicStaff(@PathVariable Integer id){
        return service.searchById(id);
    }

    @GetMapping("/get-All")
    public List<NonAcademicStaffDto> getAllNonAcademicStaff(){
        return service.getAll();
    }
}

package edu.icet.controller;

import edu.icet.dto.SchoolDto;
import edu.icet.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/school")
public class SchoolController {
    @Autowired
    SchoolService service;

    @PostMapping("/add")
    public void addSchool(@RequestBody SchoolDto schoolDto){
        service.addSchool(schoolDto);
    }

    @PutMapping("/update")
    public void updateSchool(@RequestBody SchoolDto schoolDto) {
        service.updateSchool(schoolDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSchool(@PathVariable Integer id) {
        service.deleteSchool(id);
    }

    @GetMapping("/get/{id}")
    public SchoolDto getSchool(@PathVariable Integer id) {
        return service.searchById(id);
    }

    @GetMapping("/get-All")
    public List<SchoolDto> getAllSchools() {
        return service.getAll();
    }
}

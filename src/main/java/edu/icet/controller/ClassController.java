package edu.icet.controller;

import edu.icet.dto.ClassDto;
import edu.icet.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/class")
public class ClassController {
    @Autowired
    ClassService service;

    @PostMapping("/add")
    public void addClass(@RequestBody ClassDto classDto){
        service.addClass(classDto);
    }

    @PutMapping("/update")
    public void updateClass(@RequestBody ClassDto classDto){
        service.updateClass(classDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteClass(@PathVariable Integer id){
        service.deleteClass(id);
    }

    @GetMapping("/get/{id}")
    public ClassDto getClassDetails(@PathVariable Integer id){
        return service.searchById(id);
    }

    @GetMapping("/get-All")
    public List<ClassDto> getAllClassDetails(){
        return service.getAll();
    }
}

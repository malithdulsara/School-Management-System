package edu.icet.controller;

import edu.icet.dto.TeacherDto;
import edu.icet.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("teacher")
public class TeacherController {
    @Autowired
    TeacherService service;

    @PostMapping("/add")
    public void add(@RequestBody TeacherDto teacherDto){
        service.add(teacherDto);
    }

    @PutMapping("/update")
    public void update(@RequestBody TeacherDto teacherDto){
        service.update(teacherDto);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }

    @GetMapping("/getAll")
    public List<TeacherDto> getAll(){
       return service.getAll();
    }

    @GetMapping("/get/{id}")
    public TeacherDto searchById(@PathVariable Integer id){
        return service.searchById(id);
    }
}

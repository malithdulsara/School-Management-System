package edu.icet.controller;

import edu.icet.dto.StudentParentDto;
import edu.icet.service.StudentParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentParent")
public class StudentParentController {
    @Autowired
    StudentParentService service;

    @PostMapping("/add")
    public void addStudentParent(@RequestBody StudentParentDto studentParentDto) {
        service.addStudentParent(studentParentDto);
    }

    @PutMapping("/update")
    public void updateStudentParent(@RequestBody StudentParentDto studentParentDto) {
        service.updateStudentParent(studentParentDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudentParent(@PathVariable Integer id) {
        service.deleteStudentParent(id);
    }

    @GetMapping("/get/{id}")
    public StudentParentDto getStudentParent(@PathVariable Integer id) {
        return service.searchById(id);
    }

    @GetMapping("/get-All")
    public List<StudentParentDto> getAllStudentParents() {
        return service.getAll();
    }
}

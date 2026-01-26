package edu.icet.controller;

import edu.icet.dto.StudentDto;
import edu.icet.entity.StudentEntity;
import edu.icet.service.StudentService;
import org.springframework.web.bind.annotation.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController{
    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public void addStudent(@RequestBody StudentDto student){
        studentService.addStudent(student);
    }

    @PutMapping("/update")
    public void updateStudent(@RequestBody StudentDto student){
        studentService.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Integer id){
        studentService.deleteStudent(id);
    }

    @GetMapping("/get/{id}")
    public StudentDto getStudent(@PathVariable Integer id){
        return studentService.searchById(id);
    }

    @GetMapping("/get-All")
    public List<StudentDto> getAll(){
        return studentService.getAll();
    }
}

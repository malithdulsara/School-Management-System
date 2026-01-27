package edu.icet.controller;

import edu.icet.dto.StudentFeeDto;
import edu.icet.service.StudentFeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentFee")
public class StudentFeeController {
    @Autowired
    StudentFeeService service;

    @PostMapping("/add")
    public void addStudentFee(@RequestBody StudentFeeDto studentFeeDto){
        service.addStudentFee(studentFeeDto);
    }

    @PutMapping("/update")
    public void updateStudentFee(@RequestBody StudentFeeDto studentFeeDto) {
        service.updateStudentFee(studentFeeDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudentFee(@PathVariable Integer id) {
        service.deleteeStudentFee(id);
    }

    @GetMapping("/get/{id}")
    public StudentFeeDto getStudentFee(@PathVariable Integer id) {
        return service.searchById(id);
    }

    @GetMapping("/get-All")
    public List<StudentFeeDto> getAllStudentFees() {
        return service.getAll();
    }
}

package edu.icet.controller;

import edu.icet.dto.StudentAttendanceDto;
import edu.icet.service.StudentAttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentAttendance")
public class StudentAttendanceController {
    @Autowired
    StudentAttendanceService service;

    @PostMapping("/add")
    public void addStudentAttendance(@RequestBody StudentAttendanceDto studentAttendanceDto){
        service.addStudentAttendance(studentAttendanceDto);
    }

    @PutMapping("/update")
    public void updateStudentAttendance(@RequestBody StudentAttendanceDto studentAttendanceDto) {
        service.updateStudentAttendance(studentAttendanceDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudentAttendance(@PathVariable Integer id) {
        service.deleteStudentAttendance(id);
    }

    @GetMapping("/get/{id}")
    public StudentAttendanceDto getStudentAttendance(@PathVariable Integer id) {
        return service.searchById(id);
    }

    @GetMapping("/get-All")
    public List<StudentAttendanceDto> getAllStudentAttendances() {
        return service.getAll();
    }

}

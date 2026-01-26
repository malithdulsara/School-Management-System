package edu.icet.controller;

import edu.icet.dto.ExamDto;
import edu.icet.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exam")
public class ExamController {
    @Autowired
    ExamService service;

    @PostMapping("/add")
    public void addExam(@RequestBody ExamDto examDto){
        service.addExam(examDto);
    }

    @PutMapping("/update")
    public void updateExam(@RequestBody ExamDto examDto){
        service.updateExam(examDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteExam(@PathVariable Integer id){
        service.deleteExam(id);
    }

    @GetMapping("/get/{id}")
    public ExamDto getExamDetails(@PathVariable Integer id){
        return  service.searchById(id);
    }

    @GetMapping("/get-All")
    public List<ExamDto> getExamDetails(){
        return service.getAll();
    }
}

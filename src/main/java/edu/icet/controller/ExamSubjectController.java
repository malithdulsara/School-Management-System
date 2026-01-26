package edu.icet.controller;

import edu.icet.dto.ExamSubjectDto;
import edu.icet.service.ExamSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/examSubject")
public class ExamSubjectController {
    @Autowired
    ExamSubjectService service;

    @PostMapping("/add")
    public void addExamSubject(@RequestBody ExamSubjectDto examSubjectDto){
        service.addExamSubject(examSubjectDto);
    }

    @PutMapping("/update")
    public void updateExamSubject(@RequestBody ExamSubjectDto examSubjectDto){
        service.updateExamSubject(examSubjectDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteExamSubject(@PathVariable Integer id){
        service.deleteExamSubject(id);
    }

    @GetMapping("/get/{id}")
    public ExamSubjectDto getExamSubject(@PathVariable Integer id){
        return service.searchById(id);
    }

    @GetMapping("/get-All")
    public List<ExamSubjectDto> getAllExamSubjects(){
        return service.getAll();
    }

}

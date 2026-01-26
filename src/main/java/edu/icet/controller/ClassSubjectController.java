package edu.icet.controller;

import edu.icet.dto.ClassSubjectDto;
import edu.icet.service.ClassSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classSubject")
public class ClassSubjectController {
    @Autowired
    ClassSubjectService service;

    @PostMapping("/add")
    public void addClassSubject(@PathVariable ClassSubjectDto classSubjectDto){
        service.addClassSubject(classSubjectDto);
    }

    @PutMapping("/update")
    public void updateClassSubject(@PathVariable ClassSubjectDto classSubjectDto){
        service.updateClassSubject(classSubjectDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteClassSubject(Integer id){
        service.deleteClassSubject(id);
    }

    @GetMapping("/get/{id}")
    public ClassSubjectDto getClassSubject(Integer id){
        return service.searchById(id);
    }

    @GetMapping("/get-All")
    public List<ClassSubjectDto> getClassSubjects(){
        return service.getAll();
    }
}

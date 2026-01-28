package edu.icet.controller;

import edu.icet.dto.SubjectDto;
import edu.icet.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subjects")
public class SubjectController {
    @Autowired
    SubjectService service;

    @PostMapping("/add")
    public void addSubject(@RequestBody SubjectDto subjectDto) {
        service.addSubject(subjectDto);
    }

    @PutMapping("/update")
    public void updateSubject(@RequestBody SubjectDto subjectDto) {
        service.updateSubjectDto(subjectDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSubject(@PathVariable Integer id) {
        service.deleteSubject(id);
    }

    @GetMapping("/get/{id}")
    public SubjectDto getSubjectById(@PathVariable Integer id) {
        return service.searchById(id);
    }

    @GetMapping("/getAll")
    public List<SubjectDto> getAllSubjects() {
        return service.getAll();
    }
}

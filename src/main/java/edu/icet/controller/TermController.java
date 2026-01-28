package edu.icet.controller;

import edu.icet.dto.TermDto;
import edu.icet.service.TermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/terms")
public class TermController {
    @Autowired
    TermService service;

    @PostMapping("/add")
    public void addTerm(@RequestBody TermDto termDto) {
        service.addTerm(termDto);
    }

    @PutMapping("/update")
    public void updateTerm(@RequestBody TermDto termDto) {
        service.updateTerm(termDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTerm(@PathVariable Integer id) {
        service.deleteTerm(id);
    }

    @GetMapping("/get/{id}")
    public TermDto getTermById(@PathVariable Integer id) {
        return service.searchById(id);
    }

    @GetMapping("/getAll")
    public List<TermDto> getAllTerms() {
        return service.getALL();
    }
}

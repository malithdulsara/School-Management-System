package edu.icet.controller;

import edu.icet.dto.MarkDto;
import edu.icet.service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mark")
public class MarkController {
    @Autowired
    MarkService service;

    @PostMapping("/add")
    public void addMark(@RequestBody MarkDto markDto){
        service.addMark(markDto);
    }

    @PutMapping("/update")
    public void updateMark(@RequestBody MarkDto markDto){
        service.updateMark(markDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMark(@PathVariable Integer id){
        service.deleteMark(id);
    }

    @GetMapping("/get/{id}")
    public MarkDto getMarkDetail(@PathVariable Integer id){
        return service.searchById(id);
    }

    @GetMapping("/get-All")
    public List<MarkDto> getAllDetails(){
        return service.getAll();
    }

}

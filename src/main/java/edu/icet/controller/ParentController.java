package edu.icet.controller;

import edu.icet.dto.ParentDto;
import edu.icet.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parent")
public class ParentController {
    @Autowired
    ParentService service;

    @PostMapping("/add")
    public void addParent(@RequestBody ParentDto parentDto){
        service.addParent(parentDto);
    }

    @PutMapping("/update")
    public void updateParent(@RequestBody ParentDto parentDto){
        service.updateParent(parentDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteParent(@PathVariable Integer id){
        service.deleteParent(id);
    }

    @GetMapping("/get/{id}")
    public ParentDto getParent(@PathVariable Integer id){
        return service.searchById(id);
    }

    @GetMapping("/get-All")
    public List<ParentDto> getAllParents(){
        return service.getAll();
    }
}

package edu.icet.controller;

import edu.icet.dto.AcademicYearDto;
import edu.icet.service.AcademicYearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/academicYear")
public class AcademicYearController {
    @Autowired
    AcademicYearService service;

    @PostMapping("/add")
    public void addAcademicYear(@RequestBody AcademicYearDto academicYearDto){
        service.addAcademicYear(academicYearDto);
    }

    @PutMapping("/update")
    public void updateAcademicYear(@RequestBody AcademicYearDto academicYearDto){
        service.updateAcademicYear(academicYearDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAcademicYear(@PathVariable Integer id){
        service.deleteAcademicYear(id);
    }

    @GetMapping("/get/{id}")
    public AcademicYearDto searchByID(@PathVariable Integer id){
        return service.searchById(id);
    }

    @GetMapping("/getAll")
    public List<AcademicYearDto> getAll(){
        return service.getAll();
    }
}

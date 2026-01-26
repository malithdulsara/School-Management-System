package edu.icet.controller;

import edu.icet.dto.FeeStructureDto;
import edu.icet.service.FeeStructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feeStructure")
public class FeeStructureController {
    @Autowired
    FeeStructureService service;

    @PostMapping("/add")
    public void addFeeStructure(@RequestBody FeeStructureDto feeStructureDto){
        service.addFeeStructure(feeStructureDto);
    }

    @PutMapping("/update")
    public void updateFeeStructure(@RequestBody FeeStructureDto feeStructureDto){
        service.updateFeeStructure(feeStructureDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFeeStructure(@PathVariable Integer id){
        service.deleteFeeStructure(id);
    }

    @GetMapping("/get/{id}")
    public FeeStructureDto getFeeStructureDetail(@PathVariable Integer id){
        return service.searchById(id);
    }

    @GetMapping("/get-All")
    public List<FeeStructureDto> getFeeStructureDetails(){
        return service.getAll();
    }
}

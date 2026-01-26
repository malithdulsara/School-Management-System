package edu.icet.controller;

import edu.icet.dto.FeeCategoryDto;
import edu.icet.service.FeeCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feeCategory")
public class FeeCategoryController {
    @Autowired
    FeeCategoryService service;

    @PostMapping("/add")
    public void addFeeCategory(@RequestBody FeeCategoryDto feeCategoryDto){
        service.addFeeCategory(feeCategoryDto);
    }

    @PutMapping("/update")
    public void updateFeeCategory(@RequestBody FeeCategoryDto feeCategoryDto){
        service.updateFeeCategory(feeCategoryDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFeeCategory(Integer id){
        service.deleteFeeCategory(id);
    }

    @GetMapping("/get/{id}")
    public FeeCategoryDto getFeeCategory(Integer id){
        return service.searchById(id);
    }

    @GetMapping("/get-All")
    public List<FeeCategoryDto> getFeeCategories(){
        return service.getAll();
    }
}

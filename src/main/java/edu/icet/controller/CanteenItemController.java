package edu.icet.controller;

import edu.icet.dto.CanteenItemDto;
import edu.icet.service.CanteenItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/canteenItem")
public class CanteenItemController {
    @Autowired
    CanteenItemService service;

    @PostMapping("/add")
    public void addCanteenItem(@RequestBody CanteenItemDto canteenItemDto){
        service.addCanteenItem(canteenItemDto);
    }

    @PutMapping("/update")
    public void updateCanteenItem(@RequestBody CanteenItemDto canteenItemDto){
        service.updateCanteenItem(canteenItemDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCanteenItem(@PathVariable Integer id){
        service.deleteCanteenItem(id);
    }

    @GetMapping("/get/{id}")
    public CanteenItemDto getCanteenItem(@PathVariable Integer id){
        return service.searchById(id);
    }

    @GetMapping("/get-All")
    public List<CanteenItemDto> getAllCanteenItems(){
        return service.getAll();
    }
}

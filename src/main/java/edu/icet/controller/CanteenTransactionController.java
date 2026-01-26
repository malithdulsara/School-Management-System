package edu.icet.controller;

import edu.icet.dto.CanteenTransactionDto;
import edu.icet.service.CanteenTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/canteenTransaction")
public class CanteenTransactionController {
    @Autowired
    CanteenTransactionService service;

    @PostMapping("/add")
    public void addCanteenTransaction(@RequestBody CanteenTransactionDto canteenTransactionDto){
        service.addCanteenTransaction(canteenTransactionDto);
    }

    @PutMapping("/update")
    public void updateCanteenTransaction(@RequestBody CanteenTransactionDto canteenTransactionDto){
        service.addCanteenTransaction(canteenTransactionDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCanteenTransaction(Integer id){
        service.deleteCanteenTransaction(id);
    }

    @GetMapping("/get/{id}")
    public CanteenTransactionDto getCanteenTransaction(Integer id){
        return service.searchById(id);
    }

    @GetMapping("/get-All")
    public List<CanteenTransactionDto> getAllCanteenTransactions(){
        return service.getAll();
    }
}

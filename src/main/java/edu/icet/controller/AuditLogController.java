package edu.icet.controller;

import edu.icet.dto.AuditLogDto;
import edu.icet.service.AuditLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auditLog")
public class AuditLogController {
    @Autowired
    AuditLogService service;

    @PostMapping("/add")
    public void addAuditLog(@RequestBody AuditLogDto auditLogDto){
        service.addAuditLog(auditLogDto);
    }

    @PutMapping("/update")
    public void updateAuditLog(@RequestBody AuditLogDto auditLogDto){
        service.updateAuditLog(auditLogDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAuditLog(@PathVariable Integer id){
        service.deleteAuditLog(id);
    }

    @GetMapping("/get/{id}")
    public AuditLogDto getAuditLog(@PathVariable Integer id){
        return service.searchById(id);
    }

    @GetMapping("/get-All")
    public List<AuditLogDto> getAllAuditLog(){
        return service.getAll();
    }
}

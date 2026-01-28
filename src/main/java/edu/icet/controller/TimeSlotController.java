package edu.icet.controller;

import edu.icet.dto.TimeSlotDto;
import edu.icet.service.TimeSlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/timeSlots")
public class TimeSlotController {
    @Autowired
    TimeSlotService service;

    @PostMapping("/add")
    public void addTimeSlots(@RequestBody TimeSlotDto timeSlotDto) {
        service.addTimeSlot(timeSlotDto);
    }

    @PutMapping("/update")
    public void updateTimeSlots(@RequestBody TimeSlotDto timeSlotDto) {
        service.updateTimeSlot(timeSlotDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTimeSlots(@PathVariable Integer id) {
        service.deleteTimeSlot(id);
    }

    @GetMapping("/get/{id}")
    public TimeSlotDto getTimeSlotsById(@PathVariable Integer id) {
        return service.searchById(id);
    }

    @GetMapping("/getAll")
    public java.util.List<TimeSlotDto> getAllTimeSlots() {
        return service.getAll();
    }

}

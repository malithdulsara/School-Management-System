package edu.icet.controller;

import edu.icet.dto.TimetableDto;
import edu.icet.service.TimetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/timetables")
public class TimeTableController {
    @Autowired
    TimetableService service;

    @PostMapping("/add")
    public void addTimeTable(@RequestBody TimetableDto timetableDto) {
        service.addTimetable(timetableDto);
    }

    @PutMapping("/update")
    public void updateTimeTable(@RequestBody TimetableDto timetableDto) {
        service.updateTimetable(timetableDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTimeTable(@PathVariable Integer id) {
        service.deleteTimetable(id);
    }

    @GetMapping("/get/{id}")
    public TimetableDto getTimeTableById(@PathVariable Integer id) {
        return service.searchById(id);
    }

    @GetMapping("/getAll")
    public List<TimetableDto> getAllTimeTables() {
        return service.getAll();
    }
}


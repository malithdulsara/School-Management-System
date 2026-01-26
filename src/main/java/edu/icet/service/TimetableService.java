package edu.icet.service;

import edu.icet.dto.TimetableDto;

import java.util.List;

public interface TimetableService {
    void addTimetable(TimetableDto timetableDto);
    void updateTimetable(TimetableDto timetableDto);
    void deleteTimetable(Integer id);
    TimetableDto searchById(Integer id);
    List<TimetableDto> getAll();
}

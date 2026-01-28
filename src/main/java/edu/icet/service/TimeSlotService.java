package edu.icet.service;

import edu.icet.dto.TimeSlotDto;

import java.util.List;

public interface TimeSlotService {
    void addTimeSlot(TimeSlotDto timeSlotDto);
    void updateTimeSlot(TimeSlotDto timeSlotDto);
    void deleteTimeSlot(Integer id);
    TimeSlotDto searchById(Integer id);
    List<TimeSlotDto> getAll();
}

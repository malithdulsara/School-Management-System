package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimeSlotDto {
    private Integer timeslotId;
    private Integer schoolId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}

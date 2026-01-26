package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimeSlotDto {
    private Integer timeslotId;
    private Integer schoolId;
    private Time startTime;
    private Time endTime;
}

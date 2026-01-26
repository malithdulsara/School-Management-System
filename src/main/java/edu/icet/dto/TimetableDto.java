package edu.icet.dto;

import edu.icet.util.DayOfWeek;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimetableDto {
    private Integer timetableId;
    private Integer classId;
    private Integer timeslotId;
    private Integer classSubjectId;
    private DayOfWeek dayOfWeek;
}

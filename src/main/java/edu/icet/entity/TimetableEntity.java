package edu.icet.entity;

import edu.icet.util.DayOfWeek;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "timetables")
public class TimetableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer timetableId;
    private Integer classId;
    private Integer timeslotId;
    private Integer classSubjectId;
    private DayOfWeek dayOfWeek;
}

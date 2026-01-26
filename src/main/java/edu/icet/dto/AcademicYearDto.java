package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AcademicYearDto {
    private Integer academicYearId;
    private Integer schoolId;
    private String yearName;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean active;
}

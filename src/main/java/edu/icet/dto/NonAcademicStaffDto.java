package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NonAcademicStaffDto {
    private Integer staffId;
    private Integer userId;
    private Integer schoolId;
    private String jobTitle;
    private String department;
    private LocalDate joinningDate;
}

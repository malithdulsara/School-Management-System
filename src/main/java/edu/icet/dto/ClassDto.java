package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClassDto {
    private Integer classId;
    private Integer schoolId;
    private Integer academicYearId;
    private String className;
    private String section;
    private Integer classTeacherid;

}

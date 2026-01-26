package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MarkDto {
    private Integer marksId;
    private Integer examSubjectId;
    private Integer studentId;
    private Double marksObtained;
    private String teacherRemarks;
}

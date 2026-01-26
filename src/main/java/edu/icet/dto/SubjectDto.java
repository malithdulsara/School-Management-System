package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectDto {
    private Integer subjectId;
    private Integer schoolId;
    private String subjectName;
    private String subjectCode;
}

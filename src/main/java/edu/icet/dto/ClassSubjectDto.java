package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClassSubjectDto {
    private Integer classSubjectId;
    private Integer classId;
    private Integer subjectId;
    private Integer teacherId;
}

package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ExamSubjectDto {
    private Integer examSubjectId;
    private Integer examId;
    private Integer subjectId;
    private Double maxMarks;
    private Double minPassMarks;


}

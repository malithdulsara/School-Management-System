package edu.icet.dto;

import edu.icet.util.ExamType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExamDto {
    private Integer examId;
    private Integer academicYearId;
    private Integer termId;
    private String examName;
    private ExamType examType;
}

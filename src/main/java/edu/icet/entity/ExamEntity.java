package edu.icet.entity;

import edu.icet.util.ExamType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="exams")
public class ExamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer examId;
    private Integer academicYearId;
    private Integer termId;
    private String examName;
    private ExamType examType;
}

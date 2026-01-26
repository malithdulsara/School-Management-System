package edu.icet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name ="exam_subjetcs")
public class ExamSubjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer examSubjectId;
    private Integer examId;
    private Integer subjectId;
    private double maxMarks;
    private double minPassMarks;

}

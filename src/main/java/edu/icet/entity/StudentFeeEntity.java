package edu.icet.entity;

import edu.icet.util.FeeStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="student_fees")
public class StudentFeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentFeeId;
    private Integer studentId;
    private Integer feeStructureId;
    private LocalDate dueDate;
    private FeeStatus status;
}

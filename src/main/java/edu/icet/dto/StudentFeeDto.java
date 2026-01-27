package edu.icet.dto;

import edu.icet.util.FeeStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentFeeDto {
    private Integer studentFeeId;
    private Integer studentId;
    private Integer feeStructureId;
    private LocalDate dueDate;
    private FeeStatus status;
}

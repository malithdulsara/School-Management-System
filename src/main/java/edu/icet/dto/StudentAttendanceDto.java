package edu.icet.dto;

import edu.icet.util.StudentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentAttendanceDto {
    private Integer attendenceId;
    private Integer studentId;
    private Integer classId;
    private Date date;
    private String remark;
    private StudentStatus status;
}

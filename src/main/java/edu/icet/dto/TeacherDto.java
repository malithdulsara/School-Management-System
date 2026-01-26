package edu.icet.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDto {
    private Integer teacherId;
    private Integer userId;
    private Integer schoolId;
    private String qualification;
    private String specification;
    private Date date;
}

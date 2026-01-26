package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TermDto {
    private Integer termId;
    private Integer academicYearId;
    private String name;
    private Date startDate;
    private Date endDate;

}

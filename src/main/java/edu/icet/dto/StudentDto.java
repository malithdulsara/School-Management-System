package edu.icet.dto;

import edu.icet.util.Gender;
import edu.icet.util.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentDto {
    private Integer id;
    private Integer userId;
    private Integer schoolId;
    private String addmissionNumber;
    private Date addmissionDate;
    private Integer currentClassId;
    private Date dateOfBirth;
    private Gender gender;
    private Status status;
}

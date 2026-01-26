package edu.icet.entity;

import edu.icet.util.Gender;
import edu.icet.util.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "students")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

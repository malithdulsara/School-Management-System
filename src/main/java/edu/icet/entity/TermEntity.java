package edu.icet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "terms")
public class TermEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer termId;
    private Integer academicYearId;
    private String name;
    private Date startDate;
    private Date endDate;

}

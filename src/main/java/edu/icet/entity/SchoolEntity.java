package edu.icet.entity;

import edu.icet.util.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="school")
public class SchoolEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer schoolId;
    private String name;
    private String code;
    private String address;
    private String email;
    private String phoneNumber;
    private String logoUrl;
    private Status status;
    private LocalDateTime createdAt;
}

package edu.icet.dto;

import edu.icet.util.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchoolDto {
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

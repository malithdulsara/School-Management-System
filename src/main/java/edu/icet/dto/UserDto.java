package edu.icet.dto;

import edu.icet.util.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Integer userId;
    private Integer schoolId;
    private Integer roleId;
    private String name;
    private String password;
    private String email;
    private String phone;
    private Status status;
    private LocalDateTime lastLogin;
    private LocalDateTime createdAt;
}

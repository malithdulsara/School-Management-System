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
@Table(name="users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

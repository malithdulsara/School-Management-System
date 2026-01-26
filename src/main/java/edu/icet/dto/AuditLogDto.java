package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuditLogDto {
    private Integer logId;
    private Integer userId;
    private String action;
    private String entityName;
    private Integer entityId;
    private String payload;
    private LocalDateTime timestamp;
}

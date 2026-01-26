package edu.icet.service;

import edu.icet.dto.AuditLogDto;

import java.util.List;

public interface AuditLogService {
    void addAuditLog(AuditLogDto auditLogDto);
    void updateAuditLog(AuditLogDto auditLogDto);
    void deleteAuditLog(Integer id);
    AuditLogDto searchById(Integer id);
    List<AuditLogDto> getAll();
}

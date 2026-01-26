package edu.icet.service.impl;

import edu.icet.dto.AuditLogDto;
import edu.icet.entity.AuditLogEntity;
import edu.icet.repository.AuditLogRepository;
import edu.icet.service.AuditLogService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class AuditLogServiceImpl implements AuditLogService {
    private final ModelMapper modelMapper;
    private final AuditLogRepository repository;
    @Override
    public void addAuditLog(AuditLogDto auditLogDto) {
        repository.save(modelMapper.map(auditLogDto, AuditLogEntity.class));
    }

    @Override
    public void updateAuditLog(AuditLogDto auditLogDto) {
        repository.save(modelMapper.map(auditLogDto, AuditLogEntity.class));
    }

    @Override
    public void deleteAuditLog(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public AuditLogDto searchById(Integer id) {
        return modelMapper.map(repository.findById(id),AuditLogDto.class);
    }

    @Override
    public List<AuditLogDto> getAll() {
        List<AuditLogEntity> auditLogEntities = repository.findAll();
        List<AuditLogDto> auditLogDtos = new ArrayList<>();
       auditLogEntities.forEach(auditLogEntity ->
           auditLogDtos.add(modelMapper.map(auditLogEntity,AuditLogDto.class)
           ));
       return auditLogDtos;
    }
}

package edu.icet.service.impl;

import edu.icet.dto.PermissionDto;
import edu.icet.entity.PermissionEntity;
import edu.icet.repository.PermissionRepository;
import edu.icet.service.PermissionService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class PermissionServiceImpl implements PermissionService {
    private final ModelMapper modelMapper;
    private final PermissionRepository repository;
    @Override
    public void addPermission(PermissionDto permissionDto) {
        repository.save(modelMapper.map(permissionDto, PermissionEntity.class));
    }

    @Override
    public void updatePermission(PermissionDto permissionDto) {
        repository.save(modelMapper.map(permissionDto, PermissionEntity.class));
    }

    @Override
    public void deletePermission(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public PermissionDto searchById(Integer id) {
        return modelMapper.map(repository.findById(id), PermissionDto.class);
    }

    @Override
    public List<PermissionDto> getAll() {
        List<PermissionEntity>permissionEntities = repository.findAll();
        List<PermissionDto>permissionDtos = new ArrayList<>();
        permissionEntities.forEach(permissionEntity ->
                permissionDtos.add(modelMapper.map(permissionEntity, PermissionDto.class))
                );
        return permissionDtos;
    }
}

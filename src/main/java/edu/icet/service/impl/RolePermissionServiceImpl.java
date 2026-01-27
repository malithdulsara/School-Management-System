package edu.icet.service.impl;

import edu.icet.dto.RolePermissionDto;
import edu.icet.entity.RolePermissionEntity;
import edu.icet.repository.RolePermissionRepository;
import edu.icet.service.RolePermissionService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class RolePermissionServiceImpl implements RolePermissionService {
    private final ModelMapper modelMapper;
    private final RolePermissionRepository repository;

    @Override
    public void addRolePermission(RolePermissionDto rolePermissionDto) {
        repository.save(modelMapper.map(rolePermissionDto, RolePermissionEntity.class));
    }

    @Override
    public void updateRolePermission(RolePermissionDto rolePermissionDto) {
        repository.save(modelMapper.map(rolePermissionDto, RolePermissionEntity.class));
    }

    @Override
    public void deleteRolePermission(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public RolePermissionDto searchById(Integer id) {
        return modelMapper.map(repository.findById(id), RolePermissionDto.class);
    }

    @Override
    public List<RolePermissionDto> getAll() {
        List<RolePermissionEntity> rolePermissionEntities = repository.findAll();
        List<RolePermissionDto> rolePermissionDtos = new ArrayList<>();
        rolePermissionEntities.forEach(rolePermissionEntity ->
                rolePermissionDtos.add(modelMapper.map(rolePermissionEntity, RolePermissionDto.class))
        );
        return rolePermissionDtos;
    }
}
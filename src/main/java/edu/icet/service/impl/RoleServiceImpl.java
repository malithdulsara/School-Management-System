package edu.icet.service.impl;

import edu.icet.dto.RoleDto;
import edu.icet.entity.RoleEntity;
import edu.icet.repository.RoleRepository;
import edu.icet.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final ModelMapper modelMapper;
    private final RoleRepository repository;
    @Override
    public void addRole(RoleDto roleDto) {
        repository.save(modelMapper.map(roleDto, RoleEntity.class));
    }

    @Override
    public void updateRole(RoleDto roleDto) {
        repository.save(modelMapper.map(roleDto, RoleEntity.class));
    }

    @Override
    public void deleteRole(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public RoleDto searchById(Integer id) {
        return modelMapper.map(repository.findById(id), RoleDto.class);
    }

    @Override
    public List<RoleDto> getAll() {
        List<RoleEntity>roleEntities = repository.findAll();
        List<RoleDto> roleDtos = new ArrayList<>();
        roleEntities.forEach(roleEntity ->
                roleDtos.add(modelMapper.map(roleEntity, RoleDto.class))
                );
        return roleDtos;
    }
}

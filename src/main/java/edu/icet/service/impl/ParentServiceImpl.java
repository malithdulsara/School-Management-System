package edu.icet.service.impl;

import edu.icet.dto.ParentDto;
import edu.icet.entity.ParentEntity;
import edu.icet.repository.ParentRepository;
import edu.icet.service.ParentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ParentServiceImpl implements ParentService {
    private final ModelMapper modelMapper;
    private final ParentRepository repository;
    @Override
    public void addParent(ParentDto parentDto) {
        repository.save(modelMapper.map(parentDto, ParentEntity.class));
    }

    @Override
    public void updateParent(ParentDto parentDto) {
        repository.save(modelMapper.map(parentDto, ParentEntity.class));
    }

    @Override
    public void deleteParent(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public ParentDto searchById(Integer id) {
        return modelMapper.map(repository.findById(id), ParentDto.class);
    }

    @Override
    public List<ParentDto> getAll() {
        List<ParentEntity>parentEntities = repository.findAll();
        List<ParentDto>parentDtos = new ArrayList<>();
        parentEntities.forEach(parentEntity ->
                parentDtos.add(modelMapper.map(parentEntity,ParentDto.class))
                );
        return parentDtos;
    }
}

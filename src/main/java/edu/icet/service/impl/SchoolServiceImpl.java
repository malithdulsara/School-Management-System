package edu.icet.service.impl;

import edu.icet.dto.SchoolDto;
import edu.icet.entity.SchoolEntity;
import edu.icet.repository.SchoolRepository;
import edu.icet.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService {
    private final ModelMapper modelMapper;
    private final SchoolRepository repository;
    @Override
    public void addSchool(SchoolDto schoolDto) {
        repository.save(modelMapper.map(schoolDto, SchoolEntity.class));
    }

    @Override
    public void updateSchool(SchoolDto schoolDto) {
        repository.save(modelMapper.map(schoolDto, SchoolEntity.class));
    }

    @Override
    public void deleteSchool(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public SchoolDto searchById(Integer id) {
        return  modelMapper.map(repository.findById(id), SchoolDto.class);
    }

    @Override
    public List<SchoolDto> getAll() {
        List<SchoolEntity>schoolEntities= repository.findAll();
        List<SchoolDto>schoolDtos = new ArrayList<>();
        schoolEntities.forEach(schoolEntity ->
                schoolDtos.add(modelMapper.map(schoolEntity, SchoolDto.class))
                );
        return schoolDtos;
    }
}

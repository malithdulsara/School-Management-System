package edu.icet.service.impl;


import edu.icet.dto.TeacherDto;
import edu.icet.entity.TeacherEntity;
import edu.icet.repository.TeacherRepository;
import edu.icet.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class TeacherServiceImpl implements TeacherService {
    final ModelMapper modelMapper;
    final TeacherRepository repository;

    @Override
    public void add(TeacherDto teacherDto) {
        repository.save(modelMapper.map(teacherDto, TeacherEntity.class));
    }

    @Override
    public void update(TeacherDto teacherDto) {
        repository.save(modelMapper.map(teacherDto, TeacherEntity.class));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<TeacherDto> getAll() {
       List<TeacherEntity> teacherEntities = repository.findAll();
       List<TeacherDto>teacherDtos = new ArrayList<>();

       for(TeacherEntity entity : teacherEntities){
           teacherDtos.add(modelMapper.map(entity, TeacherDto.class));
       }
       return teacherDtos;
    }

    @Override
    public TeacherDto searchById(Integer id) {
        return modelMapper.map(repository.findById(id), TeacherDto.class);
    }
}

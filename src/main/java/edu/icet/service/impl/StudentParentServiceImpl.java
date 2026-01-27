package edu.icet.service.impl;

import edu.icet.dto.StudentParentDto;
import edu.icet.entity.StudentParentEntity;
import edu.icet.repository.StudentParentRepository;
import edu.icet.service.StudentParentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentParentServiceImpl implements StudentParentService {
    private final ModelMapper modelMapper;
    private final StudentParentRepository repository;
    @Override
    public void addStudentParent(StudentParentDto studentParentDto) {
        repository.save(modelMapper.map(studentParentDto, StudentParentEntity.class));
    }

    @Override
    public void updateStudentParent(StudentParentDto studentParentDto) {
        repository.save(modelMapper.map(studentParentDto, StudentParentEntity.class));
    }

    @Override
    public void deleteStudentParent(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public StudentParentDto searchById(Integer id) {
        return modelMapper.map(repository.findById(id), StudentParentDto.class);
    }

    @Override
    public List<StudentParentDto> getAll() {
        List<StudentParentEntity>studentParentEntities = repository.findAll();
        List<StudentParentDto>studentParentDtos = new ArrayList<>();
        studentParentEntities.forEach(studentParentEntity ->
                studentParentDtos.add(modelMapper.map(studentParentEntity,StudentParentDto.class))
                );
        return studentParentDtos;
    }
}

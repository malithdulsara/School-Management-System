package edu.icet.service.impl;

import edu.icet.dto.StudentFeeDto;
import edu.icet.entity.StudentFeeEntity;
import edu.icet.repository.StudentFeeRepository;
import edu.icet.service.StudentFeeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentFeeServiceImpl implements StudentFeeService {
    private final ModelMapper modelMapper;
    private final StudentFeeRepository repository;
    @Override
    public void addStudentFee(StudentFeeDto studentFeeDto) {
        repository.save(modelMapper.map(studentFeeDto, StudentFeeEntity.class));
    }

    @Override
    public void updateStudentFee(StudentFeeDto studentFeeDto) {
        repository.save(modelMapper.map(studentFeeDto, StudentFeeEntity.class));
    }

    @Override
    public void deleteeStudentFee(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public StudentFeeDto searchById(Integer id) {
        return modelMapper.map(repository.findById(id), StudentFeeDto.class);
    }

    @Override
    public List<StudentFeeDto> getAll() {
        List<StudentFeeEntity> studentFeeEntities = repository.findAll();
        List<StudentFeeDto>studentFeeDtos = new ArrayList<>();
        studentFeeEntities.forEach(studentFeeEntity ->
                studentFeeDtos.add(modelMapper.map(studentFeeEntity, StudentFeeDto.class))
        );
        return studentFeeDtos;
    }
}

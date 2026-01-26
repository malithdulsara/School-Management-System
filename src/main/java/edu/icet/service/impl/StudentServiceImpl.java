package edu.icet.service.impl;

import edu.icet.dto.StudentDto;
import edu.icet.entity.StudentEntity;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    @Autowired
    final ModelMapper modelMapper;

    @Autowired
    final StudentRepository studentRepository;

    @Override
    public void addStudent(StudentDto student) {
        StudentEntity entity = modelMapper.map(student,StudentEntity.class);
        studentRepository.save(entity);
    }

    @Override
    public void updateStudent(StudentDto student) {
        StudentEntity entity = modelMapper.map(student,StudentEntity.class);
        studentRepository.save(entity);
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }

    @Override
    public StudentDto searchById(Integer id) {
        return modelMapper.map(studentRepository.findById(id),StudentDto.class);
    }

    @Override
    public List<StudentDto> getAll() {
       List<StudentEntity>entityList = studentRepository.findAll();
       ArrayList<StudentDto>studentDtoArrayList = new ArrayList<>();
       entityList.forEach(studentEntity -> {StudentDto studentDto = modelMapper.map(studentEntity,StudentDto.class);
        studentDtoArrayList.add(studentDto);
       });
       return  studentDtoArrayList;
    }
}

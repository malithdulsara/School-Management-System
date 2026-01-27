package edu.icet.service.impl;

import edu.icet.dto.StudentAttendanceDto;
import edu.icet.entity.StudentAttendanceEntity;
import edu.icet.repository.StudentAttendanceRepository;
import edu.icet.service.StudentAttendanceService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class StudentAttendanceServiceImpl implements StudentAttendanceService {
    private final ModelMapper modelMapper;
    private final StudentAttendanceRepository repository;
    @Override
    public void addStudentAttendance(StudentAttendanceDto studentAttendanceDto) {
        repository.save(modelMapper.map(studentAttendanceDto, StudentAttendanceEntity.class));
    }

    @Override
    public void updateStudentAttendance(StudentAttendanceDto studentAttendanceDto) {
        repository.save(modelMapper.map(studentAttendanceDto,StudentAttendanceEntity.class));
    }

    @Override
    public void deleteStudentAttendance(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public StudentAttendanceDto searchById(Integer id) {
         return modelMapper.map(repository.findById(id), StudentAttendanceDto.class);
    }

    @Override
    public List<StudentAttendanceDto> getAll() {
        List<StudentAttendanceEntity> studentAttendanceEntities = repository.findAll();
        List<StudentAttendanceDto>studentAttendanceDtos = new ArrayList<>();
        studentAttendanceEntities.forEach(studentAttendanceEntity ->
                studentAttendanceDtos.add(modelMapper.map(studentAttendanceEntity, StudentAttendanceDto.class))
                );
        return studentAttendanceDtos;
    }
}

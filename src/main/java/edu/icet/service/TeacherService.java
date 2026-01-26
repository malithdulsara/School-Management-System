package edu.icet.service;

import edu.icet.dto.TeacherDto;

import java.util.List;

public interface TeacherService {
    void add(TeacherDto teacherDto);
    void update(TeacherDto teacherDto);
    void delete(Integer id);
    List<TeacherDto>getAll();
    TeacherDto searchById(Integer id);
}

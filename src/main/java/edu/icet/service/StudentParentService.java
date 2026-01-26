package edu.icet.service;

import edu.icet.dto.StudentParentDto;

import java.util.List;

public interface StudentParentService {
    void addStudentParent(StudentParentDto studentParentDto);
    void updateStudentParent(StudentParentDto studentParentDto);
    void deleteStudentParent(Integer id);
    StudentParentDto searchById(Integer id);
    List<StudentParentDto> getAll();
}

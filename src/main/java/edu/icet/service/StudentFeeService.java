package edu.icet.service;

import edu.icet.dto.StudentFeeDto;

import java.util.List;

public interface StudentFeeService {
    void addStudentFee(StudentFeeDto studentFeeDto);
    void updateStudentFee(StudentFeeDto studentFeeDto);
    void deleteeStudentFee(Integer id);
    StudentFeeDto searchById(Integer id);
    List<StudentFeeDto> getAll();
}

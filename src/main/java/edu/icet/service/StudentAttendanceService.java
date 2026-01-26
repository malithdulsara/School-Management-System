package edu.icet.service;

import edu.icet.dto.StudentAttendanceDto;

import java.util.List;

public interface StudentAttendanceService {
    void addStudentAttendance(StudentAttendanceDto studentAttendanceDto);
    void updateStudentAttendance(StudentAttendanceDto studentAttendanceDto);
    void deleteStudentAttendance(Integer id);
    StudentAttendanceDto searchById(Integer id);
    List<StudentAttendanceDto> getAll();

}

package edu.icet.service;

import edu.icet.dto.NonAcademicStaffDto;

import java.util.List;

public interface NonAcademicStaffService {
    void addNonAcademicStaff(NonAcademicStaffDto nonAcademicStaffDto);
    void updateAcademicStaff(NonAcademicStaffDto nonAcademicStaffDto);
    void deleteAcademicStaff(Integer id);
    NonAcademicStaffDto searchById(Integer id);
    List<NonAcademicStaffDto> getAll();
}

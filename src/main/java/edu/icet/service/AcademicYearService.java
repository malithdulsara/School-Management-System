package edu.icet.service;

import edu.icet.dto.AcademicYearDto;

import java.util.List;

public interface AcademicYearService {
    void addAcademicYear(AcademicYearDto academicYearDto);
    void updateAcademicYear(AcademicYearDto academicYearDto);
    void deleteAcademicYear(Integer id);
    AcademicYearDto searchById(Integer id);
    List<AcademicYearDto> getAll();
}

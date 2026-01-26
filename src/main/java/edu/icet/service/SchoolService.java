package edu.icet.service;

import edu.icet.dto.SchoolDto;

import java.util.List;

public interface SchoolService {
    void addSchool(SchoolDto schoolDto);
    void updateSchool(SchoolDto schoolDto);
    void deleteSchool(Integer id);
    SchoolDto searchById(Integer id);
    List<SchoolDto> getAll();

}

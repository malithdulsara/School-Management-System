package edu.icet.service;

import edu.icet.dto.ClassDto;

import java.util.List;

public interface ClassService {
    void addClass(ClassDto classDto);
    void updateClass(ClassDto classDto);
    void deleteClass(Integer id);
    ClassDto searchById(Integer id);
    List<ClassDto> getAll();
}

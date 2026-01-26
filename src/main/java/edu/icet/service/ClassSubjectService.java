package edu.icet.service;

import edu.icet.dto.ClassSubjectDto;

import java.util.List;

public interface ClassSubjectService {
    void addClassSubject(ClassSubjectDto classSubjectDto);
    void updateClassSubject(ClassSubjectDto classSubjectDto);
    void deleteClassSubject(Integer id);
    ClassSubjectDto searchById(Integer id);
    List<ClassSubjectDto> getAll();
}

package edu.icet.service;

import edu.icet.dto.SubjectDto;

import java.util.List;

public interface SubjectService {
    void addSubject(SubjectDto subjectDto);
    void updateSubjectDto(SubjectDto subjectDto);
    void deleteSubject(Integer id);
    SubjectDto searchById(Integer id);
    List<SubjectDto> getAll();
}

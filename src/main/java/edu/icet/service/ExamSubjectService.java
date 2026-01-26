package edu.icet.service;

import edu.icet.dto.ExamSubjectDto;

import java.util.List;

public interface ExamSubjectService {
    void addExamSubject(ExamSubjectDto examSubjectDto);
    void updateExamSubject(ExamSubjectDto examSubjectDto);
    void deleteExamSubject(Integer id);
    ExamSubjectDto searchById(Integer id);
    List<ExamSubjectDto> getAll();
}

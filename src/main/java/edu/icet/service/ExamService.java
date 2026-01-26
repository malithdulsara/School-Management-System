package edu.icet.service;

import edu.icet.dto.ExamDto;

import java.util.List;

public interface ExamService {
    void addExam(ExamDto examDto);
    void updateExam(ExamDto examDto);
    void deleteExam(Integer id);
    ExamDto searchById(Integer id);
    List<ExamDto> getAll();
}

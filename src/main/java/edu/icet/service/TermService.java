package edu.icet.service;

import edu.icet.dto.TermDto;

import java.util.List;

public interface TermService {
    void addTerm(TermDto termDto);
    void updateTerm(TermDto termDto);
    void deleteTerm(Integer id);
    TermDto searchById(Integer id);
    List<TermDto> getALL();
}

package edu.icet.service;

import edu.icet.dto.MarkDto;

import java.util.List;

public interface MarkService {
    void addMark(MarkDto markDto);
    void update(MarkDto markDto);
    void deleteMark(Integer id);
    MarkDto searchById(Integer id);
    List<MarkDto> getAll();
}

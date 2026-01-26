package edu.icet.service;

import edu.icet.dto.ParentDto;

import java.util.List;

public interface ParentService {
    void addParent(ParentDto parentDto);
    void updateParent(ParentDto parentDto);
    void deleteParent(Integer id);
    ParentDto searchById(Integer id);
    List<ParentDto> getAll();
}

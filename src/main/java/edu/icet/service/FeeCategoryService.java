package edu.icet.service;

import edu.icet.dto.FeeCategoryDto;

import java.util.List;

public interface FeeCategoryService {
    void addFeeCategory(FeeCategoryDto feeCategoryDto);
    void updateFeeCategory(FeeCategoryDto feeCategoryDto);
    void deleteFeeCategory(Integer id);
    FeeCategoryDto searchById(Integer id);
    List<FeeCategoryDto> getAll();
}

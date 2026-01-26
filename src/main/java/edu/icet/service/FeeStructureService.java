package edu.icet.service;

import edu.icet.dto.FeeStructureDto;

import java.util.List;

public interface FeeStructureService {
    void addFeeStructure(FeeStructureDto feeStructureDto);
    void updateFeeStructure(FeeStructureDto feeStructureDto);
    void deleteFeeStructure(Integer id);
    FeeStructureDto searchById(Integer id);
    List<FeeStructureDto> getAll();
}

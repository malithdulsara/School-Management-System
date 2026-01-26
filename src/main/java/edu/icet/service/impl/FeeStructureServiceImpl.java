package edu.icet.service.impl;

import edu.icet.dto.FeeStructureDto;
import edu.icet.entity.FeeStructureEntity;
import edu.icet.repository.FeeStructureRepository;
import edu.icet.service.FeeStructureService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FeeStructureServiceImpl implements FeeStructureService {
    private final ModelMapper modelMapper;
    private final FeeStructureRepository repository;
    @Override
    public void addFeeStructure(FeeStructureDto feeStructureDto) {
        repository.save(modelMapper.map(feeStructureDto, FeeStructureEntity.class));
    }

    @Override
    public void updateFeeStructure(FeeStructureDto feeStructureDto) {
        repository.save(modelMapper.map(feeStructureDto, FeeStructureEntity.class));
    }

    @Override
    public void deleteFeeStructure(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public FeeStructureDto searchById(Integer id) {
       return modelMapper.map(repository.findById(id),FeeStructureDto.class);
    }

    @Override
    public List<FeeStructureDto> getAll() {
        List<FeeStructureEntity> feeStructureEntities = repository.findAll();
        List<FeeStructureDto>feeStructureDtos = new ArrayList<>();
        feeStructureEntities.forEach(feeStructureEntity ->
                feeStructureDtos.add(modelMapper.map(feeStructureEntity, FeeStructureDto.class))
                );
        return  feeStructureDtos;
    }
}

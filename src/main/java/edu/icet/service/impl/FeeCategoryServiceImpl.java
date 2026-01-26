package edu.icet.service.impl;

import edu.icet.dto.FeeCategoryDto;
import edu.icet.entity.FeeCategoryEntity;
import edu.icet.repository.FeeCategoryRepository;
import edu.icet.service.FeeCategoryService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FeeCategoryServiceImpl implements FeeCategoryService {
    private final ModelMapper modelMapper;
    private final FeeCategoryRepository repository;
    @Override
    public void addFeeCategory(FeeCategoryDto feeCategoryDto) {
        repository.save(modelMapper.map(feeCategoryDto, FeeCategoryEntity.class));
    }

    @Override
    public void updateFeeCategory(FeeCategoryDto feeCategoryDto) {
        repository.save(modelMapper.map(feeCategoryDto, FeeCategoryEntity.class));
    }

    @Override
    public void deleteFeeCategory(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public FeeCategoryDto searchById(Integer id) {
        return  modelMapper.map(repository.findById(id), FeeCategoryDto.class);
    }

    @Override
    public List<FeeCategoryDto> getAll() {
       List<FeeCategoryEntity> feeCategoryEntities = repository.findAll();
       List<FeeCategoryDto> feeCategoryDtos = new ArrayList<>();
       feeCategoryEntities.forEach(feeCategoryEntity ->
               feeCategoryDtos.add(modelMapper.map(feeCategoryEntity, FeeCategoryDto.class))
               );
       return feeCategoryDtos;
    }
}

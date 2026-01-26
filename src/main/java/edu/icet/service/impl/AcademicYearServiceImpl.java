package edu.icet.service.impl;

import edu.icet.dto.AcademicYearDto;
import edu.icet.entity.AcademicYearEntity;
import edu.icet.repository.AcademicYearRepository;
import edu.icet.service.AcademicYearService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AcademicYearServiceImpl implements AcademicYearService {

    private final AcademicYearRepository repository;
    private final ModelMapper modelMapper;

    @Override
    public void addAcademicYear(AcademicYearDto academicYearDto) {
        repository.save(modelMapper.map(academicYearDto, AcademicYearEntity.class));
    }

    @Override
    public void updateAcademicYear(AcademicYearDto academicYearDto) {
        repository.save(modelMapper.map(academicYearDto, AcademicYearEntity.class));
    }

    @Override
    public void deleteAcademicYear(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public AcademicYearDto searchById(Integer id) {
       return modelMapper.map(repository.findById(id), AcademicYearDto.class);
    }

    @Override
    public List<AcademicYearDto> getAll() {
        List<AcademicYearEntity> academicYearEntities = repository.findAll();
        List<AcademicYearDto> academicYearDtos = new ArrayList<>();
        academicYearEntities.forEach(academicYearEntity ->
            academicYearDtos.add(modelMapper.map(academicYearEntity,AcademicYearDto.class)));
        return academicYearDtos;
    }
}

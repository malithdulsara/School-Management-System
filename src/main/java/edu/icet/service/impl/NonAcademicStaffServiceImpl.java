package edu.icet.service.impl;

import edu.icet.dto.NonAcademicStaffDto;
import edu.icet.entity.NonAcademicStaffEntity;
import edu.icet.repository.NonAcademicStaffRepository;
import edu.icet.service.NonAcademicStaffService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NonAcademicStaffServiceImpl implements NonAcademicStaffService {
    private final ModelMapper modelMapper;
    private final NonAcademicStaffRepository repository;

    @Override
    public void addNonAcademicStaff(NonAcademicStaffDto nonAcademicStaffDto) {
        repository.save(modelMapper.map(nonAcademicStaffDto, NonAcademicStaffEntity.class));
    }

    @Override
    public void updateAcademicStaff(NonAcademicStaffDto nonAcademicStaffDto) {
        repository.save(modelMapper.map(nonAcademicStaffDto, NonAcademicStaffEntity.class));
    }

    @Override
    public void deleteAcademicStaff(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public NonAcademicStaffDto searchById(Integer id) {
       return modelMapper.map(repository.findById(id), NonAcademicStaffDto.class);
    }

    @Override
    public List<NonAcademicStaffDto> getAll() {
        List<NonAcademicStaffEntity> nonAcademicStaffEntities = repository.findAll();
        List<NonAcademicStaffDto>nonAcademicStaffDtos = new ArrayList<>();
        nonAcademicStaffEntities.forEach(nonAcademicStaffEntity ->
                nonAcademicStaffDtos.add(modelMapper.map(nonAcademicStaffEntity, NonAcademicStaffDto.class))
                );
        return nonAcademicStaffDtos;
    }
}

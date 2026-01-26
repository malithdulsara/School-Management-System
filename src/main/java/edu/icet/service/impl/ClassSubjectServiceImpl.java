package edu.icet.service.impl;

import edu.icet.dto.ClassSubjectDto;
import edu.icet.entity.ClassSubjectEntity;
import edu.icet.repository.ClassSubjectRepository;
import edu.icet.service.ClassSubjectService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class ClassSubjectServiceImpl implements ClassSubjectService {
    private final ModelMapper modelMapper;
    private final ClassSubjectRepository repository;
    @Override
    public void addClassSubject(ClassSubjectDto classSubjectDto) {
        repository.save(modelMapper.map(classSubjectDto, ClassSubjectEntity.class));
    }

    @Override
    public void updateClassSubject(ClassSubjectDto classSubjectDto) {
        repository.save(modelMapper.map(classSubjectDto, ClassSubjectEntity.class));
    }

    @Override
    public void deleteClassSubject(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public ClassSubjectDto searchById(Integer id) {
        return modelMapper.map(repository.findById(id),ClassSubjectDto.class);
    }

    @Override
    public List<ClassSubjectDto> getAll() {
        List<ClassSubjectEntity>classSubjectEntities = repository.findAll();
        List<ClassSubjectDto>classSubjectDtos = new ArrayList<>();
        classSubjectEntities.forEach(classSubjectEntity ->
                classSubjectDtos.add(modelMapper.map(classSubjectEntity,ClassSubjectDto.class))
                );
        return classSubjectDtos;
    }
}

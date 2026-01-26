package edu.icet.service.impl;

import edu.icet.dto.ClassDto;
import edu.icet.entity.ClassEntity;
import edu.icet.repository.ClassRepository;
import edu.icet.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class ClassServiceImpl implements ClassService {
    private final ModelMapper modelMapper;
    private final ClassRepository repository;
    @Override
    public void addClass(ClassDto classDto) {
        repository.save(modelMapper.map(classDto, ClassEntity.class));
    }

    @Override
    public void updateClass(ClassDto classDto) {
        repository.save(modelMapper.map(classDto, ClassEntity.class));
    }

    @Override
    public void deleteClass(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public ClassDto searchById(Integer id) {
        return modelMapper.map(repository.findById(id), ClassDto.class);
    }

    @Override
    public List<ClassDto> getAll() {
        List<ClassEntity> classEntities = repository.findAll();
        List<ClassDto> classDtos = new ArrayList<>();
        classEntities.forEach(classEntity ->
                classDtos.add(modelMapper.map(classEntity, ClassDto.class))
                );
        return classDtos;
    }
}

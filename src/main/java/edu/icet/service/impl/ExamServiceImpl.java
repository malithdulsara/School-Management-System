package edu.icet.service.impl;

import edu.icet.dto.ExamDto;
import edu.icet.entity.ExamEntity;
import edu.icet.repository.ExamRepository;
import edu.icet.service.ExamService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class ExamServiceImpl implements ExamService {
    private final ModelMapper modelMapper;
    private final ExamRepository repository;
    @Override
    public void addExam(ExamDto examDto) {
        repository.save(modelMapper.map(examDto, ExamEntity.class));
    }

    @Override
    public void updateExam(ExamDto examDto) {
        repository.save(modelMapper.map(examDto, ExamEntity.class));
    }

    @Override
    public void deleteExam(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public ExamDto searchById(Integer id) {
       return modelMapper.map(repository.findById(id),ExamDto.class);
    }

    @Override
    public List<ExamDto> getAll() {
       List<ExamEntity>examEntities = repository.findAll();
       List<ExamDto>examDtos = new ArrayList<>();
       examEntities.forEach(examEntity ->
               examDtos.add(modelMapper.map(examEntity, ExamDto.class))
               );
       return examDtos;
    }
}

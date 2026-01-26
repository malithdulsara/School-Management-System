package edu.icet.service.impl;

import edu.icet.dto.ExamSubjectDto;
import edu.icet.entity.ExamSubjectEntity;
import edu.icet.repository.ExamSubjectRepository;
import edu.icet.service.ExamSubjectService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ExamSubjectServiceImpl implements ExamSubjectService {
    private final ModelMapper modelMapper;
    private final ExamSubjectRepository repository;
    @Override
    public void addExamSubject(ExamSubjectDto examSubjectDto) {
        repository.save(modelMapper.map(examSubjectDto, ExamSubjectEntity.class));
    }

    @Override
    public void updateExamSubject(ExamSubjectDto examSubjectDto) {
        repository.save(modelMapper.map(examSubjectDto, ExamSubjectEntity.class));
    }

    @Override
    public void deleteExamSubject(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public ExamSubjectDto searchById(Integer id) {
       return modelMapper.map(repository.findById(id),ExamSubjectDto.class);
    }

    @Override
    public List<ExamSubjectDto> getAll() {
        List<ExamSubjectEntity> examSubjectEntities = repository.findAll();
        List<ExamSubjectDto> examSubjectDtos = new ArrayList<>();
        examSubjectEntities.forEach(examSubjectEntity ->
                examSubjectDtos.add(modelMapper.map(examSubjectEntity,ExamSubjectDto.class))
                );
        return examSubjectDtos;
    }
}

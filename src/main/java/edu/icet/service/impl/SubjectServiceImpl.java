package edu.icet.service.impl;

import edu.icet.dto.SubjectDto;
import edu.icet.entity.SubjectEntity;
import edu.icet.repository.SubjectRepository;
import edu.icet.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {
    private final ModelMapper modelMapper;
    private final SubjectRepository repository;
    @Override
    public void addSubject(SubjectDto subjectDto) {
        repository.save(modelMapper.map(subjectDto, SubjectEntity.class));
    }

    @Override
    public void updateSubjectDto(SubjectDto subjectDto) {
        repository.save(modelMapper.map(subjectDto, SubjectEntity.class));
    }

    @Override
    public void deleteSubject(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public SubjectDto searchById(Integer id) {
        return modelMapper.map(repository.findById(id), SubjectDto.class);
    }

    @Override
    public List<SubjectDto> getAll() {
        List<SubjectEntity>subjectEntities = repository.findAll();
        List<SubjectDto>subjectDtos = new ArrayList<>();
        subjectEntities.forEach(subjectEntity ->
            subjectDtos.add(modelMapper.map(subjectEntity,SubjectDto.class))
        );
        return subjectDtos;
    }
}

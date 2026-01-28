package edu.icet.service.impl;

import edu.icet.dto.TermDto;
import edu.icet.entity.TermEntity;
import edu.icet.repository.TermRepository;
import edu.icet.service.TermService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TermServiceImpl implements TermService {
    private final ModelMapper modelMapper;
    private final TermRepository repository;
    @Override
    public void addTerm(TermDto termDto) {
        repository.save(modelMapper.map(termDto, TermEntity.class));
    }

    @Override
    public void updateTerm(TermDto termDto) {
        repository.save(modelMapper.map(termDto, TermEntity.class));
    }

    @Override
    public void deleteTerm(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public TermDto searchById(Integer id) {
        return modelMapper.map(repository.findById(id), TermDto.class);
    }

    @Override
    public List<TermDto> getALL() {
        List<TermEntity>termEntities = repository.findAll();
        List<TermDto>termDtos = new java.util.ArrayList<>();
        termEntities.forEach(termEntity ->
            termDtos.add(modelMapper.map(termEntity,TermDto.class))
        );
        return termDtos;
    }
}

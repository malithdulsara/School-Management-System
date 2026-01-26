package edu.icet.service.impl;

import edu.icet.dto.MarkDto;
import edu.icet.entity.MarkEntity;
import edu.icet.repository.MarkRepository;
import edu.icet.service.MarkService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MarkServiceImpl implements MarkService {
    private final ModelMapper modelMapper;
    private final MarkRepository repository;
    @Override
    public void addMark(MarkDto markDto) {
        repository.save(modelMapper.map(markDto, MarkEntity.class));
    }

    @Override
    public void updateMark(MarkDto markDto) {
        repository.save(modelMapper.map(markDto, MarkEntity.class));
    }

    @Override
    public void deleteMark(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public MarkDto searchById(Integer id) {
        return modelMapper.map(repository.findById(id), MarkDto.class);
    }

    @Override
    public List<MarkDto> getAll() {
        List<MarkEntity>markEntities = repository.findAll();
        List<MarkDto>markDtos = new ArrayList<>();
        markEntities.forEach(markEntity ->
                markDtos.add(modelMapper.map(markEntity,MarkDto.class))
                );
        return markDtos;
    }
}

package edu.icet.service.impl;

import edu.icet.dto.TimetableDto;
import edu.icet.entity.TimetableEntity;
import edu.icet.repository.TimetableRepository;
import edu.icet.service.TimetableService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TimeTableServiceImpl implements TimetableService {
    private final ModelMapper modelMapper;
    private final TimetableRepository repository;
    @Override
    public void addTimetable(TimetableDto timetableDto) {
        repository.save(modelMapper.map(timetableDto, TimetableEntity.class));
    }

    @Override
    public void updateTimetable(TimetableDto timetableDto) {
        repository.save(modelMapper.map(timetableDto, TimetableEntity.class));
    }

    @Override
    public void deleteTimetable(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public TimetableDto searchById(Integer id) {
        return modelMapper.map(repository.findById(id), TimetableDto.class);
    }

    @Override
    public List<TimetableDto> getAll() {
        List<TimetableEntity>timetableEntities = repository.findAll();
        List<TimetableDto>timetableDtos = new ArrayList<>();
        timetableEntities.forEach(timetableEntity ->
            timetableDtos.add(modelMapper.map(timetableEntity,TimetableDto.class))
        );
        return timetableDtos;
    }
}

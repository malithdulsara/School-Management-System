package edu.icet.service.impl;

import edu.icet.dto.TimeSlotDto;
import edu.icet.entity.TimeSlotEntity;
import edu.icet.repository.TimeSlotRepository;
import edu.icet.service.TimeSlotService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class TimeSlotServiceImpl implements TimeSlotService {
    private final ModelMapper modelMapper;
    private final TimeSlotRepository repository;
    @Override
    public void addTimeSlot(TimeSlotDto timeSlotDto) {
        repository.save(modelMapper.map(timeSlotDto, TimeSlotEntity.class));
    }

    @Override
    public void updateTimeSlot(TimeSlotDto timeSlotDto) {
        repository.save(modelMapper.map(timeSlotDto, TimeSlotEntity.class));
    }

    @Override
    public void deleteTimeSlot(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public TimeSlotDto searchById(Integer id) {
        return  modelMapper.map(repository.findById(id), TimeSlotDto.class);
    }

    @Override
    public List<TimeSlotDto> getAll() {
        List<TimeSlotEntity>timeSlotEntities = repository.findAll();
        List<TimeSlotDto>timeSlotDtos = new java.util.ArrayList<>();
        timeSlotEntities.forEach(timeSlotEntity ->
            timeSlotDtos.add(modelMapper.map(timeSlotEntity,TimeSlotDto.class))
        );
        return timeSlotDtos;
    }
}

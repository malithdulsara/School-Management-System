package edu.icet.service.impl;

import edu.icet.dto.AuditLogDto;
import edu.icet.dto.CanteenItemDto;
import edu.icet.entity.AuditLogEntity;
import edu.icet.entity.CanteenItemEntity;
import edu.icet.repository.CanteenItemRepository;
import edu.icet.service.CanteenItemService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor

public class CanteenItemServiceImpl implements CanteenItemService {

    private final ModelMapper modelMapper;
    private final CanteenItemRepository repository;
    @Override
    public void addCanteenItem(CanteenItemDto canteenItemDto) {
        repository.save(modelMapper.map(canteenItemDto, CanteenItemEntity.class));
    }

    @Override
    public void updateCanteenItem(CanteenItemDto canteenItemDto) {
        repository.save(modelMapper.map(canteenItemDto, CanteenItemEntity.class));
    }

    @Override
    public void deleteCanteenItem(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public CanteenItemDto searchById(Integer id) {
        return modelMapper.map(repository.findById(id),CanteenItemDto.class);
    }

    @Override
    public List<CanteenItemDto> getAll() {
        List<CanteenItemEntity> canteenItemEntities = repository.findAll();
        List<CanteenItemDto> canteenItemDtos = new ArrayList<>();
        canteenItemEntities.forEach(canteenItemEntity ->
                canteenItemDtos.add(modelMapper.map(canteenItemEntity,CanteenItemDto.class)
                ));
        return canteenItemDtos;
    }
}

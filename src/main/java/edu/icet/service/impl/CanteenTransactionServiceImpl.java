package edu.icet.service.impl;

import edu.icet.dto.CanteenTransactionDto;
import edu.icet.entity.CanteenTransactionEntity;
import edu.icet.repository.CanteenTransactionRepository;
import edu.icet.service.CanteenTransactionService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class CanteenTransactionServiceImpl implements CanteenTransactionService {
    private final ModelMapper modelMapper;
    private final CanteenTransactionRepository repository;
    @Override
    public void addCanteenTransaction(CanteenTransactionDto canteenTransactionDto) {
        repository.save(modelMapper.map(canteenTransactionDto, CanteenTransactionEntity.class));
    }

    @Override
    public void updateCanteenTransaction(CanteenTransactionDto canteenTransactionDto) {
        repository.save(modelMapper.map(canteenTransactionDto, CanteenTransactionEntity.class));
    }

    @Override
    public void deleteCanteenTransaction(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public CanteenTransactionDto searchById(Integer id) {
        return (modelMapper.map(repository.findById(id),CanteenTransactionDto.class));
    }

    @Override
    public List<CanteenTransactionDto> getAll() {
        List<CanteenTransactionEntity> canteenTransactionEntities = repository.findAll();
        List<CanteenTransactionDto> canteenTransactionDtos= new ArrayList<>();
        canteenTransactionEntities.forEach(canteenTransactionEntity ->
                canteenTransactionDtos.add(modelMapper.map(canteenTransactionEntity,CanteenTransactionDto.class))
                );
        return canteenTransactionDtos;
    }
}

package edu.icet.service;

import edu.icet.dto.CanteenTransactionDto;

import java.util.List;

public interface CanteenTransactionService {
    void addCanteenTransaction(CanteenTransactionDto canteenTransactionDto);
    void updateCanteenTransaction(CanteenTransactionDto canteenTransactionDto);
    void deleteCanteenTransaction(Integer id);
    CanteenTransactionDto searchById(Integer id);
    List<CanteenTransactionDto> getAll();
}

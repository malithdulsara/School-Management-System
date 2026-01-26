package edu.icet.service;

import edu.icet.dto.CanteenItemDto;

import java.util.List;

public interface CanteenItemService {
    void addCanteenItem(CanteenItemDto canteenItemDto);
    void updateCanteenItem(CanteenItemDto canteenItemDto);
    void deleteCanteenItem(Integer id);
    CanteenItemDto searchById(Integer id);
    List<CanteenItemDto> getAll();
}

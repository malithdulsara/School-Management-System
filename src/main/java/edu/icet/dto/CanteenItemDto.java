package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CanteenItemDto {
    private Integer itemId;
    private Integer schoolId;
    private String itemName;
    private Double price;
    private Integer stockQuantity;
}

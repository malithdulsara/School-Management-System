package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeeStructureDto {
    private Integer feeStructureId;
    private Integer classId;
    private Integer feeCategoryId;
    private Double amount;
}

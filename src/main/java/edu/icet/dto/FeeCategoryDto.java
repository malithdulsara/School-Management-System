package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeeCategoryDto {
    private Integer feeCategoryId;
    private Integer schoolId;
    private String name;

}

package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentParentDto {
    private Integer studentId;
    private Integer parentId;
    private String relationship;
    private boolean emergenceContact;
}

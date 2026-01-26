package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CanteenTransactionDto {
    private Integer transactionId;
    private Integer studentId;
    private Integer itemId;
    private Integer quantity;
    private Double totalPrice;
    private LocalDate transactionDate;
}

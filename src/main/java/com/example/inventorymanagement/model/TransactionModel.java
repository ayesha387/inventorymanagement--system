package com.example.inventorymanagement.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
@Data
public class TransactionModel {
    private Long id;
    private LocalDate transactionDate;
    private String type;
    private int quantity;
    private double unitPrice;
    private int relatedOrderId;
}

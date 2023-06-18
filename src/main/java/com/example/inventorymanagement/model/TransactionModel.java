package com.example.inventorymanagement.model;

import lombok.Data;

import java.util.Date;
@Data
public class TransactionModel {
    private Long id;
    private Date transactionDate;
    private String type;
    private int quantity;
    private double unitPrice;
    private int relatedOrderId;
}

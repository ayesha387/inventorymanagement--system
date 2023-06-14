package com.example.inventorymanagement.model;

import java.util.Date;

public class TransactionModel {
    private Long id;
    private Date transactionDate;
    private String type;
    private int quantity;
    private double unitPrice;
    private int relatedOrderId;
}

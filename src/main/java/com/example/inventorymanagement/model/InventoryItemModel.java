package com.example.inventorymanagement.model;

import jakarta.persistence.Column;

import java.util.Date;

public class InventoryItemModel {
    private String itemName;
    private String companyName;
    private Date purchaseDate;
    private Date saleDate;
    private double balanceRemaining;
    private Long warehouse_id;
    private int quantity;
    private Date lastRestockDate;

}

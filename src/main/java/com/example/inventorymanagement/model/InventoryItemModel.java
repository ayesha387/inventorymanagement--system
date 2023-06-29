package com.example.inventorymanagement.model;

import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
@Data
public class InventoryItemModel {
    private String itemName;
    private String companyName;
    private LocalDate purchaseDate;
    private LocalDate saleDate;
    private double balanceRemaining;
    private Long warehouse_id;
    private int quantity;
    private LocalDate lastRestockDate;

}

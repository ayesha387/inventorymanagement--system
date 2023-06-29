package com.example.inventorymanagement.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
@Data
public class ProductModel {
    private String name;
    private String description;
    private double price;
    private int quantity;
    private String category;
    private LocalDate purchaseDate;
    private LocalDate saleDate;
}

package com.example.inventorymanagement.model;

import lombok.Data;

@Data
public class WarehouseModel {
    private Long id;
    private String name;
    private String location;
    private int capacity;
    private String address;
}

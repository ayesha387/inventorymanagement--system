package com.example.inventorymanagement.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
@Data
public class SalesOrderModel {
    private LocalDate orderDate;
    private String deliveryAddress;
    private double total;
}

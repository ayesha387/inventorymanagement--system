package com.example.inventorymanagement.model;

import lombok.Data;

import java.util.Date;
@Data
public class SalesOrderModel {
    private Date orderDate;
    private String deliveryAddress;
    private double total;
}

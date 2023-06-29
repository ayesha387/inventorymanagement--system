package com.example.inventorymanagement.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
@Data
public class PurchaseOrderModel {
    private Long supplierId;
    private LocalDate orderDate;
    private LocalDate expectedDeliveryDate;
    private double totalCost;

}

package com.example.inventorymanagement.model;

import lombok.Data;

import java.util.Date;
@Data
public class PurchaseOrderModel {
    private Long supplierId;
    private Date orderDate;
    private Date expectedDeliveryDate;
    private double totalCost;

}

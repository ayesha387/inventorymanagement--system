package com.example.inventorymanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "transactions")
@Data
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Date transactionDate;
    private String type;
    private int quantity;
    private double unitPrice;
    private int relatedOrderId;

    @ManyToOne
    @JoinColumn(name = "related_purchase_order_id")
    private PurchaseOrder purchaseOrder;

    @ManyToOne
    @JoinColumn(name = "related_sales_order_id")
    private SalesOrder salesOrder;

}

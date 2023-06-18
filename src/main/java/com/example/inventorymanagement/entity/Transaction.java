package com.example.inventorymanagement.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "transactions")
@Data
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;
    @Column(name = "transactionDate")
    private LocalDate transactionDate;
    private String type;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "unitPrice")
    private double unitPrice;
    @Column(name = "relatedOrderId")
    private int relatedOrderId;

    @ManyToOne
    @JoinColumn(name = "related_purchase_order_id")
    private PurchaseOrder purchaseOrder;

    @ManyToOne
    @JoinColumn(name = "related_sales_order_id")
    private SalesOrder salesOrder;

}

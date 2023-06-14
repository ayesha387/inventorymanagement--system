package com.example.inventorymanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "purchase_orders")
@Data
public class PurchaseOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    /*private int supplier_id;*/

    private Date orderDate;
    private Date expectedDeliveryDate;
    private double totalCost;
    @Column(insertable=false, updatable=false)
    private Long supplier_id;
   /* private String status;*/

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;


    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}

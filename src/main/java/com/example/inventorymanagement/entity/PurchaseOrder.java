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

    @Column(insertable=false, updatable=false)
    /*private int supplier_id;*/
    private Long supplier_id;
    private Date orderDate;
    private Date expectedDeliveryDate;
    private double totalCost;
   /* private String status;*/

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

}

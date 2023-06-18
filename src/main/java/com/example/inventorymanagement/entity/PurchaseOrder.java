package com.example.inventorymanagement.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "purchase_orders")
@Data
public class PurchaseOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;
    @Column(name = "orderDate")
    private LocalDate orderDate;
    @Column(name = "expectedDeliveryDate")
    private LocalDate expectedDeliveryDate;
    @Column(name = "totalCost")
    private double totalCost;
    @Column(insertable=false, updatable=false)
    private Long supplier_id;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}

package com.example.inventorymanagement.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "sales_orders")
@Data
public class SalesOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;
    private Date orderDate;
    @Column(name = "deliveryAddress")
    private String deliveryAddress;
    @Column(name = "totalCost")
    private double totalCost;
    @Column(insertable=false, updatable=false)
    private Long customer_id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}

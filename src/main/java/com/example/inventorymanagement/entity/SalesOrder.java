package com.example.inventorymanagement.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Table(name = "sales_orders")
@Data
public class SalesOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;
    @Column(name = "orderDate")
    private LocalDate orderDate;
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

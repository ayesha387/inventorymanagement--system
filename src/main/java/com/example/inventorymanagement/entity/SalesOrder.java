package com.example.inventorymanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "sales_orders")
@Data
public class SalesOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(insertable=false, updatable=false)
/*    private int customer_id;*/
    private Long customer_id;
    private Date orderDate;
    private String deliveryAddress;
    private double totalCost;
  /*  private String status;*/


    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}

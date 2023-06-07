package com.example.inventorymanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "inventory_items")
@Data
public class InventoryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(insertable=false, updatable=false)
    private Long product_id;
    private String itemName;
    private String companyName;
    private Date purchaseDate;
    private Date saleDate;
    private double balanceRemaining;
    /*private int product_id;*/
    @Column(insertable=false, updatable=false)
    private Long warehouse_id;
 /*   private int warehouse_id;*/
    private int quantity;
    private Date lastRestockDate;


    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "warehouse_id")
    private WareHouse wareHouse;
}

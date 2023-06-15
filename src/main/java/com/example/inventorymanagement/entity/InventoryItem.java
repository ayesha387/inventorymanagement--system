package com.example.inventorymanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "inventory_items")
@Data
public class InventoryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;
    @Column(name = "itemName")
    private String itemName;
    @Column(name = "companyName")
    private String companyName;
    @Column(name = "purchaseDate")
    private Date purchaseDate;
    @Column(name = "saleDate")
    private Date saleDate;
    @Column(name = "balanceRemaining")
    private double balanceRemaining;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "lastRestockDate")
    private Date lastRestockDate;
    @Column(insertable=false, updatable=false)
    private Long warehouse_id;
    @Column(insertable=false, updatable=false)
    private Long product_id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "warehouse_id")
    private Warehouse wareHouse;
}

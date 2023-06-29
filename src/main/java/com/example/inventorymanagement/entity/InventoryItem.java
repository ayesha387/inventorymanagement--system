package com.example.inventorymanagement.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
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
    private LocalDate purchaseDate;
    @Column(name = "saleDate")
    private LocalDate saleDate;

    @Column(insertable=false, updatable=false)
    private Long warehouse_id;

    @Column(name = "balanceRemaining")
    private double balanceRemaining;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "lastRestockDate")
    private LocalDate lastRestockDate;
    @Column(insertable=false, updatable=false)
    private Long product_id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "warehouse_id")
    private Warehouse wareHouse;
}

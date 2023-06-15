package com.example.inventorymanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private double price;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "category")
    private String category;
    @Column(name = "purchaseDate")
    private Date purchaseDate;
    @Column(name = "saleDate")
    private Date saleDate;
    @Column(insertable=false, updatable=false)
    private Long supplier_id;

    @OneToMany(mappedBy = "product")
    private List<InventoryItem> inventoryItems;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;


}

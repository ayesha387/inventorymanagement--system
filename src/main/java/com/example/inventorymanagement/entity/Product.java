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
    private Long id;
    private String name;
    private String description;
    private double price;
    private int quantity;
    private String category;
    private Date purchaseDate;
    private Date saleDate;
    @Column(insertable=false, updatable=false)
/*    private int supplier_id;*/
    private Long supplier_id;


    @OneToMany(mappedBy = "product")
    private List<InventoryItem> inventoryItems;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

}

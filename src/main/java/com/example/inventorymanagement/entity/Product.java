package com.example.inventorymanagement.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
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
    private LocalDate purchaseDate;
    @Column(name = "saleDate")
    private LocalDate saleDate;
    @Column(insertable=false, updatable=false)
    private Long supplier_id;

    @OneToMany(mappedBy = "product")
    private List<InventoryItem> inventoryItems;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;


}

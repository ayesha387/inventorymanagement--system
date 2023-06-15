package com.example.inventorymanagement.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "wareHouses")
@Data
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "location")
    private String location;
    @Column(name = "capacity")
    private int capacity;
    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "wareHouse")
    private List<InventoryItem> inventoryItems;

}

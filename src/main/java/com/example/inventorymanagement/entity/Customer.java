package com.example.inventorymanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "customers")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "phoneNo")
    private String phoneNo;
    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "customer")
    private List<PurchaseOrder> purchaseOrders;

}

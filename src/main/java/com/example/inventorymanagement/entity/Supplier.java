package com.example.inventorymanagement.entity;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Table(name = "suppliers")
@Data
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "contactInformation")
    private String contactInformation;
    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "supplier")
    private List<Product> products;

    @OneToMany(mappedBy = "supplier")
    private List<PurchaseOrder> purchaseOrders;

}

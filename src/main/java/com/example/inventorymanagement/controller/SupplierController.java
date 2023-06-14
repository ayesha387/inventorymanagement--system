package com.example.inventorymanagement.controller;

import com.example.inventorymanagement.entity.Supplier;
import com.example.inventorymanagement.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;
/*
    private final SupplierService supplierService;

    @Autowired
    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }
*/
@PostMapping("/supplier")
public Supplier saveSupplier(@RequestBody Supplier supplier) {
    return supplierService.saveSupplier(supplier);
}

    @GetMapping("/list")
    public List<Supplier> getAllSuppliers() {
        return supplierService.getAllSuppliers();
    }

    @GetMapping("/{id}")
    public Supplier getSupplierById(@PathVariable Long id) {
        return supplierService.getSupplierById(id);
    }


    @DeleteMapping("/{id}")
    public void deleteSupplier(@PathVariable Long id) {
        supplierService.deleteSupplier(id);
    }
}

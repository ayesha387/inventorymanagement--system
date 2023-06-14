package com.example.inventorymanagement.service;

import com.example.inventorymanagement.entity.Supplier;
import com.example.inventorymanagement.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;
 /*   private final SupplierRepository supplierRepository;*/

/*
    @Autowired
    public SupplierService(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }
*/

    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }

    public Supplier getSupplierById(Long id) {
        return supplierRepository.findById(id).orElse(null);
    }

    public Supplier saveSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    public void deleteSupplier(Long id) {
        supplierRepository.deleteById(id);
    }
}

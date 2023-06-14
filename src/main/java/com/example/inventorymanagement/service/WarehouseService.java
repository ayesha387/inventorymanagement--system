package com.example.inventorymanagement.service;

import com.example.inventorymanagement.entity.Warehouse;
import com.example.inventorymanagement.repository.WarehouseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface WarehouseService {
    List<Warehouse> getAllWarehouses();
    Warehouse getWarehouseById(Long id);
    Warehouse createWarehouse(Warehouse warehouse);
    Warehouse updateWarehouse(Long id, Warehouse warehouse);
    void deleteWarehouse(Long id);
}


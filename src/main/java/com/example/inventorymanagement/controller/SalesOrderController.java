package com.example.inventorymanagement.controller;

import com.example.inventorymanagement.entity.SalesOrder;
import com.example.inventorymanagement.service.SalesOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salesOrders")
public class SalesOrderController {
    @Autowired
    private SalesOrderService salesOrderService;

    @PostMapping("/salesOrder")
    public SalesOrder createSalesOrder(@RequestBody SalesOrder salesOrder) {
        return salesOrderService.saveSalesOrder(salesOrder);
    }

    @GetMapping("/list")
    public List<SalesOrder> getAllSalesOrders() {
        return salesOrderService.getAllSalesOrders();
    }

    @GetMapping("/{id}")
    public SalesOrder getSalesOrderById(@PathVariable("id") Long id) {
        return salesOrderService.getSalesOrderById(id);
    }


    @DeleteMapping("/{id}")
    public void deleteSalesOrder(@PathVariable("id") Long id) {
        salesOrderService.deleteSalesOrder(id);
    }
}

package com.example.inventorymanagement.controller;

import com.example.inventorymanagement.entity.PurchaseOrder;
import com.example.inventorymanagement.service.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/purchase-orders")
public class PurchaseOrderController {
    @Autowired
    private PurchaseOrderService purchaseOrderService;
  /*  private final PurchaseOrderService purchaseOrderService;*/

/*
    @Autowired
    public PurchaseOrderController(PurchaseOrderService purchaseOrderService) {
        this.purchaseOrderService = purchaseOrderService;
    }
*/

    @PostMapping("/purchaseOrder")
    public ResponseEntity<PurchaseOrder> createPurchaseOrder(@RequestBody PurchaseOrder purchaseOrder) {
        PurchaseOrder savedPurchaseOrder = purchaseOrderService.savePurchaseOrder(purchaseOrder);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedPurchaseOrder);
    }

    @GetMapping("/list")
    public List<PurchaseOrder> getAllPurchaseOrders() {
        return purchaseOrderService.getAllPurchaseOrders();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PurchaseOrder> getPurchaseOrderById(@PathVariable("id") Long id) {
        PurchaseOrder purchaseOrder = purchaseOrderService.getPurchaseOrderById(id);
        if (purchaseOrder != null) {
            return ResponseEntity.ok(purchaseOrder);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePurchaseOrder(@PathVariable("id") Long id) {
        purchaseOrderService.deletePurchaseOrder(id);
        return ResponseEntity.noContent().build();
    }
}


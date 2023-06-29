package com.example.inventorymanagement.controller;
import com.example.inventorymanagement.entity.InventoryItem;
import com.example.inventorymanagement.service.InventoryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventoryItems")
public class InventoryItemController {
    @Autowired
    private InventoryItemService inventoryItemService;
    @PostMapping("/inventoryItem")
    public ResponseEntity<Void> createInventoryItem(@RequestBody InventoryItem inventoryItem) {
        inventoryItemService.saveInventoryItem(inventoryItem);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<InventoryItem>> getAllInventoryItems() {
        List<InventoryItem> inventoryItems = inventoryItemService.getAllInventoryItems();
        return new ResponseEntity<>(inventoryItems, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InventoryItem> getInventoryItemById(@PathVariable Long id) throws ChangeSetPersister.NotFoundException {
        InventoryItem inventoryItem = inventoryItemService.getInventoryItemById(id);
        return new ResponseEntity<>(inventoryItem, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInventoryItem(@PathVariable Long id) {
        inventoryItemService.deleteInventoryItem(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

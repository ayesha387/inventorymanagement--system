package com.example.inventorymanagement.service;

import com.example.inventorymanagement.entity.Transaction;
import com.example.inventorymanagement.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

public interface TransactionService {
    Transaction createTransaction(Transaction transaction);
    Transaction getTransactionById(Long id);
    List<Transaction> getAllTransactions();
    void deleteTransaction(Long id);
}


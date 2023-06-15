package com.example.inventorymanagement.service;

import com.example.inventorymanagement.entity.Transaction;
import java.util.List;

public interface TransactionService {
    Transaction createTransaction(Transaction transaction);
    Transaction getTransactionById(Long id);
    List<Transaction> getAllTransactions();
    void deleteTransaction(Long id);
}


package com.example.app.payment.infrastructure;

import com.example.app.payment.domain.InMemoryRepositoryEngine;
import com.example.app.payment.domain.Transaction;
import com.example.app.payment.domain.TransactionId;

import java.util.Collection;

public final class PaymentInMemoryRepository extends InMemoryRepositoryEngine<TransactionId, Transaction> {

    @Override
    public TransactionId nextID(String id) {
        return new TransactionId(id);
    }

    @Override
    public Transaction findById(TransactionId transactionId) {
        return data.get(transactionId.getValue());
    }

    @Override
    public Collection<Transaction> findAll() {
        return data.values();
    }

    @Override
    public Transaction save(Transaction entity) {
        data.put(entity.getId(), entity);
        return data.get(entity.getId());
    }
}

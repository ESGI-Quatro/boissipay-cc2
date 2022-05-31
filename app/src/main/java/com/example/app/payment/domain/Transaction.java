package com.example.app.payment.domain;

public class Transaction {
    private TransactionId id;
    private Amount amount;
    private UserId userId;

    public Transaction(TransactionId id, Amount amount, UserId userId) {
        this.id = id;
        this.amount = amount;
        this.userId = userId;
    }

    public TransactionId getId() {
        return id;
    }
}

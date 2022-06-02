package com.example.app.payment.application;

import com.example.app.payment.domain.*;

import java.util.Objects;

public final class CreatePaymentTransaction {

    private final CacheService cacheService;
    private final PaymentService paymentService;
    private final InMemoryRepositoryEngine<TransactionId, Transaction> repository;

    public CreatePaymentTransaction(CacheService cacheService, PaymentService paymentService, InMemoryRepositoryEngine<TransactionId, Transaction> repository) {
        this.cacheService = cacheService;
        this.paymentService = paymentService;
        this.repository = repository;
    }

    public String execute(String userId, double amount) {
        var previousValue = cacheService.getValueByKey(userId);
        if(!Objects.nonNull(previousValue)){
            String transactionId = paymentService.createTransaction();
            cacheService.upsertValueByKey(userId, transactionId);
            final Transaction transaction = new Transaction(new TransactionId(transactionId), new Amount(amount), new UserId(userId));
            repository.save(transaction);
            cacheService.deleteValueByKey(userId);
            return transactionId;
        }else {
          throw new RuntimeException("transaction already processing");
        }
    }
}


package com.example.app.payment.infrastructure;

import com.example.app.payment.domain.PaymentService;

import java.util.UUID;

public final class BoissiPaymentService implements PaymentService {
    @Override
    public String createTransaction() {
        final UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}

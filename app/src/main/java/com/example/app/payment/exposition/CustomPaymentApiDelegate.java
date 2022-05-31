package com.example.app.payment.exposition;

import com.example.app.payment.application.CreatePaymentTransaction;
import com.example.app.payment.infrastructure.BoissiPaymentService;
import com.example.app.payment.infrastructure.JedisCacheService;
import com.example.app.payment.infrastructure.PaymentInMemoryRepository;
import com.example.api.PaymentApiDelegate;
import com.example.model.PaymentRequest;
import com.example.model.PaymentResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CustomPaymentApiDelegate implements PaymentApiDelegate {
    @Override
    public ResponseEntity<PaymentResponse> pay(PaymentRequest body) {
        final CreatePaymentTransaction createPaymentTransaction = new CreatePaymentTransaction(new JedisCacheService(), new BoissiPaymentService(), new PaymentInMemoryRepository());
        createPaymentTransaction.execute(body.getUserId(), body.getAmount().doubleValue());
        return PaymentApiDelegate.super.pay(body);
    }
}
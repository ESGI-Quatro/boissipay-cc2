//package com.example.app.payment.exposition;
//
//import com.example.app.payment.application.CreatePaymentTransaction;
//import com.example.app.payment.infrastructure.BoissiPaymentService;
//import com.example.app.payment.infrastructure.JedisCacheService;
//import com.example.app.payment.infrastructure.PaymentInMemoryRepository;
//import com.example.api.PaymentApiDelegate;
//import com.example.model.PaymentRequest;
//import com.example.model.PaymentResponse;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//@Service
//public final class CustomPaymentApiDelegate implements PaymentApiDelegate {
//    @Override
//    public ResponseEntity<PaymentResponse> pay(PaymentRequest body) {
//        PaymentResponse paymentResponse = new PaymentResponse();
//        try {
//            final CreatePaymentTransaction createPaymentTransaction = new CreatePaymentTransaction(new JedisCacheService(), new BoissiPaymentService(), new PaymentInMemoryRepository());
//            final String transactionId = createPaymentTransaction.execute(body.getUserId(), body.getAmount().doubleValue());
//            paymentResponse.transactionId(transactionId);
//            paymentResponse.status(PaymentResponse.StatusEnum.APPROVED);
//            return ResponseEntity.ok(paymentResponse);
//        }catch (Exception e) {
//            paymentResponse.status(PaymentResponse.StatusEnum.REFUSED);
//            return ResponseEntity.internalServerError().body(paymentResponse);
//        }
//
//    }
//}

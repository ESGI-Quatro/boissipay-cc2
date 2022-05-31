package com.example.app.payment.domain;


public enum TransactionStatus{
    PENDING("PENDING"),
    REFUSED("REFUSED"),
    ERROR("ERROR"),
    APPROVED("APPROVED");

    TransactionStatus(String value) {
        this.value = value;
    }

    private final String value;

}
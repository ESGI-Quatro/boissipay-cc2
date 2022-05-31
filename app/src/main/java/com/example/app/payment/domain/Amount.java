package com.example.app.payment.domain;

import java.util.Objects;

public class Amount {

    private final double value;

    public Amount(double value) {
        if(value == 0.00) throw new RuntimeException("amount invalid");
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amount amount = (Amount) o;
        return Double.compare(amount.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public double getValue() {
        return value;
    }
}

package com.example.app.payment.domain;

import java.util.Objects;

public final class UserId {

    private final String value;

    public UserId(String value) {
        if(value.length() < 4) throw new RuntimeException("id invalid");
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserId that = (UserId) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "UserId{" +
                "value=" + value +
                '}';
    }

    public String getValue() {
        return value;
    }
}

package com.example.app.payment.domain;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class InMemoryRepositoryEngine<ID, EN> implements Repository<ID, EN> {
    protected final AtomicInteger count;
    protected final Map<ID, EN> data;

    protected InMemoryRepositoryEngine() {
        count = new AtomicInteger(0);
        data = new ConcurrentHashMap<>();
    }

    @Override
    public void delete(ID id) {
        data.remove(id);
    }
}

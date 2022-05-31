package com.example.app.payment.domain;

import java.util.Collection;

public interface Repository<ID, EN> {
    ID nextID(String id);
    EN findById(ID id);
    Collection<EN> findAll();
    EN save(EN entity);
    void delete(ID id);
}

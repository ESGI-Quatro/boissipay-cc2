package com.example.app.payment.infrastructure;

import com.example.app.payment.domain.CacheService;

public class JedisCacheService implements CacheService {
    @Override
    public String getValueByKey(String key) {
        return null;
    }

    @Override
    public void upsertValueByKey(String key, String value) {

    }

    @Override
    public void deleteValueByKey(String key) {

    }
}

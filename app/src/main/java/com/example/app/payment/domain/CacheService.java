package com.example.app.payment.domain;

public interface CacheService {
    String getValueByKey(String key);
    void upsertValueByKey(String key, String value);
    void deleteValueByKey(String key);
}

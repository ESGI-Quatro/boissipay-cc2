package com.example.app.payment.infrastructure;

import com.example.app.payment.domain.CacheService;
import redis.clients.jedis.Jedis;

public class JedisCacheService implements CacheService {
    private final Jedis jedis;

    public JedisCacheService() {
        this.jedis = new Jedis("redis://localhost:6379/1");
    }

    @Override
    public String getValueByKey(String key) {
        return jedis.get(key);
    }

    @Override
    public void upsertValueByKey(String key, String value) {
        jedis.set(key, value);
    }

    @Override
    public void deleteValueByKey(String key) {
        jedis.del(key);
    }

}

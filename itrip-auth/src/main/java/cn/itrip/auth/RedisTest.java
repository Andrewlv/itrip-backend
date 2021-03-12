package cn.itrip.auth;

import redis.clients.jedis.Jedis;

public class RedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost",6379);
        jedis.auth("555888ljq");
        jedis.set("name","haha");
        System.out.println(jedis.get("name"));
    }
}

package com.redisson.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;



@Setter
@Getter
@RedisHash("user")
@ToString
public class User {

    @Id
    private long id;
    private String name;


}

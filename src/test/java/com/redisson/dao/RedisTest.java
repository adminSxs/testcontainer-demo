package com.redisson.dao;

import com.redisson.entity.User;
import com.redisson.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.redis.DataRedisTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertTrue;

@DataRedisTest
@RunWith(SpringRunner.class)
@ActiveProfiles("test")
public class RedisTest {

  @Autowired private UserRepository userRepository;

  @Test
  public void test1() {
    User user = new User();
    user.setId(1);
    user.setName("test1");
    userRepository.save(user);

    Optional<User> optionUser = userRepository.findById(1l);
    assertTrue(optionUser.isPresent());
  }


}

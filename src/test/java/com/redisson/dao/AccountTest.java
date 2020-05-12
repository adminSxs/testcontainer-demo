package com.redisson.dao;

import com.redisson.daos.IAccountDao;
import com.redisson.daos.impl.AccountDao;
import com.redisson.entity.AccountEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@DataJpaTest
@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@Import({AccountDao.class})
public class AccountTest {

    @Autowired
    private IAccountDao accountDao;


    @Test
    public void save(){
        AccountEntity account = new AccountEntity();
        account.setId(1l);
        account.setUsername("123234");
        accountDao.save(account);

    }
}

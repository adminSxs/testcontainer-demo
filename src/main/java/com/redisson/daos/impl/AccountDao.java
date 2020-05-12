package com.redisson.daos.impl;

import com.redisson.daos.IAccountDao;
import com.redisson.entity.AccountEntity;
import com.redisson.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDao implements IAccountDao {
    @Autowired
    private AccountRepository accountRepository;
    @Override
    public void save(AccountEntity account) {
       accountRepository.saveAndFlush(account);
    }
}

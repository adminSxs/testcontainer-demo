package com.redisson.daos;

import com.redisson.entity.AccountEntity;

public interface IAccountDao {
    void save(AccountEntity account);
}

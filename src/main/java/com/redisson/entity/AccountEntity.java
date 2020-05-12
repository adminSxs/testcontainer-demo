package com.redisson.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
@Setter
@Getter
public class AccountEntity {

    @Id
    private Long id;

    @Column
    private String username;
}

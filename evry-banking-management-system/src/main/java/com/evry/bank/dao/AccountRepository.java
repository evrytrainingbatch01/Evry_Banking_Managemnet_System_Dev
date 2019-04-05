package com.evry.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evry.bank.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}

package com.evry.bank.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evry.bank.dao.AccountDao;
import com.evry.bank.dao.TransactionDao;
import com.evry.bank.model.Account;
import com.evry.bank.model.Transaction;
import com.evry.bank.service.AccountService;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountDao accountDao;

	@Autowired
	TransactionDao transactionDao;

	@Override
	public boolean checkAccountDetails(int id) {
		return accountDao.checkAccountDetails(id);
	}

	@Override
	public BigDecimal checkBalance(int id) {
		return accountDao.checkBalance(id);
	}

	@Override
	public boolean transferMoney(int fromid, int toid, double amount) {
		boolean flag = false;
		try {
			flag = accountDao.transferMoney(fromid, toid, amount);
		} catch (EntityNotFoundException e) {
			flag = false;
		}
		return flag;
	}

	@Override
	public Optional<Account> getAccountById(int id) {
		return accountDao.getAccountById(id);
	}

	@Override
	public Optional<Transaction> getTransactionDetails(int id) {
		return transactionDao.findAllTransactionByCustomerId(id);
	}

}

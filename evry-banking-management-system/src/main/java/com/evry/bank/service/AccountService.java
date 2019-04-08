package com.evry.bank.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.evry.bank.model.Account;
import com.evry.bank.model.Transaction;

public interface AccountService {
	public boolean checkAccountDetails(int id);
	public BigDecimal checkBalance(int id);
	public boolean transferMoney(int fromid, int toid, double amount);
	public Optional<Account> getAccountById(int id);
	public Optional<Transaction> getTransactionDetails(int id);
}

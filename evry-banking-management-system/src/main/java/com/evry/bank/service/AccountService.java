package com.evry.bank.service;

import java.math.BigDecimal;

public interface AccountService {
	public boolean checkAccountDetails(int id);
	public BigDecimal checkBalance(int id);
	public boolean transferMoney(int fromid, int toid, double amount);
}

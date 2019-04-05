package com.evry.bank.service;

import java.math.BigDecimal;

public interface AccountService {
	public boolean checkAccountDetails(int id);
	public BigDecimal checkBalance(int id);
	public void transferMoney(int fromid, int toid, double amount);
}

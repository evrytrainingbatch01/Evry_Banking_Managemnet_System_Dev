package com.evry.bank.dao;

import java.math.BigDecimal;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.evry.bank.model.Account;

/*
 * @author indrajit.maharana
 * @author swaroop.panda
 * 
 */

@Repository("accountDao")
public class AccountDao {
	@Autowired
	AccountRepository accountRepository;

	// Check Customer Bank details using id
	public boolean checkAccountDetails(int id) {
		boolean flag = false;

		if (accountRepository.findById(id).isPresent()) {
			flag = true;
		}
		return flag;
	}

	// Check Customer Bank balance using id
	public BigDecimal checkBalance(int id) {

		Account account = accountRepository.getOne(id);
		return account.getAccountBalance();
	}

	// Transfer Money from one account to another account
	@Transactional
	public boolean transferMoney(int fromid, int toid, double amount) throws EntityNotFoundException{
		boolean status = false;
		if (null != accountRepository.findById(toid)) {
			double fromBalance = checkBalance(fromid).doubleValue();
			double toBalance = checkBalance(toid).doubleValue();
			boolean flag = false;
			if (fromBalance >= amount) {
				Account account = accountRepository.getOne(fromid);
				account.setAccountBalance(new BigDecimal(fromBalance - amount));
				accountRepository.save(account);
				flag = true;
			}
			if (flag) {
				Account account = accountRepository.getOne(toid);
				account.setAccountBalance(new BigDecimal(toBalance + amount));
				accountRepository.save(account);
				status = true;
			}
		}
		return status;
	}

}

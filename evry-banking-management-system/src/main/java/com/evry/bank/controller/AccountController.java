/**
 * @author sadiq.ahamad
 */
package com.evry.bank.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evry.bank.model.Account;
import com.evry.bank.model.Customer;
import com.evry.bank.model.Transaction;
import com.evry.bank.service.AccountService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@GetMapping("/checkAccountDetails/{id}")
	public boolean checkAccountDetails(@PathVariable("id") int id) {

		return accountService.checkAccountDetails(id);
	}
	
	@GetMapping("/getAccountDetails/{id}")
	public Account getAccountDetails(@PathVariable("id") int id) {
		Optional<Account> accounts = accountService.getAccountById(id);
		return accounts.get();
	}

	@GetMapping("/checkBalance/{id}")
	public BigDecimal checkBalance(@PathVariable("id") int id) {
		BigDecimal checkBalance = accountService.checkBalance(id);
		return checkBalance;
	}

	@PutMapping("/transferMoney/{id}/{toid}/{amount}")
	public boolean transferMoney(@PathVariable("id") int fromid, @PathVariable("toid") int toid,
			@PathVariable("amount") double amount) {
		return accountService.transferMoney(fromid, toid, amount);
	}
	
	@GetMapping("/getTransactionDetails/{id}")
	public Optional<Transaction> getTransactionDetails(@PathVariable("id") int id) {
		return accountService.getTransactionDetails(id);
	}

}

/**
 * @author sadiq.ahamad
 */
package com.evry.bank.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

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

	@GetMapping("/checkBalance/{id}")
	public BigDecimal checkBalance(@PathVariable("id") int id) {
		BigDecimal checkBalance = accountService.checkBalance(id);
		return checkBalance;
	}

	@PutMapping("/transferMoney/{id}/{toid}/{amount}")
	public void transferMoney(@PathVariable("id") int fromid, @PathVariable("toid") int toid,
			@PathVariable("amount") double amount) {
		accountService.transferMoney(fromid, toid, amount);
	}

}

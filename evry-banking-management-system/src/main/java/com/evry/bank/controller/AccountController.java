
package com.evry.bank.controller;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evry.bank.model.Account;
import com.evry.bank.model.Transaction;
import com.evry.bank.service.AccountService;

/**
 * This AccountController is an start-end point of the Account means the operations which this
 * application wants to do with respect to Account has to done via this controller class only. 
 * 
 * @author sadiq.ahamad
 * @author renuka.prasada
 */

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AccountController {

	/**
	 * Here AccountService class is Autowired using DI concept.
	 */
	
	@Autowired
	private AccountService accountService;

	/**
	 * From this method application is fetching the AccountDetails using AccountService.
	 * @param id
	 * @return this checkAccountDetails method returning the type as boolean i.e., if the account-
	 * details are exist then return 'true' else 'false'.
	 */
	@GetMapping("/checkAccountDetails/{id}")
	public boolean checkAccountDetails(@PathVariable("id") int id) {

		return accountService.checkAccountDetails(id);
	}
	/**
	 * From this method application is fetching the AccountDetails using AccountService.
	 * @param id
	 * @return this getAccountDetails method returning the type as boolean i.e., if the account-
	 * details are exist then return Account object else here we are using small reactive- 
	 * programming feature so that it will return empty data.
	 */
	
	@GetMapping("/getAccountDetails/{id}")
	public Account getAccountDetails(@PathVariable("id") int id) {
		Optional<Account> accounts = accountService.getAccountById(id);
		return accounts.get();
	}
	
	/**
	 * From this method application is checking balance using AccountService.
	 * @param id
	 * @return this checkBalance method returning the type as BigDecimal i.e., in the account-
	 * money will be returned in BigDecimal format.
	 */

	@GetMapping("/checkBalance/{id}")
	public BigDecimal checkBalance(@PathVariable("id") int id) {
		BigDecimal checkBalance = accountService.checkBalance(id);
		return checkBalance;
	}
	
	/**
	 * From this method application is transferring the Money from one Account to other Account-
	 * using AccountService class.
	 * @param id,toid&amount
	 * @return this transferMoney method returning the type as boolean i.e., if the amount,
	 * the fromid who is transferring money,benefiter id are exist and operation can perform-
	 * successfully then return 'true' else 'false'.
	 */

	@PutMapping("/transferMoney/{id}/{toid}/{amount}")
	public boolean transferMoney(@PathVariable("id") int fromid, @PathVariable("toid") int toid,
			@PathVariable("amount") double amount) {
		return accountService.transferMoney(fromid, toid, amount);
	}
	
	/**
	 * From this method application is fetching the TransactionDetails using AccountService.
	 * @param id
	 * @return this getTransactionalDetails method returning the type as Transaction object.
	 * if the there are any details with respect to transactions that customer is having in the sense
	 * it has to return that Transaction details else here also we are using some reactive programming-
	 * just it will return empty data.
	 */
	
	@GetMapping("/getTransactionDetails/{id}")
	public Optional<Transaction> getTransactionDetails(@PathVariable("id") int id) {
		return accountService.getTransactionDetails(id);
	}

}

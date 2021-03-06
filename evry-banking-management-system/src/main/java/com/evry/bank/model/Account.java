package com.evry.bank.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Access(AccessType.PROPERTY)
@Table(name = "EB_ACCOUNT")
public class Account {

	private int id;
	private BigDecimal accountBalance;
	private int customerACCId;
	// private List<Transaction> transactions;

	public Account() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "eb_account_generator")
	@SequenceGenerator(name = "eb_account_generator", sequenceName = "eb_account_seq")
	@Column(name = "EB_ACCOUNT_ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "EB_ACCOUNT_BALANCE")
	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}

	public int getCustomerACCId() {
		return customerACCId;
	}

	public void setCustomerACCId(int customerACCId) {
		this.customerACCId = customerACCId;
	}

	/*
	 * @OneToMany(targetEntity = Transaction.class, mappedBy = "account", cascade =
	 * CascadeType.ALL, fetch = FetchType.EAGER) public List<Transaction>
	 * getTransactions() { return transactions; }
	 * 
	 * public void setTransactions(List<Transaction> transactions) {
	 * this.transactions = transactions; }
	 */

}

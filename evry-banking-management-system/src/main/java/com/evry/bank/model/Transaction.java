package com.evry.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "EB_TRANSACTION")
public class Transaction {
		
	private int id;
	private String type;;
	
	
	private Account account;
	
	
	public Transaction() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "eb_transaction_generator")
	@SequenceGenerator(name="eb_transaction_generator", sequenceName = "eb_transaction_seq")
	@Column(name = "EB_TRANSACTION_ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "EB_TRANSACTION_TYPE")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@ManyToOne
	@JoinColumn(name = "EB_TRANSACTION_ACCOUNT_ID")
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}

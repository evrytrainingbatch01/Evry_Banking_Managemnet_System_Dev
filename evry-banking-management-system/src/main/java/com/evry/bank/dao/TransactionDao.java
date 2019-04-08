package com.evry.bank.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.evry.bank.model.Account;
import com.evry.bank.model.Transaction;


@Repository
public class TransactionDao {
	
	@Autowired
	TransactionRepository transactionRepository;
	
	@PersistenceContext
	private EntityManager em;

	public Optional<Transaction> findAllTransactionByCustomerId(int id) {
	    return transactionRepository.findById(id);
		
	}
	
	
	
	
	
}

package com.evry.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evry.bank.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
	
	
}
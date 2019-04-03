package com.evry.bank.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.evry.bank.model.Customer;

/**
 * 
 * @author venkata.kuppili
 *
 */
public class CustomerDao {
	@Autowired
	CustomerRepository customerRepository;

	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	public Optional<Customer> findOne(Integer customerId) {
		return customerRepository.findById(customerId);
	}

	public void delete(Customer customer) {
		customerRepository.delete(customer);
	}
}

package com.evry.bank.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.evry.bank.model.Customer;

/**
 * 
 * @author venkata.kuppili
 *
 */
@Repository
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

	public void delete(int id) {
		customerRepository.deleteById(id);
	}

	public Customer checkLogin(int id, String password) {
		Optional<Customer> customers = customerRepository.findById(id);
		Customer customer = customers.get();
		if (customer.getId() == id && customer.getPassword().equals(password)) {
			System.out.println("User Validated !! " + customer);
			return customer;
		} else {
			System.out.println("User Invalid !!!!");
			return null;
		}

	}

	public boolean resetPassword(int id, String newPwd) {
		Optional<Customer> customers = customerRepository.findById(id);
		boolean flag = false;
		if (customers.isPresent()) {
			Customer customer = customers.get();
			customer.setPassword(newPwd);
			customerRepository.save(customer);
			flag = true;
		}
		return flag;
	}
}

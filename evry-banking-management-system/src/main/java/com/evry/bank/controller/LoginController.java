package com.evry.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.evry.bank.dao.CustomerRepository;
import com.evry.bank.model.Customer;

@RestController
public class LoginController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer login(@RequestBody Customer customer) {
		return customerRepository.findByIdAndPassword(customer);
		
	}

}

/**
 * @author sadiq.ahamad
 */
package com.evry.bank.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.evry.bank.dao.CustomerRepository;
import com.evry.bank.model.Customer;

@RestController
public class LoginController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping("/login/{id}/{password}")
	public boolean login(@PathVariable int id,@PathVariable String password) {
		 
		System.out.println(id +" -> "+password);
		Optional<Customer> a = customerRepository.findById(id);
		 
		 if(a.get().getId()==id && 
				 a.get().getPassword().equals(password)) {
			System.out.println("User Validated !! "+a);
			 return true;
		 }
		 else {
			 System.out.println("User Invalid !!!!");
			 return false;
		 }
		
	}

	@PostMapping("/login")
	public boolean postLogin(@RequestBody Customer input) {
		Optional<Customer> a = customerRepository.findById(input.getId());

		 
		 if(a.get().getId()==input.getId() && 
				 a.get().getPassword().equals(input.getPassword())) {
			System.out.println("User Validated POST !! "+a);
			 return true;
		 }
		 else {
			 System.out.println("User Invalid POST !!!!");
			 return false;
		 }
		
	}
	
}

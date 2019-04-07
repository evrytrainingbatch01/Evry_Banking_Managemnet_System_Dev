/**
 * @author sadiq.ahamad
 */
package com.evry.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evry.bank.model.Customer;
import com.evry.bank.service.CustomerService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LoginController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/login/{id}/{password}")
	public Customer checkLogin(@PathVariable int id, @PathVariable String password) {
		return customerService.checkLogin(id, password);
	}

	@PutMapping("/login/{id}/{newPwd}")
	public boolean resetPassword(@PathVariable int id, @PathVariable String newPwd) {
		return customerService.resetPassword(id, newPwd);
	}
}

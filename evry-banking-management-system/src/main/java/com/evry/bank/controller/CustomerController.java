/**
 *
 @author sadiq.ahamad
 * @author renuka.prasada
 */
package com.evry.bank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.evry.bank.model.Customer;
import com.evry.bank.service.impl.CustomerServiceImpl;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CustomerController {

	@Autowired
	private CustomerServiceImpl customerService;

	public CustomerController() {
		// TODO Auto-generated constructor stub
	}

	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer) {

		// this is adding customer method.here app is taking the object and passing it
		// to service.
		customerService.addCustomer(customer);

		return customer;
	}

	@GetMapping("/getCustomer/{id}")
	public Optional<Customer> getCustomerById(@PathVariable int id) {
		Optional<Customer> customer = customerService.getCusomterById(id);

		return customer;
	}

	@GetMapping("/getAllCustomers")
	public List<Customer> getAllCustomers() {
		List<Customer> allCustomersList = customerService.getAllCustomers();
		return allCustomersList;
	}

	@PutMapping("/updateCustomer/{id}")
	public Customer updateCustomer(@RequestBody Customer customer, @PathVariable int id) {
		Customer updateCustomer = customerService.updateCustomer(id, customer);
		return updateCustomer;

	}

	@DeleteMapping("/deleteCustomer/{id}")
	public void deleteCustomer(@PathVariable int id) {
		customerService.deleteCustomer(id);

	}

	@PostMapping("/login/{customerId}/{password}")
	public Customer checkLogin(@PathVariable int customerId, @PathVariable String password) {
		return customerService.checkLogin(customerId, password);
	}

	@PutMapping("/login/{id}/{newPwd}")
	public boolean resetPassword(@PathVariable int id, @PathVariable String newPwd) {
		return customerService.resetPassword(id, newPwd);
	}
}

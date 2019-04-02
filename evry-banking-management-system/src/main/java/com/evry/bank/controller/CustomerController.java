/**
 * @author sadiq.ahamad
 * @author renuka.prasada
 */
package com.evry.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evry.bank.model.Customer;
import com.evry.bank.service.CustomerService;

@RestController 
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/addCustomer")
	public Customer addCustomer(@ModelAttribute Customer customer) {
		
		//this is adding customer method.here app is taking the object and passing it to service.
		customerService.addCustomer(customer);
		
		return customer;
	}
	
	@GetMapping("/getCustomer")
	public Customer getCustomerById(int id) {
		Customer customer = customerService.getCusomterById(id);
		
		return customer;
	}
	
	@GetMapping("/getAllCustomers")
	public List<Customer> getAllCustomers(){
		List<Customer> allCustomersList = customerService.getAllCustomers();
		return  allCustomersList;
	}
	
	@PutMapping("/updateCustomer")
	public int updateCustomer(@ModelAttribute Customer customer,int id) {
		int updateCustomer = customerService.updateCustomer(id, customer);
		return updateCustomer;
		
	}
	
	@DeleteMapping("/deleteCustomer")
	public int deleteCustomer(int id) {
		int deleteCustomer = customerService.deleteCustomer(id);
		return deleteCustomer;
		
	}

}

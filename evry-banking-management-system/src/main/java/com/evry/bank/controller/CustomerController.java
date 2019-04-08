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
/**
 * This CustomerController is an start-end point of the Customer that means operations which this
 * application wants to do with respect to Customer has to done via this controller class only.
 * 
*@author sadiq.ahamad
* @author renuka.prasada
*/
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CustomerController {

	/**
	 * Here CustomerServiceImpl class is Autowired using DI concept.
	 */
	@Autowired
	private CustomerServiceImpl customerService;

	/**
	 * this is public default constructor.
	 */
	public CustomerController() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * This addCustomer method is used to Add the new customer.
	 * @param customer
	 * @return if the adding of new customer is successful it will return the same object.
	 */

	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer) {

		// this is adding customer method.here app is taking the object and passing it
		// to service.
		customerService.addCustomer(customer);

		return customer;
	}
	
	/**
	 * This getCustomerById method is used to get particular customer.
	 * @param id
	 * @return if that id is exist it will fetch that particular customer.If customer exists-
	 * it will return the Customer object else it will return blank.
	 */

	@GetMapping("/getCustomer/{id}")
	public Optional<Customer> getCustomerById(@PathVariable int id) {
		Optional<Customer> customer = customerService.getCusomterById(id);

		return customer;
	}

	/**
	 * This getAllCustomers method is used to get all customers details.
	 * @return it will return the list of all Customers.
	 */
	@GetMapping("/getAllCustomers")
	public List<Customer> getAllCustomers() {
		List<Customer> allCustomersList = customerService.getAllCustomers();
		return allCustomersList;
	}
	/**
	 * This updateCustomer method is used to update the existing customer details with new details.
	 * @param customer
	 * @param id
	 * @return it will return the Updated customer object as the response.
	 */

	@PutMapping("/updateCustomer/{id}")
	public Customer updateCustomer(@RequestBody Customer customer, @PathVariable int id) {
		Customer updateCustomer = customerService.updateCustomer(id, customer);
		return updateCustomer;

	}
	
	/**
	 * this deleteCustomer is used to delete the particular customer by using customerId.
	 * @param id
	 */

	@DeleteMapping("/deleteCustomer/{id}")
	public void deleteCustomer(@PathVariable int id) {
		customerService.deleteCustomer(id);

	}

	/**
	 * this method checkLogin is used to validate that particular customer is there are not.
	 * @param customerId
	 * @param password
	 * @return if credentials are valid then return that Customer object.
	 */
	@PostMapping("/login/{customerId}/{password}")
	public Customer checkLogin(@PathVariable int customerId, @PathVariable String password) {
		return customerService.checkLogin(customerId, password);
	}
	
	/**
	 * this method resetPassword is used to change the existence password with new password for the-
	 * security purpose.
	 * @param id
	 * @param newPwd
	 * @return and it returns boolean value as the response i.e.,true or false if the password is changed-
	 * successfully then return true else false.
	 */

	@PutMapping("/login/{id}/{newPwd}")
	public boolean resetPassword(@PathVariable int id, @PathVariable String newPwd) {
		return customerService.resetPassword(id, newPwd);
	}
}

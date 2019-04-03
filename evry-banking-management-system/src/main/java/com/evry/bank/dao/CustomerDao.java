/**
 * @author indrajit.maharana
 * @author swaroop.panda
 * @author parthanjaya.nayak
 */
package com.evry.bank.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.evry.bank.model.Customer;

public interface CustomerDao extends CrudRepository<Customer,Integer>{
	
	// Adding the Customer details as per Customer Entity
	public int addCustomer(final Customer customer);

	// Retrieving a single customer details by using CUSTOMER_ID
	public Customer getCusomterById(final int id);

	// Retrieving all the customers with details from the database
	public List<Customer> getAllCustomers();

	// Updating a single customer details by using CUSTOMER_ID
	public int updateCustomer(final int id, final Customer customer);

	// Permanently remove a Customer From databasa
	public int deleteCustomer(final int id);
	
}
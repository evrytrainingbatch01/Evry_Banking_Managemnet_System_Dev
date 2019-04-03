package com.evry.bank.service;

import java.util.List;

import com.evry.bank.model.Customer;

public interface CustomerService {

	/*
	 * this method tells store customerdetails
	 * @return type int
	 */
	public int addCustomer(final Customer customer);

	/*
	 * if we want get perticular customerid so you can using this method
	 * @return type is Customer
	 */
	public Customer getCusomterById(final int id);
	
	/*
	 * here you can get all customer details
	 * this method return customer object
	 */

	//public List<Customer> getAllCustomers();
	
	/*
	 * here you can update customer details 
	 * @return type int
	 */

	public int updateCustomer(final int id, final Customer customer);
	
	/*
	 * delete perticular customer id using this mehtod
	 */

	//public int deleteCustomer(final int id);

}
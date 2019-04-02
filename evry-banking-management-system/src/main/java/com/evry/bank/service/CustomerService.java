package com.evry.bank.service;

import java.util.List;

import com.evry.bank.model.Customer;

public interface CustomerService {

	public int addCustomer(final Customer customer);

	public Customer getCusomterById(final int id);

	public List<Customer> getAllCustomers();

	public int updateCustomer(final int id, final Customer customer);

	public int deleteCustomer(final int id);

}

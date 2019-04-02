package com.evry.bank.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.evry.bank.model.Customer;

public interface CustomerDao extends CrudRepository<Customer,Integer>{
	
	public int addCustomer(final Customer customer);

	public Customer getCusomterById(final int id);

	public List<Customer> getAllCustomers();

	public int updateCustomer(final int id, final Customer customer);

	public int deleteCustomer(final int id);
	

}

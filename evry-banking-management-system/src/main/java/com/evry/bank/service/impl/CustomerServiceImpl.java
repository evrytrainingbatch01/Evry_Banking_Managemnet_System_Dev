package com.evry.bank.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evry.bank.dao.CustomerDao;
import com.evry.bank.model.Customer;
import com.evry.bank.service.CustomerService;

/**
 * this is CustomerService class implmented by customerService interface
 * here perform crud operation of customer
 * @author buddamallappa.gu
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {
	
	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private CustomerDao customerDao;

	@Override
	public Customer addCustomer(Customer customer) {
		return customerDao.save(customer);
	}

	@Override
	public Optional<Customer> getCusomterById(int id) {
		return customerDao.findOne(id);
	}

	/*@Override
	public List<Customer> getAllCustomers() {
		return customerDao.getAllCustomers();
	}*/

	@Override
	public int updateCustomer(int id, Customer customer) {
		return 0;
	}

	/*@Override
	public int deleteCustomer(int id) {
		return customerDao.deleteCustomer(id);
	}
*/
}

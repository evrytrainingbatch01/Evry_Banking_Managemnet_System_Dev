package com.evry.bank.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evry.bank.dao.CustomerDao;
import com.evry.bank.model.Customer;
import com.evry.bank.service.CustomerService;
import com.evry.bank.model.Customer;

/**
 * this is CustomerService class implmented by customerService interface here
 * perform crud operation of customer
 * 
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
		Random rand = new Random();
		Integer number = rand.nextInt(9000000) + 1000000;
		customer.setLoginId(number);
		customer.setPassword(RandomStringUtils.randomAlphanumeric(17).toUpperCase());
		return customerDao.save(customer);
	}

	@Override
	public Optional<Customer> getCusomterById(int id) {
		return customerDao.findOne(id);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerDao.findAll();
	}

	@Override
	public Customer updateCustomer(int id, Customer customer) {
		return customerDao.save(customer);
	}

	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		customerDao.delete(id);
	}

	@Override
	public Customer checkLogin(int id, String password) {

		return customerDao.checkLogin(id, password);
	}

	@Override
	public boolean resetPassword(int id, String newPwd) {
		
		return customerDao.resetPassword(id, newPwd);
	}

}

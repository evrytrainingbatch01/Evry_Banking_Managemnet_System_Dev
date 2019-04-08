package com.evry.bank.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evry.bank.dao.AccountDao;
import com.evry.bank.dao.CustomerDao;
import com.evry.bank.model.Account;
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
	@Autowired
	private AccountDao accountDao;

	@Override
	public Customer addCustomer(Customer customer) {
		boolean flag = false;
		Random rand = new Random();
		Integer number = rand.nextInt(9000000) + 1000000;
		Integer temp = rand.nextInt(9000000) + 1000000;
		customer.setLoginId(number);
		customer.setPassword(RandomStringUtils.randomAlphanumeric(17).toUpperCase());
		customer.setCustomeAccountId(temp);
		Customer cus = customerDao.save(customer);
		if (null != cus && cus.getId() != 0) {
			Account account = new Account();
			// account.setId(temp);
			account.setAccountBalance(new BigDecimal(0));
			account.setCustomerACCId(cus.getCustomeAccountId());
			flag = accountDao.addAccount(account);
		}
		return flag ? cus : null;
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
	public Customer checkLogin(int customerId, String password) {
		return customerDao.checkLogin(customerId,  password);
	}

	@Override
	public boolean resetPassword(int id, String newPwd) {

		return customerDao.resetPassword(id, newPwd);
	}

}

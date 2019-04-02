package com.evry.bank.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.evry.bank.dao.CustomerDao;
import com.evry.bank.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public int addCustomer(Customer customer) {
		// TODO Auto-generated method stub
				return 0;
	}

	@Override
	public Customer getCusomterById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateCustomer(int id, Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCustomer(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}

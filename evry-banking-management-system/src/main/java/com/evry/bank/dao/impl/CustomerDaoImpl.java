package com.evry.bank.dao.impl;

import java.util.List;
import java.util.Optional;

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
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Customer arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Customer> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean existsById(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Customer> findAllById(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Customer> findById(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Customer> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Customer> Iterable<S> saveAll(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

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

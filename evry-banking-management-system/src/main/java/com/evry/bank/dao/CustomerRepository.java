/**
 * @author indrajit.maharana
 * @author swaroop.panda
 * @author parthanjaya.nayak
 */
package com.evry.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evry.bank.model.Customer;

/**
 * 
 * @author venkata.kuppili
 *
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	

	String findByPassword(String password);

}
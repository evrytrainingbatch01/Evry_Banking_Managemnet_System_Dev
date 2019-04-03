package com.evry.bank.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Description;

@Entity
@Table(name = "eb_customer")
@Description("This is customer entity")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EB_CUSTOMER_ID")
	private int id;

	@Column(name = "EB_CUSTOMER_NAME")
	private String name;

	@Column(name = "EB_CUSTOMER_EMAILID")
	private String emailId;

	@Column(name = "EB_CUSTOMER_DOB")
	private Date dateOfBirth;

	@Column(name = "EB_CUSTOMER_ADDRESS")
	private String address;

	@Column(name = "EB_CUSTOMER_CITY")
	private String city;

	@Column(name = "EB_CUSTOMER_COUNTRY")
	private String country;

	@Column(name = "EB_CUSTOMER_MOBILENO")
	private int mobileNo;

	@Column(name = "EB_CUSTOMER_LOGIN_ID")
	private int loginId;

	@Column(name = "EB_CUSTOMER_PASSWORD")
	private String password;

	@Column(name = "EB_CUSTOMER_USERTYPE")
	private int userType;

	@Column(name = "EB_CUSTOMER_ACCOUNTSTATUS")
	private int accountStatus;

	@Column(name = "EB_CUSTOMER_LASTUPDATED")
	private Date lastUpdated;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public int getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(int accountStatus) {
		this.accountStatus = accountStatus;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

}

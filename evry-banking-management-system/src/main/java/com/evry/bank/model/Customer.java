package com.evry.bank.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="eb_customer")
public class Customer {

	@Id
	@Column(name = "EB_CUSTOMER_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	private int id;
	
	@Column(name = "EB_CUSTOMER_NAME")
	private String userName;
	
	@Column(name = "EB_CUSTOMER_EMAILID")
	private String email;
	
	@Column(name = "EB_CUSTOMER_DOB")
	private LocalDate dateOfBirth;
	
	@Column(name = "EB_CUSTOMER_CITY")
	private String city;
	
	@Column(name = "EB_CUSTOMER_COUNTRY")
	private String country;
	
	@Column(name = "EB_CUSTOMER_MOBILENO")
	private long mobile;
	
	@Column(name = "EB_CUSTOMER_LOGINID")
	private long customer_id;
	
	@Column(name = "EB_CUSTOMER_PASSWORD")
	private String password;
	
	@Column(name = "EB_CUSTOMER_USERTYPE")
	private int userType;
	
	@Column(name = "EB_CUSTOMER_LASTUPDATED")
	private LocalDate lastUpdate;
	
	@Column(name = "EB_CUSTOMER_ACCOUNTSTATUS")
	private int accountStatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
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

	public LocalDate getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(LocalDate lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public int getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(int accountStatus) {
		this.accountStatus = accountStatus;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", userName=" + userName + ", email=" + email + ", dateOfBirth=" + dateOfBirth
				+ ", city=" + city + ", country=" + country + ", mobile=" + mobile + ", customer_id=" + customer_id
				+ ", password=" + password + ", userType=" + userType + ", lastUpdate=" + lastUpdate
				+ ", accountStatus=" + accountStatus + "]";
	}

}

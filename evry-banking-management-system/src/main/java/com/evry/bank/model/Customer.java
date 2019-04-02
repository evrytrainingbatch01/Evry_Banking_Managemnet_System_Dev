package com.evry.bank.model;

import java.time.LocalDate;

public class Customer {

	private int id;
	private String userName;
	private String email;
	private LocalDate dateOfBirth;
	private String city;
	private String country;
	private long mobile;
	private long customer_id;
	private String password;
	private int userType;
	private LocalDate lastUpdate;
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

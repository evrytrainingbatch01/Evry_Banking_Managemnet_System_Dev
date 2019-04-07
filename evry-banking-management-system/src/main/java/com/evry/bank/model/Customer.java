package com.evry.bank.model;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "EB_CUSTOMER")
public class Customer {

	private int id;
	private String name;
	private String emailId;
	private Date dateOfBirth;
	private String address;
	private String city;
	private String country;
	private long mobileNo;
	private Integer loginId;
	private String password;
	private int userType;
	private int accountStatus;
	private Date lastUpdated;
	@Column(name = "EB_CUSTOMER_ACCOUNT_ID")
	private int customeAccountId;

	@OneToOne
	private Account account;

	public Customer() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "eb_customer_generator")
	@SequenceGenerator(name = "eb_customer_generator", sequenceName = "eb_customer_seq")
	@Column(name = "EB_CUSTOMER_ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomeAccountId() {
		return customeAccountId;
	}

	public void setCustomeAccountId(int customeAccountId) {
		this.customeAccountId = customeAccountId;
	}

	@Column(name = "EB_CUSTOMER_NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "EB_CUSTOMER_EMAILID")
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(name = "EB_CUSTOMER_DOB")
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Column(name = "EB_CUSTOMER_ADDRESS")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "EB_CUSTOMER_CITY")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "EB_CUSTOMER_COUNTRY")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "EB_CUSTOMER_MOBILENO")
	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Column(name = "EB_CUSTOMER_LOGINID")
	public Integer getLoginId() {
		return loginId;
	}

	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}

	@Column(name = "EB_CUSTOMER_PASSWORD")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "EB_CUSTOMER_USERTYPE")
	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	@Column(name = "EB_CUSTOMER_ACCOUNTSTATUS")
	public int getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(int accountStatus) {
		this.accountStatus = accountStatus;
	}

	@Column(name = "EB_CUSTOMER_LASTUPDATED")
	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	@Access(AccessType.PROPERTY)
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "EB_CUSTOMER_ACCOUNT_ID")
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", emailId=" + emailId + ", dateOfBirth=" + dateOfBirth
				+ ", address=" + address + ", city=" + city + ", country=" + country + ", mobileNo=" + mobileNo
				+ ", loginId=" + loginId + ", password=" + password + ", userType=" + userType + ", accountStatus="
				+ accountStatus + ", lastUpdated=" + lastUpdated + ", account=" + account + "]";
	}

}

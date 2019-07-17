package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {
	
	//This class needs to have:
	//An id
	//An Account Number
	//A First Name
	//A last Name
	private static Integer count;
	@Id
	@GeneratedValue
	private Integer accountId;
	private String firstName;
	private String lastName;
	private String accountNo;
	
	public Account() {
		
	}
	

	public Account(String firstName, String lastName, String accountNo) {
		// TODO Auto-generated constructor stub
		this.accountId=++count;
		this.firstName=firstName;
		this.lastName=lastName;
		this.accountNo=accountNo;
	}


	public static Integer getCount() {
		return count;
	}


	public static void setCount(Integer count) {
		Account.count = count;
	}


	public Integer getAccountId() {
		return accountId;
	}


	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	
}

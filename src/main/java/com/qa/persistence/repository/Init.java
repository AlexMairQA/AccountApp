package com.qa.persistence.repository;

import com.qa.util.JSONUtil;

public class Init {

	public Init() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountMapRepository accounts= new AccountMapRepository();
		accounts.createAccount(1, "{\"firstName\":\"Al\",\"lastName\": \"Murray\", \"accountNo\": \"12345\"}");
		accounts.createAccount(2, "{'firstName' : 'Al', 'lastName' : 'Pachino', 'accountNo' : '678910'}");
		
		//System.out.println(accounts.get(1));

	}

}

package com.qa.persistence.repository;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


import com.qa.persistence.domain.Account;
import com.qa.util.JSONUtil;

public class AccountMapRepository {
	
	Map<Integer, Account> accountMap = new HashMap<Integer, Account>();
	
	//You must provide concrete implementation for each of these methods
	//do not change the method signature
	//THINK - if the parameter is a String, or the return type is a String
	//How can I convert to a String from an Object?
	//What utility methods do I have available?
	
	//You must complete this section using TDD
	//You can use the suggested tests or build your own.
	
	public AccountMapRepository() {
		
	}

	public String getAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean createAccount(Integer key, String account) {
		JSONUtil reader= new JSONUtil();
		Account JAccount=null;

			JAccount =  reader.getObjectForJSON(account, Account.class);
		
		if(!accountMap.containsKey(key)) {
		accountMap.put(key, JAccount);
		// TODO Auto-generated method stub
	
		return true;
		}
		else return false;
	}

	public Boolean deleteAccount(String accountNumber, Map<Integer, Object> accountMap) {
		// TODO Auto-generated method stub
		Integer accountKey=null;
		for(Entry<Integer, Object>entry: accountMap.entrySet()) {
			if(((Account) entry.getValue()).getAccountNo().equals(accountNumber)) {
				accountKey=entry.getKey();
			}
		}
		accountMap.remove(accountKey);
		return true;
	}

	public String updateAccount(String accountNumber, String account) {
		// TODO Auto-generated method stub
		return null;
	}

}

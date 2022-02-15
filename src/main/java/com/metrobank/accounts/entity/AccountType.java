package com.metrobank.accounts.entity;

import java.util.Map;

public enum AccountType {

	SAVINGS("Savings"),
	CHECKING("Checking");

	private String accountType;

	AccountType(String accountType){
		this.accountType = accountType;
	}

	public String getAccountType() {
		return this.accountType;
    }

//	public static Map<String, Boolean> getAccountType(){
//		Map<String, Boolean> map = new HashMap<>();
//		for(AccountType accountType : AccountType.values()){
//			map.put(accountType.getAccountType(), true);
//		}
//		return map;
//	}
	}

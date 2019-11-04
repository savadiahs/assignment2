package com.infoud1.BankingSystem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {

	public static Map<Integer,User> user = new HashMap<Integer,User>();
	public static Map<Integer, BankAccount> bankAccounts = new HashMap<Integer, BankAccount>();
	
	public static Map<Integer, User> getUser() {
		return user;
	}
	public static void setUser(Map<Integer, User> user) {
		Storage.user = user;
	}
	public static Map<Integer, BankAccount> getBankAccounts() {
		return bankAccounts;
	}
	public static void setBankAccounts(Map<Integer, BankAccount> bankAccounts) {
		Storage.bankAccounts = bankAccounts;
	}
	
	


}

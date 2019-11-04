package com.infoud1.BankingSystem;

import java.util.Collection;


public class Bank {

	public void addAccount(BankAccount bankAccount) {
		System.out.println("\nHello " +", You had Successfully Registered\n");
		Storage.bankAccounts.put(bankAccount.getId(), bankAccount);
	}

	public void deleteAccount(long Id) {
		System.out.println("\nHello " +" ,Your Account is Permanantly Deleted\n");
		Storage.bankAccounts.remove(Id);
	}

	public BankAccount getAccount(long i) {
		return Storage.bankAccounts.get(i);
	}

	public Collection<BankAccount> getAccounts() {
		return Storage.bankAccounts.values();
	}

	@Override
	public String toString() {
		return "Bank [getAccounts()=" + getAccounts() + "]\n";
	}
}

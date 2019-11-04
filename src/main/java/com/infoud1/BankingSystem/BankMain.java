package com.infoud1.BankingSystem;

import java.util.ArrayList;
import java.util.List;

public class BankMain {

	public static void main(String args[]) {

		User u1 = new User("HARSH", 111);
		System.out.println(u1);
		System.out.println("\n" + u1.getUserName() + " is Tring To Create a Account\n");
		BankAccount b1 = new BankAccount(u1);
		System.out.println(b1);
		Bank bank = new Bank();
		bank.addAccount(b1);
		System.out.println(bank);
		b1.deposite(5000);
		b1.getpreviousTransactions();
		b1.withdraw(3000);
		b1.getpreviousTransactions();
		System.out.print("\n" + u1.getUserName() + " with Customer ID " + u1.getUserAccNo() + " has a Balance of: ");
		System.out.println(b1.getBalance() + "\n\n\n");

		
		
		User u2 = new User("RUSHIN", 222);
		System.out.println(u2);
		System.out.println("\n" + u2.getUserName() + " is Tring To Create a Account\n");
		BankAccount b2 = new BankAccount(u2);
		System.out.println(b2);
		bank.addAccount(b2);
		System.out.println(bank);
		b2.deposite(500);
		b2.getpreviousTransactions();
		b2.withdraw(400);
		b2.getpreviousTransactions();
		System.out.print("\n" + u2.getUserName() + " with Customer ID " + u2.getUserAccNo() + " has a Balance of: ");
		System.out.println(b2.getBalance() + "\n");

		b1.transfer(100, b2);
		System.out.println(b1.getBalance() + "\n\n\n");
		System.out.println(b2.getBalance() + "\n\n\n");

		
		
		
		User u3 = new User("HEMANI", 333);
		System.out.println(u3);
		System.out.println("\n" + u3.getUserName() + " is Tring To Create a Account\n");
		SavingAccount b3 = new SavingAccount(333,"HEMANI",5000,10,u3);
		System.out.println(b3);
		bank.addAccount(b3);
		System.out.println(bank);
		b3.deposite(500);
		b3.getpreviousTransactions();
		b3.addInterest();
		b3.getpreviousTransactions();
		b3.withdraw(400);
		b3.getpreviousTransactions();
		System.out.print("\n" + u3.getUserName() + " with Customer ID " + u3.getUserAccNo() + " has a Balance of: ");
		System.out.println(b3.getBalance() + "\n");
		
		User u4 = new User("Bharat", 444);
		System.out.println(u4);
		System.out.println("\n" + u4.getUserName() + " is Tring To Create a Account\n");
		CurrentAccount b4 = new CurrentAccount(444,"Bharat",50000,100,u4);
		System.out.println(b4);
		bank.addAccount(b4);
		System.out.println(bank);
		b4.deposite(500);
		b4.getpreviousTransactions();
		b4.withdraw(200);
		b4.getpreviousTransactions();
		//b4.withdraw(400);
	//	b4.getpreviousTransactions();
		System.out.print("\n" + u4.getUserName() + " with Customer ID " + u4.getUserAccNo() + " has a Balance of: ");
		System.out.println(b4.getBalance() + "\n");
		
		bank.deleteAccount(333);
		System.out.println(bank);
		bank.getAccount(1);
		System.out.println(bank);
		
		
		System.out.println(bank.getAccounts());
		
		
		System.out.println("----------------REPORT-----------------");
		Storage.bankAccounts.put(1, b1);
		Storage.bankAccounts.put(2, b2);
		Storage.bankAccounts.put(3, b3);

		Storage.user.put(1, u1);
		Storage.user.put(2, u2);
		Storage.user.put(3, u3);

		
		System.out.println(Storage.getBankAccounts());
		System.out.println(Storage.getUser());

//		Account cust1 = new Account("HARSH", "111");
//		cust1.deposite(500);
//		cust1.getpreviousTransactions();
//
//		// list add
//		account.add(cust1);
//
//		Account cust2 = new Account("RUSHIN", "222");
//		cust2.deposite(100);
//
//		// list add
//		account.add(cust2);
//
//		System.out
//				.print(cust1.getCustomerName() + " with Customer ID " + cust1.getCustomerId() + " has a Balance of: ");
//		System.out.println(cust1.getBalance());
//
//		cust2.getpreviousTransactions();
//
//		System.out
//				.print(cust2.getCustomerName() + " with Customer ID " + cust2.getCustomerId() + " has a Balance of: ");
//		System.out.println(cust2.getBalance());
//
//		cust2.withdraw(500);
//
//		cust1.transfer(400, cust2);
//
//		System.out
//				.print(cust1.getCustomerName() + " with Customer ID " + cust1.getCustomerId() + " has a Balance of: ");
//		System.out.println(cust1.getBalance());
//
//		System.out
//				.print(cust2.getCustomerName() + " with Customer ID " + cust2.getCustomerId() + " has a Balance of: ");
//		System.out.println(cust2.getBalance());
//
//		Account cust3 = new Account("HIMANI", "333");
//		cust3.deposite(2000);
//		cust3.getpreviousTransactions();
//		account.add(cust3);
//
//		System.out
//				.print(cust3.getCustomerName() + " with Customer ID " + cust3.getCustomerId() + " has a Balance of: ");
//		System.out.println(cust3.getBalance());
//
//		Account cust4 = new Account("RAVEENA", "444");
//		cust4.deposite(4000);
//		cust4.getpreviousTransactions();
//		cust4.withdraw(4000);
//		cust4.getpreviousTransactions();
//		account.add(cust4);
//
//		System.out
//				.print(cust4.getCustomerName() + " with Customer ID " + cust4.getCustomerId() + " has a Balance of: ");
//		System.out.println(cust4.getBalance());
//
//		Account cust5 = new Account("PRAJAKTA", "555");
//		cust5.deposite(6000);
//		cust5.getpreviousTransactions();
//		account.add(cust5);
//
//		System.out
//				.print(cust5.getCustomerName() + " with Customer ID " + cust5.getCustomerId() + " has a Balance of: ");
//		System.out.println(cust5.getBalance());
//
//		System.out.println("\n						REPORT\n");
//		for (Account account2 : account) {
//			System.out.println(account2);
//		}
	}
}
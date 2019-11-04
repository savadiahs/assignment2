package com.infoud1.BankingSystem;

public class CurrentAccount extends BankAccount {

		private double overdrafLimit;
		private String accountType;
		
		public CurrentAccount(int accountNo, String cusName, double balance,double overdraftlimit,User user) {
		super(user);
		this.overdrafLimit=overdraftlimit;
		this.accountType = "Current";
		}
		
		public double getOverdrafLimit() {
			return overdrafLimit;
		}

		public void setOverdrafLimit(double overdrafLimit) {
			this.overdrafLimit = overdrafLimit;
		}

		public String getAccountType() {
			return accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}

		public void withdraw(double amount) {
		if(getBalance() + overdrafLimit < amount) {
		System.out.print("Cannot be done less than overdraft "+overdrafLimit);
		}
		else {
		super.withdraw(amount);
		}
		System.out.println(super.getBalance());
		}
		public String toString()
		{
		return super.toString()+ overdrafLimit;
		}
		}
package com.infoud1.BankingSystem;

public class SavingAccount extends BankAccount {

		private double interestRate=0;
		private String accountType;
		
		public SavingAccount(int accountNo, String cusName, double balance,double interestRate,User user) {
		super(user);
		this.interestRate = interestRate;
		this.accountType = "Saving";
		}

		public double getInterestRate() {
			return interestRate;
		}

		public void setInterestRate(double interestRate) {
			this.interestRate = interestRate;
		}


		public String getAccountType() {
			return accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}


		public void addInterest() {
		double interest = getBalance() * interestRate / 100;
		deposite(interest);
		System.out.println("As per Saving Account Address Interest is "+interest);
		}
		}


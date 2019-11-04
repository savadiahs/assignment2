package com.infoud1.BankingSystem;

public class BankAccount {

	private static int counter = 1;
	private int id = counter++;
	private double balance = 0;
	private double previousTransactions;

	private User user;

	public static long getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		BankAccount.counter = counter;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (id ^ (id >>> 32));
		temp = Double.doubleToLongBits(previousTransactions);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(previousTransactions) != Double.doubleToLongBits(other.previousTransactions))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", balance=" + balance + ", previousTransactions=" + previousTransactions
				+ "]";
	}

	public BankAccount(User user) {
		this.user = user;
	}

	public double deposite(double amount) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransactions = amount;
		}
		return balance;
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
			previousTransactions = -amount;
		} else
			System.out.println("Transaction Cancelled due to Insufficient Funds");
	}

	public void getpreviousTransactions() {
		if (previousTransactions >= 0) {
			System.out.println("Deposited: " + previousTransactions);
		} else if (previousTransactions < 0) {
			System.out.println("\nWithdrawn: " + Math.abs(previousTransactions));
		} else {
			System.out.println("No Transaction Occured");
		}
	}

	public void transfer(double amount, BankAccount otherAccount) {
		otherAccount.deposite(amount);
		balance = balance - amount;
	}
}
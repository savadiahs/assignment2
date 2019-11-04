package com.infoud1.BankingSystem;

public class User {

	private  String userName;
	private  int userAccNo;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAccNo() {
		return userAccNo;
	}

	public void setUserAccNo(int userAccNo) {
		this.userAccNo = userAccNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (userAccNo ^ (userAccNo >>> 32));
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
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
		User other = (User) obj;
		if (userAccNo != other.userAccNo)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", userAccNo=" + userAccNo + "]";
	}

	public User(String userName, int userAccNo) {
		super();
		this.userName = userName;
		this.userAccNo = userAccNo;
	}
	
	public User() {
		
	}
}
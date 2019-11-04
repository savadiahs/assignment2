package com.infoud1.BankingSystem;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class BankAccountTest {
	
	@Test
	public void testDeposite() {
		User u = new User();
		BankAccount b = new BankAccount(u);
		double ans = b.deposite(500);
		Assert.assertEquals(500, ans, 0);
		
	}

}

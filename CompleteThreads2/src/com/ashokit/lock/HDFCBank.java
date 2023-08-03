package com.ashokit.lock;

public class HDFCBank {
	
	static double balance=7000;
	
	public static synchronized void withdraw(double amountTobeWithdrawn) {
		if(balance>=amountTobeWithdrawn) {
			balance=balance-amountTobeWithdrawn;
		}
	}
	
	public  static synchronized void deposit(double amountTobeDeposited) {
		
			balance=balance+amountTobeDeposited;
		
	}

}

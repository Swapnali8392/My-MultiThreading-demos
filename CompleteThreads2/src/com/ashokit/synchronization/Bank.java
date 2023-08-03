package com.ashokit.synchronization;

public class Bank {
	
	public double balance=10000;
	
	
	public synchronized void deposit(double amoutToBeDeposited) {
		balance=balance+amoutToBeDeposited;
		System.out.println(balance);
	}
	
	public synchronized void sendMoney(double amoutToBeSent) {
		//var x="dsdsad";
		balance=balance-amoutToBeSent;
System.out.println(balance);
	}

}

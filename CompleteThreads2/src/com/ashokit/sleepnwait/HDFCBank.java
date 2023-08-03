package com.ashokit.sleepnwait;

public class HDFCBank {
	
	double balance;
	
	public  synchronized void withdraw(double amountTobeWithdrawn) throws InterruptedException {
		if(amountTobeWithdrawn>balance) {
			System.out.println("In sufficient funds");
			wait();
		}
		if(balance>=amountTobeWithdrawn) {
			balance=balance-amountTobeWithdrawn;
		}
	}
	
	public  synchronized void payElectricityBill(double billPayAmt) throws InterruptedException {
		if(billPayAmt>balance) {
			System.out.println("In sufficient funds");
			wait();
		}
		if(balance>=billPayAmt) {
			balance=balance-billPayAmt;
		}
	}
	
	public   synchronized void deposit(double amountTobeDeposited) {
		
			balance=balance+amountTobeDeposited;
			notifyAll();
		
	}

}

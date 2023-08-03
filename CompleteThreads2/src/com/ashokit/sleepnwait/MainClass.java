package com.ashokit.sleepnwait;

public class MainClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		HDFCBank karthikAccnt= new HDFCBank();
		karthikAccnt.balance=7000;
		HDFCBank venkatAccnt= new HDFCBank();
		venkatAccnt.balance=8000;
		ATMThread ATM= new ATMThread(karthikAccnt, "ATM");
		GooglePay googlePay= new GooglePay(karthikAccnt, "GooglePay");
		PhonePe phonePe= new PhonePe(karthikAccnt, "PhonePay");
		
		ATM.start();
		
		googlePay.start();
		
		phonePe.start();
		
		
	}

}

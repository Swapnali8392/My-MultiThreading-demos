package com.ashokit.lock;

public class MainClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		HDFCBank karthikAccnt= new HDFCBank();
		//karthikAccnt.balance=7000;
		HDFCBank venkatAccnt= new HDFCBank();
		//venkatAccnt.balance=17000;
		ATMThread ATM= new ATMThread(karthikAccnt, "ATM");
		GooglePay googlePay= new GooglePay(venkatAccnt, "GooglePay");
		
		ATM.start();
		ATM.join();
		googlePay.start();
		
		
	}

}

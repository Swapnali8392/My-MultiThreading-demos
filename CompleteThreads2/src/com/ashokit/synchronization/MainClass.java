package com.ashokit.synchronization;

public class MainClass {
	
	public static void main(String[] args) {
		Bank karthikAccount=new Bank();
		Bank krishnaAccount=new Bank();
		ATMThread ATM= new ATMThread(karthikAccount, "ATM");
		GpayThread GPAY= new GpayThread(karthikAccount, "GPAY");
		
		ATM.start();
		GPAY.start();
		
	}

}

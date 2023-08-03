package com.ashokit.synchronization;

public class ATMThread extends Thread{
	
	Bank obj=null;
	ATMThread(Bank obj,String threadName){
		super(threadName);
		this.obj=obj;
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub		
		obj.deposit(3000);
	}

}

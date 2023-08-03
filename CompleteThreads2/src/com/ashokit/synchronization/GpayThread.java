package com.ashokit.synchronization;

public class GpayThread extends Thread{
	
	Bank obj=null;
	GpayThread(Bank obj,String threadName){
		super(threadName);
		this.obj=obj;
		
	}
	@Override
	public void run() {	
		obj.sendMoney(3000);
	}

}

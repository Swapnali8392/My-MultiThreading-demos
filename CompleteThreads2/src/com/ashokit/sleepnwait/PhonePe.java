package com.ashokit.sleepnwait;

public class PhonePe extends Thread{
	HDFCBank b=null;
	PhonePe(HDFCBank b,String str){
		super(str);
		this.b=b;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//HDFCBank b= new HDFCBank();
		try {
			b.payElectricityBill(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

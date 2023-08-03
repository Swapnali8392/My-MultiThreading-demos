package com.ashokit.lock;

public class GooglePay extends Thread{
	HDFCBank b=null;
	GooglePay(HDFCBank b,String str){
		super(str);
		this.b=b;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//HDFCBank b= new HDFCBank();
		//b.deposit(10000);
		HDFCBank.deposit(10000);
	}

}

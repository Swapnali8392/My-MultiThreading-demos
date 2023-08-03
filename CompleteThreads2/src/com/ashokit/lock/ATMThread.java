package com.ashokit.lock;

public class ATMThread extends Thread{
	HDFCBank b=null;
	ATMThread(HDFCBank b,String str){
		super(str);
		this.b=b;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//HDFCBank b= new HDFCBank();
	//	b.withdraw(5000);
		HDFCBank.withdraw(5000);
	}

}

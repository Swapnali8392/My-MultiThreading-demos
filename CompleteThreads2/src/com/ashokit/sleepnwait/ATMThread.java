package com.ashokit.sleepnwait;

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
	try {
		b.withdraw(8000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}

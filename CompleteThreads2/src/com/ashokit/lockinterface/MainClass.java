package com.ashokit.lockinterface;

public class MainClass {

	public static void main(String[] args) {
		AClass a=new AClass();
		Thread1 t1=new Thread1(a);
		Thread2 t2=new Thread2(a);
		Thread3 t3=new Thread3(a);
		Thread4 t4=new Thread4(a);
		
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t4.setName("t4");
	
		t1.start();
		t2.start();	// t2 waiting for t1 to release lock
		t3.start(); // 
		t4.start();
		
				
	
	}

}

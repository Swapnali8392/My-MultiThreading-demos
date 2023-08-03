package com.ashokit.deadlock;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object obj1=new Object();
		Object obj2=new Object();
		
		Thread1 t1=new Thread1(obj1, obj2);
		Thread2 t2=new Thread2(obj1, obj2);

		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();
		t2.start();
	}

}

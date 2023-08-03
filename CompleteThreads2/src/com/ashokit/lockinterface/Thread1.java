package com.ashokit.lockinterface;

public class Thread1 extends Thread {

	AClass A;

	public Thread1(AClass a) {
		super();
		A = a;
	}
	
	public void run(){
		System.out.println(Thread.currentThread().getName());
	A.m1();	
	}
	
}

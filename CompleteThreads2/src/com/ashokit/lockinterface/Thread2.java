package com.ashokit.lockinterface;

public class Thread2 extends Thread {
	AClass A;
	public Thread2(AClass a) {
	
		A = a;
	}
		public void run() {

			System.out.println(Thread.currentThread().getName());
			A.m2();
	}
}

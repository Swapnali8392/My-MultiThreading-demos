package com.ashokit.lockinterface;

public class Thread4 extends Thread {
	AClass A;
	public Thread4(AClass a) {
	
		A = a;
	}
		public void run() {

			System.out.println(Thread.currentThread().getName());
			A.m4();
	}
}

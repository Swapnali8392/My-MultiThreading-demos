package com.ashokit.lockinterface;

public class Thread3 extends Thread {
	AClass A;
	public Thread3(AClass a) {
	
		A = a;
	}
		public void run() {

			System.out.println(Thread.currentThread().getName());
			A.m3();
	}
}

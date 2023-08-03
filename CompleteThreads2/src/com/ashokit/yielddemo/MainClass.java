package com.ashokit.yielddemo;

public class MainClass {

	public static void main(String[] args) {
		
		Thread t1=new MyThread("T1",Thread.NORM_PRIORITY);
		Thread t2=new MyThread("T2",Thread.MAX_PRIORITY);
		Thread t3=new MyThread("T3",Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}
}

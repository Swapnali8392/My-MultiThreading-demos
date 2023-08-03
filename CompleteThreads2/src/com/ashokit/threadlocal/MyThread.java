package com.ashokit.threadlocal;

public class MyThread implements Runnable {

	ThreadLocal<Integer> tl=new ThreadLocal<>();
	@Override
	public void run() {
		//int x=10;
		tl.set(50);
		show();          // show(x)
		display(); 			// display(x)
		System.out.println("run " + tl.get());
	}

	public void show() {
		tl.set(100);
		System.out.println("show " + tl.get());
	}
	
	public void display() {
		tl.set(150);
		System.out.println("display " + tl.get());		
	}
}

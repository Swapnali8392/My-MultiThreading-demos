package com.ashokit.joincountdownlatch;

public class JoinExample {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1=new ThreadEx();
		Thread t2=new ThreadEx();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("t1 and t2 joined");
		
	}
}

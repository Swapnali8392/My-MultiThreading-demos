package com.ashokit.yielddemo;

public class MyThread extends Thread{

	public MyThread(String name, int priority) {
		super(name);
		setPriority(priority);
	}
	
	@Override
	public void run() {
	
		for(int i=0;i<5;i++) {
			System.out.println(getName() + " : " + i);
			if(getName().equals("T1") && i==3) {
				System.out.println("yielding i value is " + i);
				Thread.yield();
			}
		}
		
		
	}
}

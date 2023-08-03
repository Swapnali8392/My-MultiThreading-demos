package com.ashokit.threads;

public class ThreadExample1 extends Thread{

	//Extending Thread class
	ThreadExample1(String threadName){
		super(threadName);
	}
	
	public static void main(String[] args) {
		ThreadExample1 t= new ThreadExample1("T1");
		ThreadExample1 t1= new ThreadExample1("T2");
		//t is termed as Thread Object
		t.start();//start will creat ethe independent path of execution
		t1.start();
		//Inde
		t.run();
		t.display();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("coferrr");
	}
	
	public void display() {
		
	}
}

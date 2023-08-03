package com.ashokit.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ThreadExample2 implements Runnable{

	@Override
	public void run() {//Running
		System.out.println("run method");
		
	}//Dead
	public void run(String s) {//Running
		int i=20;
		int x=19+i;
		
	}
	
	public void display(List l) {
		System.out.println("run method");
	}
	
	public void display(String s) {
		int i=20;
		int x=19+i;
	}
	
	public static void main(String[] args) {
		//Creating Thread using Runnable interface
		ThreadExample2 t= new ThreadExample2();
		t.display(new ArrayList<>());
		t.display(new Vector<>());
		//Thread is platform dependent
		Thread t1= new Thread(t);
		Thread t2= new Thread(new ThreadExample2());//New
		t1.start();//Running pool-Operating system
		t2.start();
		
		t1.start();
		//t.display(null);
		//We cannot re use the Thread
		//Thread Pool -> Executor Framework
		t1.run();
		//Thread pool- 3
		/*
		 * t1 - 43 t2-2 t3 -3
		 */
		/*
		 * for (int i = 0; i < 100000; i++) { Thread t3= new Thread(new
		 * ThreadExample2());//New t3.start(); }
		 */
	}

}

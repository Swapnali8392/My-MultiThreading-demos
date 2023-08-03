package com.ashokit.threads;

public class ThreadExample extends Thread {
	
	//By extending thread class
	//By Implementing Runnable interface
	//By implementing callable interface
	
	public static void main(String[] args) {
		ThreadExample t= new ThreadExample();
		t.start();
	}
	
	@Override
	public void run() {
		System.out.println("Run method");
		//File
		//Pdf
		//Get the data from DB
		//Sorting
	}

}

package com.ashokit.lock;

public class ThreadCreation extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		//className refVariable= new className();
		ThreadCreation t= new ThreadCreation();
		t.start();
	}

}

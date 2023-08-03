package com.ashokit.semaphore;

public class WithoutSemaphore {
	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			Thread t=new Thread(new ThreadOne());
			t.start();
		}
	}
}

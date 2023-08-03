package com.ashokit.semaphore;

import java.util.concurrent.Semaphore;

public class WithSemaphore {
	public static void main(String[] args) {
		Semaphore s=new Semaphore(2);
		for(int i=0;i<5;i++) {
			Thread t=new Thread(new ThreadTwo(i,s));
			t.start();
		}
	}
}
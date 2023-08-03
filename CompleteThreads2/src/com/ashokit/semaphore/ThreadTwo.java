package com.ashokit.semaphore;

import java.util.concurrent.Semaphore;

public class ThreadTwo implements Runnable {
 int i;
 Semaphore s;
 
 public ThreadTwo(int i,Semaphore s) {
	 this.i=i;
	 this.s=s;
 }
  
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + " started run ");
		try {
			s.acquire();
			System.out.println(Thread.currentThread().getName() + " Semaphore acquired ");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.release();
		System.out.println(Thread.currentThread().getName() + " released semaphore ");
		
		System.out.println(Thread.currentThread().getName() + " completed run ");

	}

}

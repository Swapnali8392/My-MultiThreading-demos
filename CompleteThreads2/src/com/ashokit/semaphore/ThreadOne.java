package com.ashokit.semaphore;

public class ThreadOne implements Runnable {
 int i;
 
// public ThreadOne(int i) {
//	 this.i=i;
//	 System.out.println(i + " " + this.hashCode());
// }

	@Override
	public void run() {
		System.out.println(this.hashCode());
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + " started run ");
		synchronized (this) {
			
			System.out.println(Thread.currentThread().getName() + " In ynchronized block  ");
		}
		System.out.println(Thread.currentThread().getName() + " completed run ");

	}

}

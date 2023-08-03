package com.ashokit.deadlock;

public class Thread1 extends Thread {

	Object obj1,obj2;
	Thread1(Object obj1,Object obj2){
		this.obj1=obj1;
		this.obj2=obj2;
	}
	public void run() {

		System.out.println("thread1 run");
		synchronized (obj1) {
			System.out.println("thread1 acquired lock on obj1");
			try {
				System.out.println("thread1 sleeping");
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				System.out.println("Interrupted exception");		
			}
			System.out.println("thread1 waiting for obj2");
		
		synchronized (obj2) {
			System.out.println("thread1 acquired lock on obj2");
			try {
				System.out.println("thread1 sleeping");
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				System.out.println("Interrupted exception");		
			}
			
		}
		}
		System.out.println("thread1 execution complete");
	}
}

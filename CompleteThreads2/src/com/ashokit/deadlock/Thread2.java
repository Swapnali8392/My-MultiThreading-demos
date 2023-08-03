package com.ashokit.deadlock;

public class Thread2 extends Thread {

	Object obj1, obj2;

	Thread2(Object obj1, Object obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public void run() {

		System.out.println("thread2 run");
		synchronized (obj2) { // change to obj1 to avoid deadlock
			System.out.println("thread2 acquired lock on obj2");
			try {

				System.out.println("thread2 sleeping");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Interrupted exception");
			}
			System.out.println("thread2 waiting for obj1");
			synchronized (obj1) { // change to obj2 to avoid deadlock
				System.out.println("thread2 acquired lock on obj1");
				try {
					System.out.println("thread2 sleeping");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("Interrupted exception");
				}

			}

		}
		System.out.println("thread2 execution complete");
	}
}

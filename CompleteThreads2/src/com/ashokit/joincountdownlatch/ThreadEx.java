package com.ashokit.joincountdownlatch;

public class ThreadEx extends Thread {

		public void run() {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread Calculate salary");
		}
	
}

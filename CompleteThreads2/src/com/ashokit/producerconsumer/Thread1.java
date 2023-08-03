package com.ashokit.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;

public class Thread1 extends Thread {

	ArrayBlockingQueue<Integer> bq;

	public Thread1(ArrayBlockingQueue<Integer> bq) {
		super();
		this.bq = bq;
	}
	
	@Override
	public void run() {
		
		for(int i=0;i<6;i++)
			try {
				bq.put(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}

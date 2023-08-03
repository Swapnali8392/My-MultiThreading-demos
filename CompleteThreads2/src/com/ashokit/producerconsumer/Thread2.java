package com.ashokit.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;

public class Thread2 extends Thread {

	ArrayBlockingQueue<Integer> bq;

	public Thread2(ArrayBlockingQueue<Integer> bq) {
		super();
		this.bq = bq;
	}
	
	@Override
	public void run() {

		try {
			System.out.println(bq.take());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

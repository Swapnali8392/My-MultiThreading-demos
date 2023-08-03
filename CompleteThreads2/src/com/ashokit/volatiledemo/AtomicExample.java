package com.ashokit.volatiledemo;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
//static int cnt=0;
static AtomicInteger cnt=new AtomicInteger(0);
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Thread t1=new Thread(new Runnable() {
			public void run() {
				//synchronized (this) {		
				for(int i=0;i<1000;i++)
					cnt.incrementAndGet();
			//}
			}
		});
		Thread t2=new Thread(new Runnable() {
			public void run() {
			//	synchronized (this) {		
					
				for(int i=0;i<1000;i++)
					cnt.incrementAndGet();
			//}
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(cnt);
	}

}

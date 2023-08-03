package com.ashokit.lockinterface;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExammple {

	private Lock fairLock=new ReentrantLock(true);
	
	void display(Lock l) {
		System.out.println("display - not locked");	
		System.out.println("display - not locked");	
		l.lock();
		try {
			System.out.println(Thread.currentThread().getName());
		System.out.println("display - locked");
		
		show(l);
		}
		finally {
			System.out.println("display - finally");
			//l.unlock();
			
		}
	}

	void show(Lock l) {
		System.out.println("show - unlocking");
		l.unlock();
		System.out.println("show - unlocked");
	}
	public static void main(String[] args) {
		LockExammple l=new LockExammple();
		Thread t1=new Thread(()->l.display(l.fairLock));
		t1.start();
		Thread t2=new Thread(()->l.display(l.fairLock));
		t2.start();
		Thread t3=new Thread(()->l.display(l.fairLock));
		t3.start();
		Thread t4=new Thread(()->l.display(l.fairLock));
		t4.start();
	}
}

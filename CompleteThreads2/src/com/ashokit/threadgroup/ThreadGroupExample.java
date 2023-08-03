package com.ashokit.threadgroup;

public class ThreadGroupExample {

	public static void main(String[] args) {

		ThreadGroup tg=new ThreadGroup("Parent");
		Thread t1=new Thread(tg,()->System.out.println("Hi t1"));
		Thread t2=new Thread(tg,()->System.out.println("Hi t2"));
//		t1.setDaemon(true);
//		t2.setDaemon(true);		
		tg.setDaemon(true);

		System.out.println(tg.isDaemon());
		System.out.println(t1.isDaemon());
		System.out.println(t2.isDaemon());
		System.out.println("=====");
		System.out.println(tg.getMaxPriority());
		System.out.println(t1.getPriority());
		System.out.println("=====");
		tg.setMaxPriority(Thread.MIN_PRIORITY);
		System.out.println(tg.getMaxPriority());
		System.out.println(t1.getPriority());
	
	}

}

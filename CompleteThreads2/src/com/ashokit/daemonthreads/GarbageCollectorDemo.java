package com.ashokit.daemonthreads;

public class GarbageCollectorDemo {

	public static void main(String[] args) {
	
	String s="Test";
	System.out.println(s);
	s=null;
	Employee e=new Employee();
	System.out.println(e);
	e=null;
	System.gc();
	Thread t=new Thread(()-> System.out.println("Daemon Thread t"));
	t.setDaemon(true);              
	t.start();
	}
}

package com.ashokit.lockinterface;

public class AClass {

	synchronized public void m1() {
		System.out.println("m1 method");
//		m2();
	}
	synchronized public void m2() {
		
		System.out.println("m2 method");
	}
	synchronized public void m3() {

		System.out.println("m3 method");
	}
	synchronized public void m4() {

		System.out.println("m4 method");
	}

	
	
}

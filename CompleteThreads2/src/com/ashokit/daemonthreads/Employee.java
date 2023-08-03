package com.ashokit.daemonthreads;

public class Employee {

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Emp finalize");
	}
}

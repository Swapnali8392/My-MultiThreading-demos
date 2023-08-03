package com.ashokit.threadpool;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

//public class SalaryCalculator implements Runnable {
public class SalaryCalculator implements Callable<Employee> {
	Employee e=null;
	CountDownLatch c;
	public SalaryCalculator(Employee e) {
		super();
		this.e = e;
		this.c=c;
	}

//	@Override
//	public void run() {
//	calculateSalary(e);
//	}
	
	public void calculateSalary(Employee e) {
		double salary=e.getBasic()*e.getDays();
		e.setMonthlySal(salary);
		System.out.println(e.getName() +  "   " + e.getMonthlySal());
		
	}

	@Override
	public Employee call() throws Exception {
		calculateSalary(e);
		return e;
		}

}

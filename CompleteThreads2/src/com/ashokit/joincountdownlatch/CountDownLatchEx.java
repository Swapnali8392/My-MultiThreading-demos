package com.ashokit.joincountdownlatch;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



public class CountDownLatchEx {
       static CountDownLatch c=new CountDownLatch(4);
	public static void main(String[] args) throws InterruptedException, Exception {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1, "Swap", 6000.0, 30);
		Employee e2=new Employee(1, "pk", 4000.0, 25);
		Employee e3=new Employee(1, "aaaa", 1000.0, 30);
		Employee e4=new Employee(1, "bbb",2000.0, 25);
		ExecutorService es=Executors.newFixedThreadPool(3);
		
		List<Future<Employee>> futureList=new ArrayList<>();
		List<Employee> emplist=new ArrayList<>();
		emplist.add(e1); emplist.add(e2); emplist.add(e3); emplist.add(e4);
	
		for(Employee e:emplist) {
			SalaryCalculator sc=new SalaryCalculator(e,c);
			Future<Employee>future=es.submit(sc);
			futureList.add(future);
		}
		c.await();
		System.out.println( "Create file");
		FileOutputStream fout=new FileOutputStream( "SalarySheet.txt");
		System.out.println( "File created");
	}

}

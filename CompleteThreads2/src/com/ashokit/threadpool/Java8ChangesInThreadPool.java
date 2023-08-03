package com.ashokit.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Java8ChangesInThreadPool {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Employee e1=new Employee(1, "Swap", 6000.0, 30);
		Employee e2=new Employee(1, "pk", 4000.0, 25);
		Employee e3=new Employee(1, "aaaa", 1000.0, 30);
		Employee e4=new Employee(1, "bbb",2000.0, 25);
		List<Employee> emplist=new ArrayList<>();
		emplist.add(e1); emplist.add(e2); emplist.add(e3); emplist.add(e4);
		
		ExecutorService es=Executors.newFixedThreadPool(3);
		List<SalaryCalculator> taskList=new ArrayList<>();
		for(int i=0;i<emplist.size();i++) {
			SalaryCalculator sc=new SalaryCalculator(emplist.get(i));
			taskList.add(sc);
		}
		
	 List<Future<Employee>> futureList=new ArrayList<>();
		futureList=es.invokeAll(taskList);
	
		es.shutdown();
		for(Future<Employee> f:futureList) {
			Employee emp= f.get();
			System.out.println(emp);
		}

	}
}

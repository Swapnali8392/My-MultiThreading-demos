package com.ashokit.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

	private final int NUM_AGENT = 5;
	private final CyclicBarrier barrier;
	
	public CyclicBarrierDemo() {
		this.barrier = new CyclicBarrier(NUM_AGENT, new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
		System.out.println("All agents paperwork is completed");
		System.out.println(" by the last thread entering the barrier");
		System.out.println("Good to generate report");
			}
		});
		
		
		
	}
	
	public static void main(String[] args) {

		CyclicBarrierDemo bd=new CyclicBarrierDemo();
		bd.process();
	}
	
	public void process() {
		for(int i=0;i<NUM_AGENT;i++) {
			Thread agent=new Thread(new Agent(i,barrier));
			agent.start();
		}
	}
}

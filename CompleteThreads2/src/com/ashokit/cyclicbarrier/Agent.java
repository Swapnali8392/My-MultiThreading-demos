package com.ashokit.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Agent implements Runnable {

	private final int agentNumber;
	private final CyclicBarrier barrier;
	public Agent(int teammateNumber,CyclicBarrier barrier) {
		this.agentNumber=teammateNumber;
		this.barrier=barrier;
	}
	@Override
	public void run() {
		System.out.println("Agent " + agentNumber + " started paperwork ");
		try {
			Thread.sleep(500);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Agent " + agentNumber + " finished paperwork ");
		try {
			// each thread wait till this barrier
			barrier.await();
			System.out.println("Agent " + agentNumber + " await done");
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}

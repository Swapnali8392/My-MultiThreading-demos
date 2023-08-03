package com.ashokit.forkjoinpool;

import java.util.concurrent.RecursiveTask;

public class ClaimProcessor extends RecursiveTask<Double> {

	private static final int THREASHOLD=100;
	Claim[] claims;
	int start;
	int end;
	public ClaimProcessor(Claim[] claims, int init, int len) {
		super();
		this.claims = claims;
		this.start = init;
		this.end = len;
	}
	@Override
	protected Double compute() {
		// TODO Auto-generated method stub
		
		if(end-start<=THREASHOLD) {
			double sum=0;
			for(int i=start;i<end;i++) {
				sum=sum+claims[i].getAmount();
			}
		
			return sum;
		}
		else {
			int mid=start+(end-start)/2;
			ClaimProcessor left=new ClaimProcessor(claims, start, mid);
			ClaimProcessor right=new ClaimProcessor(claims, mid+1, end);
			left.fork();
			double rightSum=right.compute();
			double leftSum=left.join();
			return rightSum+leftSum;
		}
			
	}
	
}

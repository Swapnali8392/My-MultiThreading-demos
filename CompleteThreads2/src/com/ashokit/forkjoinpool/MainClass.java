package com.ashokit.forkjoinpool;

import java.util.concurrent.ForkJoinPool;

public class MainClass {

	public static void main(String[] args) {
		Claim[] claims=new Claim[400];
		for(int i=0;i<400;i++)
			claims[i]=	new Claim(Math.random()*100);
		
		ClaimProcessor task=new ClaimProcessor(claims, 0, claims.length);
		ForkJoinPool fjp=new ForkJoinPool();
		double total=fjp.invoke(task);
		System.out.println("Total claim amount "+total);
		
	}
}

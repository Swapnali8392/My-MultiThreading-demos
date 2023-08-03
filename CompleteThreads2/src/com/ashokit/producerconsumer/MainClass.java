package com.ashokit.producerconsumer;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		/*
		Queue<Integer> q=new LinkedList<>(); // LL also implements q
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.peek());
		
		ArrayDeque<Integer> dq=new ArrayDeque<>();
		dq.add(10);
		dq.add(20);
		dq.add(30);
		dq.add(40);
		dq.add(50);

		System.out.println("dq");
		System.out.println(dq.pollLast());
		System.out.println(dq.pollFirst());
		System.out.println(dq.poll());
		System.out.println(dq.peek());
		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
		System.out.println(dq);
		*/
		//
		ArrayBlockingQueue<Integer> b=new ArrayBlockingQueue<>(5);
	//	b.add(10); b.add(20); b.add(30); b.add(40); b.add(50); b.add(50); // Exception
		//System.out.println(b.poll());  // null if no ele
		//System.out.println(b.take());       
		Thread2 t2=new Thread2(b);
		Thread1 t1=new Thread1(b);
		t1.start();
		t2.start();
		
		
	}
}

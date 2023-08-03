package com.ashokit.evenodd;

public class MainClass {

	public static void main(String[] args) {
		
	
	EvenOdd evenOdd=new EvenOdd();
	Thread even= new Thread(new PrintThread(100, evenOdd, false));
	Thread odd=new Thread(new PrintThread(100, evenOdd,true));
	
	even.start();
	odd.start();
	}
	
}

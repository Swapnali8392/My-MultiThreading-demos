package com.ashokit.evenodd;

public class PrintThread implements Runnable {
	private int max;
    private EvenOdd evenOdd;
    private boolean isEvenNumber;

    
    
	public PrintThread(int max, EvenOdd evenOdd, boolean isEvenNumber) {
		super();
		this.max = max;
		this.evenOdd = evenOdd;
		this.isEvenNumber = isEvenNumber;
	}



	@Override
	public void run() {
		  int number = isEvenNumber ? 2 : 1;
	        while (number <= max) {
	            if (isEvenNumber) {
	                evenOdd.printEven(number);
	            } else {
	                evenOdd.printOdd(number);
	            }
	            number += 2;
	        }
		
	}

}

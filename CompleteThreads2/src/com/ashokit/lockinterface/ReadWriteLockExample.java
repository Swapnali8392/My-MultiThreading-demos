package com.ashokit.lockinterface;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {
	ReadWriteLock rwl=new ReentrantReadWriteLock();
	private double balance;
	
	public static void main(String[] args) {
		ReadWriteLockExample obj=new ReadWriteLockExample();
		obj.balance=15000;
		Thread cred=new Thread(()->obj.balanceEnquiryCreadPe(obj));
		Thread gPay=new Thread(()-> obj.balanceEnquiryGPe(obj));		
		Thread phoneP=new Thread(()-> obj.balanceEnquiryPhonePe(obj));
		Thread netbanking=new Thread(()-> obj.deposit(obj, obj.balance));
		
		cred.start();
		gPay.start();
		phoneP.start();
		netbanking.start();
	}

	
	double balanceEnquiryPhonePe(ReadWriteLockExample obj) {
		try {
		rwl.readLock().lock();
		System.out.println("balanceEnquiryPhonePe");
		return obj.balance;
		}
		finally {
		rwl.readLock().unlock();
		}
	}
	double balanceEnquiryGPe(ReadWriteLockExample obj) {
		try {
			rwl.readLock().lock();
			System.out.println("balanceEnquiryGPe");
			return obj.balance;
			}
			finally {
			rwl.readLock().unlock();
			}}
	double balanceEnquiryCreadPe(ReadWriteLockExample obj) {
		try {
			rwl.readLock().lock();
			System.out.println("balanceEnquiryCreadPe");
			return obj.balance;
			}
			finally {
			rwl.readLock().unlock();
			}	
		
	}

	double deposit(ReadWriteLockExample obj, double amountToDeposit) {
		try {
			rwl.writeLock().lock();
			System.out.println("deposit");
			return obj.balance+amountToDeposit;
		}
		finally {
			rwl.writeLock().unlock();
		}
	}
}

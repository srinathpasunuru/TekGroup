package com.srinath.Multithreading.synchronizing;

public class SyncThreadDemo extends SyncThread{

	public static void main(String[] args) throws InterruptedException {
		
		SyncThread t1 = new SyncThread();
		SyncThread t2 = new SyncThread();
		
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("count = " +count);
	}
}

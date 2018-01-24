package com.srinath.Multithreading.synchronizing;

public class SyncThread extends Thread {
	
	public static int count = 0;
	
	public synchronized void increment() {
		count++;
	}
	public void run() {
		
		for(int i = 0; i<10000; i++) {
			
			increment();
		}
	}

}

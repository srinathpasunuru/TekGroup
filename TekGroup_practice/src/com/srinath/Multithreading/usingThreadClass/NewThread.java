package com.srinath.Multithreading.usingThreadClass;

public class NewThread extends Thread {  //thread is class which has the run method. we can create a thread by implementing the runnable interface.

	@Override
	public void run() {
		
		for(int i = 0; i<10; i++) {
			System.out.println("Hello " + i);
		}
		
		try {
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

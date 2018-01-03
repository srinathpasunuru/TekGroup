package com.srinath.Multithreading.using_Runnable_interface;

public class RunnableDemo {

	public static void main(String[] args) {
		
		MyRunnable r1 = new MyRunnable();
		MyRunnable r2 = new MyRunnable();
		//we created an object r1 and r2 of the class MyRunnable but the Runnable interface does not have the 
		//start() method. so we use the help of the thread and pass the r1 and r2 as the reference.
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start(); t2.start();
	}
}

package com.srinath.Multithreading.usingThreadClass;

public class ThreadDemo {

	public static void main(String[] args) {
		
		NewThread t1 = new NewThread();
		t1.start();

		NewThread t2 = new NewThread();
		t2.start();
		
		/*here we have two threads running simultaneously so its hard to say the exact output 
		and for different executions there might be different output because of the unexpected behavior
		of the thread-scheduler*/
	}

}

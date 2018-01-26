package com.tek.general;

public class ForLoop {

	public static void main(String[] args) {
		
		ForLoop loop = new ForLoop();
		loop.forLoop();
		
	}

	private void forLoop() {
		
		int number = 10;
		for(int init = 0; init<number; init++) {
			System.out.println(init);
		}
		System.out.println("declaring the variables inside the loop");
		for(int value = 5; value>0; value--) {
			System.out.println(value);
		}
	}
}

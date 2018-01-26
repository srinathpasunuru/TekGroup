package com.tek.general;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		DoWhileLoop loop = new DoWhileLoop();
		loop.doWhileLoop();
		
	}

	private void doWhileLoop() {
		
		int number = 8;
		do {
			System.out.println("number is "+ number);
			number--;
		}
		while(number>0);
	}

}

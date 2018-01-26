package com.tek.general;

public class WhileLoop {

	public static void main(String[] args) {
		
		WhileLoop loop = new WhileLoop();
		loop.whileLoop();
	}

	private void whileLoop() {
		
		int number = 20;
		while(number>0) {
			System.out.println(number);
			number--;
		}
		
	}
	
}

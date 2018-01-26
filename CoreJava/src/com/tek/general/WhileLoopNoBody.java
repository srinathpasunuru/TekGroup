package com.tek.general;

public class WhileLoopNoBody {

	public static void main(String[] args) {
		
		 WhileLoopNoBody loop = new  WhileLoopNoBody();
		 loop.whileLoop();
	}

	private void whileLoop() {
		
		int number1 = 10; int number2 = 20;
		while(++number1 < --number2);
		System.out.println(number1);
	}

}

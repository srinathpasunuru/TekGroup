package com.tek.general;

public class ForLoopUsingComma {

	public static void main(String[] args) {

		ForLoopUsingComma loop = new ForLoopUsingComma();
		loop.forLoopUsingComma();

	}

	private void forLoopUsingComma() {
		
		int number1, number2;
		for(number1 = 1, number2 = 10; number1<number2; number1++, number2--) {
			System.out.println("number1 = " + number1);
			System.out.println("number2 = " + number2);
		}
	}

}

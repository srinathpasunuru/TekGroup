package com.tek.general;

public class ExampleCharIncrement {

	public static void main(String[] args) {
		
		ExampleCharIncrement charIncrement = new ExampleCharIncrement();
		charIncrement.incrementChar();
		
	}

	private static void incrementChar() {
		
		char char1 = 'M';
		System.out.println("the char is : " +char1);
		char1++;
		System.out.println("the char is now: "+char1);
		
	}

}

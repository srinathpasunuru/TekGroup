package com.tek.general;

public class VariableExample {

	public static void main(String[] args) {
		
		int number = 2000;
		variableModify(number);

	}

	private static void variableModify(int number) {
		
		System.out.println("the value of the number is:" + number);
		
		number = number-1000;
		
		System.out.println("the new value of the number is:" + number);
		
	}

}

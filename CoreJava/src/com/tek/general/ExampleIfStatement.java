package com.tek.general;

public class ExampleIfStatement {

	public static void main(String[] args) {
		
		int value1 = 2; int value2 = 4;
		ExampleIfStatement ifStatement = new ExampleIfStatement();
		checkIfCondition(value1, value2);

	}

	private static void checkIfCondition(int value1, int value2) {
		
		if(value1 < value2) {
			System.out.println("value1  is not greater than value2");
		}
		
		if(value1>value2) {
			System.out.println("value1 is greater than value2");//this will not print because the condition is not true
		}
	}

	

}

package com.tek.general;

public class ExampleBlockCode {

	public static void main(String[] args) {	
		ExampleBlockCode block = new ExampleBlockCode();
		block.blockCode();
	}
	private static void blockCode() {
		
		int number = 20;
		for(int i = 0; i<10; i++) {
			System.out.println("the value of y is :" +i);
			System.out.println("the value of number is :" +number);
			number = number+2;
		}
		
	}

}

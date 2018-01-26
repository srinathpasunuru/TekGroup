package com.tek.general;

public class IfElse {

	public static void main(String[] args) {
		
		IfElse ifelse = new IfElse();
		ifelse.ifElse();

	}

	private static void ifElse() {
		
		int apple = 4; int banana = 8;
		if(apple>banana)
			System.out.println("apple value is greater than banana");
		else
			System.out.println("banana value is greater than apple");
		
	}

}

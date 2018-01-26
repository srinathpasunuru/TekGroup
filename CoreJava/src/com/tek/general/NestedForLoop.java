package com.tek.general;

public class NestedForLoop {

	public static void main(String[] args) {
	
		NestedForLoop loop = new NestedForLoop();
		loop.nestedForLoop();
		
	}

	private void nestedForLoop() {
		
		for(int number1=0; number1<8; number1++) {
			for(int number2=1; number2<8; number2++) {
				System.out.print("=");
			}
			System.out.println();
		}
	}

}

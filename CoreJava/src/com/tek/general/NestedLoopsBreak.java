package com.tek.general;

public class NestedLoopsBreak {

	public static void main(String[] args) {
		
		NestedLoopsBreak loop = new NestedLoopsBreak();
		loop.nestedLoopBreak();
		
	}

	private void nestedLoopBreak() {

		for(int number1 = 0; number1 < 10; number1++) {
			System.out.println("loop "+number1+ " :");
			for(int number2=0; number2<100; number2++) {
				System.out.print(number2+" ");
				if(number2 == 10) {
					break;
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("loop broken");
	}

}

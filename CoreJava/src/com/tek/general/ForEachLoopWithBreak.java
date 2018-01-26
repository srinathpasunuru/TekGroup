package com.tek.general;

public class ForEachLoopWithBreak {

	public static void main(String[] args) {
		
		ForEachLoopWithBreak loop = new ForEachLoopWithBreak();
		loop.forEachLoopwithBreak();
		loop.forEachIsReadOnly();
	}

	private void forEachIsReadOnly() {
		
		int numbers[] = {1,2,3,5,6,7,5};
		int sum = 0;
		for(int number: numbers) {
			System.out.print(number+" ");
			number = number*10;
		}
		System.out.println();
		for(int number: numbers) {
			System.out.print(number+" ");
		}
	}

	private void forEachLoopwithBreak() {
		
		int numbers[] = {1,2,3,5,6,7,5};
		int sum = 0;
		for(int number: numbers) {
			System.out.println(number);
			sum = sum+number;
			if(number == 6)
				break;
		}
		System.out.println("sum = "+sum);
	}

}

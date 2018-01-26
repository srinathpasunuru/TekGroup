package com.tek.general;

public class ForEachLoop {

	public static void main(String[] args) {
		
		ForEachLoop loop = new ForEachLoop();
		loop.forEachLoop();
	}

	private void forEachLoop() {
		
		int numbers[] = {1,2,3,5,6,7,5};
		int sum = 0;
		for(int number: numbers) {
			System.out.println(number);
			sum = sum+number;
		}
		System.out.println("the total sum is "+sum);
	}

}

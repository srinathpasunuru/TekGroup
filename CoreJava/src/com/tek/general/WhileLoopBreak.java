package com.tek.general;

public class WhileLoopBreak {

	public static void main(String[] args) {
		
		WhileLoopBreak loop = new WhileLoopBreak();
		loop.whileLoopBreak();
		
	}

	private void whileLoopBreak() {
		
		int number = 0;
		while(number < 30) {
			if(number == 15)
				break;
			System.out.println(number);
			number++;
		}
		System.out.println("loop is broken");
	}

}

package com.tek.general;

public class ExampleOptionalBreak {

	public static void main(String[] args) {
		
		ExampleOptionalBreak optionalBreak = new ExampleOptionalBreak();
		optionalBreak.optionalBreak();
	}

	private static void optionalBreak() {
		
		for(int i = 0; i<10; i++) {
			switch(i) {
				case 0:
				case 1:
				case 2:
					System.out.println("the values are less than 3");
				case 3:
				case 4:
				case 5:
				case 6:
					System.out.println("the values are less than 6");
					break;
				default:
					System.out.println("the values are mote than 6 and less than 10");
		}
	
	}
	}

}

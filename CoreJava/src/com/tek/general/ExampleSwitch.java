package com.tek.general;

public class ExampleSwitch {

	public static void main(String[] args) {
		
		ExampleSwitch obj = new ExampleSwitch();
		obj.switchMethod();

	}

	private static void switchMethod() {
		
		for(int i = 0; i<4; i++) {
			switch(i) {
			case 0: 
				System.out.println("value is 0");
				break;
			case 1:
				System.out.println("value is 1");
				break;
			case 2:
				System.out.println("value is 2");
				break;
			default:
				System.out.println("entered the value greater than 2 ");
					
			}
		}
	}

}

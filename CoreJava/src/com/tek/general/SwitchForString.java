package com.tek.general;

public class SwitchForString {

	public static void main(String[] args) {
		
		SwitchForString string = new SwitchForString();
		string.switchString();
	}

	private void switchString() {
		
		String str = "srinath";
		switch(str) {
		case "ramakanth":
			System.out.println("the name is ramakanth");
			break;
		case "srinath":
			System.out.println("the name is srinath");
			break;
		case "akhil":
			System.out.println("the name is akhil");
			break;
			default:
				System.out.println("there is no such string");
				break;
		}
		
	}

}

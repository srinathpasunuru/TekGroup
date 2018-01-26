package com.tek.general;

import java.io.IOException;

public class MenuUsingSwitch {

	public static void main(String[] args) throws IOException {
		
		MenuUsingSwitch menu = new MenuUsingSwitch();
		menu.switchMenu();
	}

	private void switchMenu() throws IOException {
		
		char input_choice;
		do {
			System.out.println("choose from the option:");
			System.out.println(" 1: if statement");
			System.out.println(" 2: for");
			
			
			input_choice = (char) System.in.read();
			
		}
		while(input_choice < '1' || input_choice >'5');
		
		switch(input_choice) {
		case '1':
			System.out.println("if(condition) statement");
			System.out.println("else {\n statement");
			break;
		case 2:
			System.out.println("for(initialize; condition; increment");
			System.out.println("statements");
		}
		
		
	}

}

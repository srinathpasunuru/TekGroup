package com.tek.general;

public class LabelUsingContinue {

	public static void main(String[] args) {
		
		LabelUsingContinue label = new LabelUsingContinue();
		label.labelUsingContinue();
	}

	private void labelUsingContinue() {
		
		label:for(int number1 = 0; number1< 10; number1++) {
			for(int number2=0; number2<10; number2++) {
				if(number2>number1) {
					System.out.println();
					continue label;
				}
				System.out.print(" " + (number1*number2));
			}
		}
	System.out.println();
	}

}

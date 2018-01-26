package com.tek.general;

import java.util.Scanner;

public class ExampleIfElseIf {

	public static void main(String[] args) {
		
		ExampleIfElseIf ifElseIf = new ExampleIfElseIf();
		ifElseIf.ifElseIf();

	}

	private static void ifElseIf() {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number==0)
			System.out.println("the number is 0");
		else if(number>0 && number<10)
			System.out.println("value is between 0 and 10");
		else if(number<0)
			System.out.println("value is less than 0");
		else if(number>10 && number<30)
			System.out.println("value is between 10 and 30");
		else
			System.out.println("some other number");
	}

}

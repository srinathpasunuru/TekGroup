package com.tek.general;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		PrimeNumber object = new PrimeNumber();
		object.primeNumberMethod();

	}

	private void primeNumberMethod() {
		
		int count = 0;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		for(int value = 1; value<=number; value++) {
			if(number%value==0)
				count++;
		}
		
		if(count == 2) {
			System.out.println("the number " + number + " is prime");
		}
		else {
			System.out.println("the number " + number + " is not prime");
		}
	}

}

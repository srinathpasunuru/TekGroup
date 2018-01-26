package com.tek.general;

import java.util.Scanner;

public class ForEachSerachArray {

	public static void main(String[] args) {
		
		ForEachSerachArray loop = new ForEachSerachArray();
		loop.forEachSearchArray();
		
	}

	private void forEachSearchArray() {
		
		int nums[] = {1,2,3,5,64,6,6,0};
		boolean isPresent = false;
		System.out.println("enter a number as input");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for(int value : nums) {
			if(value == number) {
				isPresent = true;
				break;
			}
		}
		if(isPresent) {
			System.out.println("the number " + number+ " is found");
		}
	}
}

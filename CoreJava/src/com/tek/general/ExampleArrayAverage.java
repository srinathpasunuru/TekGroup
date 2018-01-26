package com.tek.general;

public class ExampleArrayAverage {

	public static void main(String[] args) {
	
		ExampleArrayAverage obj = new ExampleArrayAverage();
		obj.averageArray();

	}

	private static void averageArray() {
		
		double array[] = {12.2, 23.2, 54.3, 9.55};
		double sum = 0;
		for(int i = 0; i<array.length; i++) {
			sum = sum +array[i];
		}
		System.out.println("the average of the array is :" +sum/array.length);
		
	}

}

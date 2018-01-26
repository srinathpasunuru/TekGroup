package com.tek.general;

public class ExampleDouble {

	public static void main(String[] args) {
		
		ExampleDouble exampleDouble = new ExampleDouble();
		exampleDouble.areaOfCircle();

	}

	private static void areaOfCircle() {
		
		double pi = 3.14; double radius = 5.6;
		
		System.out.println("area of the circle is : " + pi*radius*radius);
		
	}

}

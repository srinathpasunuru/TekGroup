package com.tek.general;

public class ExampleLong {

	public static void main(String[] args) {
		
		ExampleLong longExample = new ExampleLong();
		longExample.distanceLight();
	}

	private static void distanceLight() {
		
		int speedOfLight = 186000;
		int numberOfDays = 1000;
		int seconds;
		long distance_travelled;
		
		seconds = numberOfDays * 24 * 60 * 60;
		distance_travelled = speedOfLight * seconds;
		
		System.out.println("In " +numberOfDays+" days light will travel a distance of " + distance_travelled + " miles");
		
	}
}
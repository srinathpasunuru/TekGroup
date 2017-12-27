package com.srinath.call_by_reference;

public class StudentDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student("srinath", 23);
		
		System.out.println("Before calling the method:" + s1);
		
		changeContent(s1);
		
		System.out.println("After calling the method:" + s1);

	}

	private static void changeContent(Student s1) {
		
		s1.name = "Ramakanth";
		s1.age = 25;
	}

}

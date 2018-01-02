package com.srinath.list.Sorting_arraylist;

public class Student {

	int rollno;
	int age;
	String name;
	public Student(int rollno, int age, String name) {
		
		this.rollno = rollno;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", age=" + age + ", name=" + name + "]";
	}
	
}

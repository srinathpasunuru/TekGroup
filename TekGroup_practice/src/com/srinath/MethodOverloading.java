package com.srinath;

public class MethodOverloading {
	
	public void method1(int a) {   /*method overloading means same method with different number arguments
									 or same number of arguments with different data type*/
		
		System.out.println("method m1 with one argument and data type of int");
	}
	
	public void method1(int a, int b) {   //same method as above but 2 arguments
		
		System.out.println("method m1 with two argument and data types of int");
	}
	
	public void method1(char ch) {     //same method with one argument but different data type
		
		System.out.println("method m1 with one argument and data types of char");
	}

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading(); /*obj is object of class MethodOverloading 
															and is initialized by the default constructor*/
		
		obj.method1(10); // which method to be executed is decided at the compile time
		obj.method1(10,20);
		obj.method1('c');
	}

}

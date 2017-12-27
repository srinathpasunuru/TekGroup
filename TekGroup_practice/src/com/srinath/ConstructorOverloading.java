package com.srinath;

//ConstructorOverloading is same as the method oveloading but here we overload the constructor
public class ConstructorOverloading {
	
	ConstructorOverloading(int a){       //this is a constructor with 1 argument
		
		System.out.println("1-argument constructor");
	}
	
	ConstructorOverloading(int a, int b){   //constructor with 2 arguments
		
		System.out.println("2-argument constructor");
	}
	
	ConstructorOverloading(char ch){    //constructor with one argument of different data type
		
		System.out.println("character argument constructor");
	}

	public static void main(String[] args) {
		
		new ConstructorOverloading(10);
		new ConstructorOverloading(10,20);
		new ConstructorOverloading('c');
	}

}

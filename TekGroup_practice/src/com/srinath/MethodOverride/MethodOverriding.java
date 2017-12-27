package com.srinath.MethodOverride;

public class MethodOverriding extends MethodOverridden {   //child class extending the parent class
	
	public void method() {
		
			System.out.println("overriding method");  //this is the overriding method
	}
	public static void main(String[] args) {
		
		new MethodOverriding().method();

	}

}

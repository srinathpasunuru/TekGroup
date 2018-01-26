package com.tek.general;

public class ReturnStatement {

	public static void main(String[] args) {
		
		ReturnStatement statement = new ReturnStatement();
		statement.returnStatement();
	}

	private void returnStatement() {
		
		System.out.println("this is executes which is before the return statement");
		if(true) 
			return;
		System.out.println("this is not executed because the controller is passes back to the caller method");
	}

}

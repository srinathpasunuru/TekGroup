package com.srinath.ContactApp.Exception;

public class UserBlockedException extends Exception {

	//this creates the user object without error message
	public UserBlockedException() {

	}
	
	//creates user object using the error message
	public UserBlockedException(String errMessage) {
		super(errMessage);
	}
}

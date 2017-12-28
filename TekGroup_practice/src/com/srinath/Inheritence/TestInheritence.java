package com.srinath.Inheritence;

public class TestInheritence {

	public static void main(String[] args) {
		
		Boeing b1 = new Boeing(200, 5, 270);
		b1.increaseSpeed(250);
		b1.changeFlaps(3);
		b1.changeSeats(300);
	}

}

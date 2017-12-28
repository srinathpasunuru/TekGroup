package com.srinath.Inheritence;

public class Airplane {
	
	int speed;
	int flaps;
	
	public Airplane(int speed, int flaps) {
		
		this.speed = speed;
		this.flaps = flaps;	
	}
	public void increaseSpeed(int speed) {
		
		this.speed += speed;
		System.out.println("speed : " + speed);
	}
	public void changeFlaps(int flaps) {
		
		this.flaps = flaps;
		System.out.println("flaps : " + flaps);
	}
}

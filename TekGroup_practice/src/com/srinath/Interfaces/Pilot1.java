package com.srinath.Interfaces;

public class Pilot1 implements AirPlane {

	int speed;
	int flaps;
	
	@Override
	public void increaseSpeed(int speed) {
		
		this.speed = this.speed + speed; 
		System.out.println("new speed: " + speed);
	}

	@Override
	public void changeFlaps(int flaps) {
		
		this.flaps = flaps;
		System.out.println("flaps: " + flaps);
		
	}
	
	

}

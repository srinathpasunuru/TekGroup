package com.srinath.Inheritence;

public class Boeing extends Airplane {

	int seats;
	
	public Boeing(int speed, int flaps, int seats) {
		super(speed, flaps);
		this.seats = seats;
	}
	
	public void changeSeats(int seats) {
		
		this.seats = seats;
		System.out.println("seats : "+ seats);
	}
	
}

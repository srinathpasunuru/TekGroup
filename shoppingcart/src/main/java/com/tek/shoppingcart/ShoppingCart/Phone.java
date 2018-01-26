package com.tek.shoppingcart.ShoppingCart;

public class Phone {

	private int phone_quantity;
	private double phone_price;
	
	public Phone(int phone_quantity, double phone_price) {
		super();
		this.phone_quantity = phone_quantity;
		this.phone_price = phone_price;
	}
	
	public int getPhone_quantity() {
		return phone_quantity;
	}
	public void setPhone_quantity(int phone_quantity) {
		this.phone_quantity = phone_quantity;
	}
	public double getPhone_price() {
		return phone_price;
	}
	public void setPhone_price(double phone_price) {
		this.phone_price = phone_price;
	}
	
	
}

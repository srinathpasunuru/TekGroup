package com.tek.shoppingcart.ShoppingCart;

public class Ipad {
	private int ipad_quantity;
	private double ipad_price;
	
	public Ipad(int ipad_quantity, double ipad_price) {
		super();
		this.ipad_quantity = ipad_quantity;
		this.ipad_price = ipad_price;
	}

	public int getIpad_quantity() {
		return ipad_quantity;
	}

	public void setIpad_quantity(int ipad_quantity) {
		this.ipad_quantity = ipad_quantity;
	}

	public double getIpad_price() {
		return ipad_price;
	}

	public void setIpad_price(double ipad_price) {
		this.ipad_price = ipad_price;
	}	
	
}

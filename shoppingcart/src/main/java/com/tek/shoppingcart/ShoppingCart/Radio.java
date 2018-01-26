package com.tek.shoppingcart.ShoppingCart;

public class Radio {
	
	private int radio_quantity;
	private double radio_price;
	
	public Radio(int radio_quantity, double radio_price) {
		super();
		this.radio_quantity = radio_quantity;
		this.radio_price = radio_price;
	}
	
	public int getRadio_quantity() {
		return radio_quantity;
	}
	public void setRadio_quantity(int radio_quantity) {
		this.radio_quantity = radio_quantity;
	}
	public double getRadio_price() {
		return radio_price;
	}
	public void setRadio_price(double radio_price) {
		this.radio_price = radio_price;
	}
	
	
}

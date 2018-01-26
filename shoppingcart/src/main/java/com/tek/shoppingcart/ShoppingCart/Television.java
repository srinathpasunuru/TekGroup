package com.tek.shoppingcart.ShoppingCart;

public class Television {
	
	private int tv_quantity;
	private double tv_price;
	
	public int getTv_quantity() {
		return tv_quantity;
	}
	public void setTv_quantity(int tv_quantity) {
		this.tv_quantity = tv_quantity;
	}
	public double getTv_price() {
		return tv_price;
	}
	public void setTv_price(double tv_price) {
		this.tv_price = tv_price;
	}
	
	public Television(int tv_quantity, double tv_price) {
		super();
		this.tv_quantity = tv_quantity;
		this.tv_price = tv_price;
	}
	
}

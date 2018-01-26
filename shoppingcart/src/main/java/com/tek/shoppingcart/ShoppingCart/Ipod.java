package com.tek.shoppingcart.ShoppingCart;

public class Ipod {
	
	private int ipod_quantity;
	private double ipod_price;
	
	public Ipod(int ipod_quantity, double ipod_price) {
		super();
		this.ipod_quantity = ipod_quantity;
		this.ipod_price = ipod_price;
	}
		
	public int getIpod_quantity() {
		return ipod_quantity;
	}
	public void setIpod_quantity(int ipod_quantity) {
		this.ipod_quantity = ipod_quantity;
	}
	public double getIpod_price() {
		return ipod_price;
	}
	public void setIpod_price(double ipod_price) {
		this.ipod_price = ipod_price;
	}
	
	
}

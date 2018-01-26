package com.tek.shopping_cart.shoppingcart;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart();
		System.out.println("options for shopping :");
		System.out.println("1: list of items");
		System.out.println("2: select an item to add to the cart :");
		
		System.out.println("enter your option: ");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
			switch(input) {
			case 1:
				//to do display all the items for shopping
				Map<Integer, Items> map = new HashMap<Integer, Items>();
				map.put(1, new Items("TV", 1, 600));
				map.put(2, new Items("Ipad", 1, 700));
				map.put(3, new Items("Ipod", 1, 500));
				map.put(4, new Items("Radio", 1, 300));
				map.put(5, new Items("phone", 1, 900));
			
				System.out.println("here are the items available for shopping\n");
				Iterator<Entry<Integer, Items>> iterator = map.entrySet().iterator();
				while(iterator.hasNext()) {
					System.out.println(iterator.next().getValue());
				}
				break;
			case 2:
				//to do select an item and add to the cart
				break;
				default:
					System.out.println("enter either 1 or 2 ");
			}		
	}
}

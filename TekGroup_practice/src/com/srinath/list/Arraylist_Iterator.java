package com.srinath.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_Iterator {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);ar.add(40);ar.add(90);ar.add(60);
		
		iterating_list(ar);
	}

	private static void iterating_list(ArrayList<Integer> ar) {
		
		Iterator<Integer> iterator = ar.iterator();
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next()+ " ");
		}
		
	}

}

package com.srinath.list;

import java.util.*;

public class ArrayLst {

	public static void main(String[] args){
		
	    //size of the arraylist
		int n = 5;
		
		//creating an arraylist with size n
		ArrayList<Integer> list = new ArrayList<Integer>(n);
		
		//adding the elements to the list
		for(int i = 1; i<=n; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		//removing an element at an index
		
		list.remove(3);
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + "");
		}

	}

}

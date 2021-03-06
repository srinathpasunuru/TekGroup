package com.srinath.list;

import java.util.LinkedList;

public class LinkedLst {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println("Linked List : " + list);
		
		list.remove("B");
		System.out.println("Linked List : " + list);
		
		// for finding the elements in the linked list use contains()
		boolean status = list.contains("C");
		
		if(status) {
			System.out.println("element is present");
		}
		else {
			System.out.println("element is not present");
		}
		
		list.add("B");list.add("D");list.add("E");list.add("F");list.add("G");
		System.out.println("Linked List : " + list);
		
		//getting and setting an element
		System.out.println("element at the index 2: " + list.get(2));
		
		list.set(2, "P");
		System.out.println("Linked List : " + list);
		
		//finding the size of the linked list
		System.out.println("size of the linked list: " + list.size());
		
	}

}

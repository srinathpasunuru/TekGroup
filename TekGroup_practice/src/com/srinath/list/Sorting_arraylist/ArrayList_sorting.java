package com.srinath.list.Sorting_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_sorting {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(111, 25, "srinath"));
		al.add(new Student(113, 55, "reddy"));
		al.add(new Student(109, 22, "pasunuru"));
		
		Collections.sort(al, new Comparing_by_age());//first object is the list to get sorted and second is the object of the comparator
		
		Iterator iterator = al.iterator();
		
		while(iterator.hasNext()) {
			Student s = (Student) iterator.next();
			System.out.println("student name is " + s.name + " with the age of " +s.age+ " and "
					+ "roll number "+ s.rollno);
		}
		

	}

}

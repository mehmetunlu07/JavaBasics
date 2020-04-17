package com.syntax.class28;
import java.util.*;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> llist = new LinkedList<>();
		llist.add("Yunus"); // comes from Collection
		llist.add(0, "Reyhan");// comes from List
		llist.add("Pavel");
		llist.add("Farid");
		llist.add("Farid");
		llist.add("Farid");
		llist.addFirst("Doganay");

		int size = llist.size();
		System.out.println(size);
		System.out.println(llist);

		// get all elements 1 by 1 in 3 different ways
		for (int x = 0; x < llist.size(); x++) {
			System.out.print(llist.get(x)+" ");
		}
		
		System.out.println();
		for (String a : llist) {
			System.out.print(a+" ");
		}
		
		System.out.println();
		Iterator<String> itr = llist.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.print(str+" ");
		}
		
		System.out.println();
		System.out.println("************************************");
		
		//can we store objects of user defined classes?
		List<Food> food=new LinkedList<>();
		food.add(new Salad("salad", "tomato and cucumber", 100));
		food.add(new Dessert("desert", "chocolate", 1000));
		food.add(new MainDish("pasta", "mushrooms", 800));
		//food.add(new MainDish("pasta", "mushrooms", 800));
		
		for(Food f:food) {
			f.calories();
			f.foodType();
			f.ingredient();
			
			System.out.println("---------------");
		}
	}
}

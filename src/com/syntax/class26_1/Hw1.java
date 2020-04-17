package com.syntax.class26_1;

import java.util.ArrayList;

//Create a generic ArrayList that will store 5 names into it. 
//Find out whether the given ArrayList is empty or not? 
//Check whether the specific name is present in an ArrayList or not?
//Find the size of your arrayList and print all values from that list.

public class Hw1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("John");
		list.add("Marry");
		list.add("Nola");
		list.add("Alp");
		list.add("Zoi");
		System.out.println(list.isEmpty());
		System.out.println(list.contains("Nola"));
		System.out.println(list.size());
		System.out.println(list);

	}

}

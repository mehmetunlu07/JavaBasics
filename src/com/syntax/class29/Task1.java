package com.syntax.class29;

import java.util.*;
//import java.util.Set;
//import java.util.TreeSet;

//1.Create a Set collection in which you need to add names of the countries. In this set we want all objects to be sorted in alphabetical order. 
// Using 2 different ways retrieve all elements from set.
//2.Create a Set of cities in which you want to make sure that insertion order is maintained. Using Iterator remove any city 
// that starts with “A”;
//3.Create a Set collection that will hold Objects of Student Type. In this set we do not care about the insertion order. 
// Each student object should have name and studentID. Display name of each student.

public class Task1 {

	public static void main(String[] args) {
		// Task-1
		Set<String> country = new TreeSet<>();
		country.add("England");
		country.add("Belgium");
		country.add("Holland");
		country.add("Spain");
		country.add("England");

		System.out.println(country.size());
		System.out.println(country);

		for (String i : country) {
			System.out.println(i);
		}
		System.out.println("--------------");

		Iterator<String> itr = country.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("----------//Task-2----------");

		Set<String> cities = new LinkedHashSet<>();
		cities.add("Berlin");
		cities.add("Rome");
		cities.add("Austin");
		cities.add("Dallas");
		cities.add("Brussels");

		System.out.println(cities);
		
		Iterator<String> i = cities.iterator();
		while (i.hasNext()) {
			String str = i.next().toLowerCase();
			if (str.startsWith("a")) {
				i.remove();
			}
		}
		System.out.println(cities);

		System.out.println("----------//Task-3----------");

		Set<Student> student = new HashSet<>();

		student.add(new Student("Ali", "123"));
		student.add(new Student("Ahmet", "124"));
		student.add(new Student("Veli", "125"));

		Iterator<Student> s = student.iterator();
		while (s.hasNext()) {
			System.out.println(s.next().name);
		}

	}

}

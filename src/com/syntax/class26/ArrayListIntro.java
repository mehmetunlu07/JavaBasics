package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		//create an arraylist to store numbers
		
		ArrayList<Integer>numbers=new ArrayList<>();
		numbers.add(10);//autoboxing
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(60);
		
		System.out.println(numbers.get(4));  // get the value index 4
		System.out.println(numbers.get(2));  // get index 2
		System.out.println(numbers.contains(200));  //if the list contains given value return true else false
		System.out.println(numbers.size());   // number of elements
		
		System.out.println("**********************");
		ArrayList<Integer>arr=new ArrayList<>();
		arr.add(61);
		arr.add(62);
		
		System.out.println(numbers.containsAll(arr));   
		System.out.println(numbers.addAll(arr));
		
		System.out.println("...............................");
		ArrayList<String> str=new ArrayList<>();
		str.add("John");
		str.add("Wayn");
		
		for(int i=0;i<str.size();i++) {
			System.out.println(str.get(i));
		}
		
		System.out.println(" ------ ------- -----  ----------  --------");
		
		for(int i=0; i<numbers.size(); i++) {
			int num=numbers.get(i);//auto unboxing
			System.out.println(num);
		}

		System.out.println(" ------ ------- -----");
		
		for(int num: numbers) {
			System.out.println(num);
		}
	}
}

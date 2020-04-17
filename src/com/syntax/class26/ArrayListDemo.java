package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		//create an arraylist with names
		
		ArrayList<String> arrayList=new ArrayList<>();
		//adding String Object into arrayList
		arrayList.add("John");
		arrayList.add("Gulbahar");
		
		
		//access element from arrayList
		String secondElement=arrayList.get(0);
		System.out.println(secondElement);
		
		//arraylist is dynamic array
		arrayList.add("Jane");
		arrayList.add("James");
		
		//how to get number of elements inside arraylist?
		int size=arrayList.size();
		System.out.println(size);
		
		arrayList.add("Hichem");
		System.out.println(arrayList.size());
		
		arrayList.remove("John");
		System.out.println(arrayList.size());
		
		arrayList.add("Hichem");
		
		System.out.println(arrayList);
		System.out.println("*********************************");
		arrayList.set(4, "Ahmed");
		System.out.println(arrayList);
		
		System.out.println("......................................");
		//how to retrieve values from arraylist 1 by 1?
		for(int i=0; i<arrayList.size(); i++) {
			String element=arrayList.get(i);
			System.out.println(element);
		}
		System.out.println("---------------******---------");
		
		arrayList.add(0, "Gul");
		arrayList.set(0, "Ahmed");
		
		
		for(String str: arrayList) {
			System.out.println(str);
		}
		
		System.out.println(arrayList.lastIndexOf("Ahmed"));
	}
}

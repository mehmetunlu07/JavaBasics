package com.syntax.class11;

public class Task5 {

	public static void main(String[] args) {
//		Create a String that should be combination of letters, 
//		numbers and special characters. Find out how many alpha characters are there in the String.
		
		String a="abdFG njuIK 12345+-%^&";
		a=a.replaceAll("[^A-Za-z]", "");
		System.out.println(a);
		System.out.println("The number of alpha characters: "+a.length());

	}

}

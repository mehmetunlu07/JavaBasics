package com.syntax.class14;

public class Task3 {
//Create a method that will accept a String as a parameter and return a new String that consist only of vowels. 
//Method should be available inside the class where it was declared and executed by calling it is name
	
	private static String method(String str) {
		String s="";
		s=str.replaceAll("[^A-Za-z]", "");
		
		return s;
	}

	public static void main(String[] args) {
		String s="12345*+-/Syntax Tech";
		System.out.println(method(s));
		

	}

}

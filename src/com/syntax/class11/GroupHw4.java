package com.syntax.class11;

public class GroupHw4 {

	public static void main(String[] args) {
//		4.Find out how many alpha characters are present in a String?  Find number of words in string?
		
		String a= "Hello I am trying to be a tester. 1124345555666777And writing some codes!@#$%+-/*&*&&&&***** ";
		a=a.replaceAll("[^A-Za-z]","");
		System.out.println(a);
		int b=a.length();
		System.out.println("Number of alpha character is "+b);
		
		System.out.println("---------------Finding number of words--------------------");
		
		a= "   Hello I am trying to be a tester. And trying to write some codes.   ";
		
		a=a.trim();
		System.out.println(a);
		String [] array=a.split(" ");
		System.out.println("Number of words are "+array.length);
		
		

	}

}

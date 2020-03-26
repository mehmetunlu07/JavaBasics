package com.syntax.class14;

public class Task3 {
//Create a method that will accept a String as a parameter and return a new String that consist only of vowels. 
//Method should be available inside the class where it was declared and executed by calling it is name
	
	private static String method(String str) {
		char c=0;
		String str1="";
		str=str.replaceAll("[^A-Za-z]", "");
		for(int i=0;i<str.length();i++) {
			c=str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
			  str1+=c; 	
			}
		}
		
		return str1;
	}

	public static void main(String[] args) {
		String s="12345*+-/Syntax Tech";
		System.out.println("The vowels in the string: "+method(s));
		

	}

}

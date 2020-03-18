package com.syntax.class11;

public class Task2 {

	public static void main(String[] args) {
//			Create a String and if the String is not empty perform the following: 
//			if the String has an odd number of characters and has 3 or more characters, 
//			print the character in the middle of the String.
		
		String a="Syntax!";
		
		if(!a.isEmpty()) {
			 if(a.length()%2!=0 && a.length()>=3) {
				 int middle=(a.length())/2;
				 System.out.println("Middle index: "+middle);
				 System.out.println("Middle character is: "+ a.charAt(middle));
			 }
			
		}

	}

}

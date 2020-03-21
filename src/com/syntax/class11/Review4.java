package com.syntax.class11;

public class Review4 {

	// Write a Java Program to find whether a String is palindrome or not?
		public static void main(String[] args) {
			String str = "radar kayak radar";

			// 1st way
			//char[] array = str.toCharArray();
			//2nd way
			char [] array=new char[str.length()];
			for(int i=0;i<str.length();i++) {
				array[i]=str.charAt(i);
			}

			String reverse = "";
			System.out.println(reverse.isEmpty());

			for (int i = array.length-1; i >= 0; i--) {
				reverse += array[i];
			}
			System.out.println("word is=" + str);
			System.out.println("reverse is=" + reverse);
			
			if(str.equals(reverse)) {
				System.out.println("Yes, it is a palindrome");
			}else {
				System.out.println("No, it is not a palindrome");
			}
			
			//HW use charAt() method to find if it is a palindrome
		}
	}
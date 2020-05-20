package com.syntax.class35Group_Halime;
//6.Write a Java Program to find whether a String is palindrome or not?
//A palindrome is a word, phrase, or sentence reads the same backward or forward--such as "Madam"

import java.util.Scanner;

public class GroupHw3_Palindrome {
	
	public static void isPalindrome() {
		String str, reverse="";
		System.out.println("Enter a string?");
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine();

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
			
		}
		System.out.println(reverse);

		if (str.equalsIgnoreCase(reverse)) {
			System.out.println("String is a palindrome");
		} else {
			System.out.println("String is NOT a palindrome");
		}
	}

	
	public static void main(String[] args) {
		
		isPalindrome();

	}

}

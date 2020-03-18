package com.syntax.class11;

import java.util.Scanner;

public class GroupHw6 {

	public static void main(String[] args) {
//		6.Write a Java Program to find whether a String is palindrome or not?
//		A palindrome is a word, phrase, or sentence reads the same backward or forward--such as "Madam"

		String str, rev="";
		System.out.println("Enter a string?");
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine();

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
			//System.out.println("rev: "+rev+"  i: "+i+" "+str.charAt(i));
		}
		System.out.println(rev);

		if (str.equalsIgnoreCase(rev)) {
			System.out.println("String is a palindrome");
		} else {
			System.out.println("String is NOT a palindrome");
		}

	}

}

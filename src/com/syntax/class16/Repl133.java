package com.syntax.class16;

//Return a string that is composed of each letter as long as the letter is later on in the alphabet
//than its previous one.  You can assume actual parameters are lowercase.
//See below examples.

public class Repl133 {
	public static String alphabetical(String str) {
		String s = "" + str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) > str.charAt(i - 1)) {
				s += str.charAt(i);
			}
		}

		return s;

	}

	// test case below (dont change):
	public static void main(String[] args) {
		System.out.println(alphabetical("hello")); // "hlo"
		System.out.println(alphabetical("software"));
		System.out.println(alphabetical("language"));
	}
}

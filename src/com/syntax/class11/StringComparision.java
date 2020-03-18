package com.syntax.class11;

public class StringComparision {

	public static void main(String[] args) {
		String str1 = "Hello";

		String str2 = new String("Hello");

		if (str1.equals(str2)) {                           // using equals()
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}

		System.out.println(" -------   COMPARING USING == OPERATOR");

		if (str1 == str2) {                            // using ==  because string creation is different
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}

		String str3 = "Hello";

		if (str1 == str3) {                                  // using ==
			System.out.println("Str1 is equal to Str3");
		} else {
			System.out.println("Str1 is NOT equal to Str3");
		}
	}
}

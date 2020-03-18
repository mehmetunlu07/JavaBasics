package com.syntax.class11;

public class Task1 {

	public static void main(String[] args) {
		// Create a String and print it in reverse order (Sunday → yadnuS).
		
		String a="Sunday";
		int ext=a.length()-1;
		System.out.println(ext);
		for(int i=ext;i>=0;i--) {
			System.out.print(a.charAt(i));
		}

	}

}

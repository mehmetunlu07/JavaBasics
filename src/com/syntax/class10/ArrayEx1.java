package com.syntax.class10;

public class ArrayEx1 {

	public static void main(String[] args) {
		String[] fruits = { "Apple", "Banana", "Melon", "Cherry", "Orange" };
		for (String i : fruits) {
			if (i.equals("Melon")) {
				System.out.println("Your favorite fruit is " + i);
			} else {
				System.out.println("No fruit is " + i);
			}

		}

	}

}

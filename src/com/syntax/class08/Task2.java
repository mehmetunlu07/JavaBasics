package com.syntax.class08;

public class Task2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i == 80) {
				break;
			}
			System.out.println(i);
		}
		// System.out.println(i); // gives error use i inside for loop
	}

}

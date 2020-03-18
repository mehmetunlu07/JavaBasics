package com.syntax.class05;

public class hw4 {

	public static void main(String[] args) {
		// Program to find largest number among three numbers using nested
//		if provided by a user (numbers must be distinct)

		double a = 5000, b = 15000, c = 2225;
		double greatest = 0;
		if (a > b) {
			if (a > c) {
				greatest = a;
			} else {
				greatest = c;
			}

		} else if (b > c) {
			greatest = b;
		} else {
			greatest = c;
		}

		System.out.println("The largest number is " + greatest);

	}

}

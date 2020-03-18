package com.syntax.class05;

public class hw3 {

	public static void main(String[] args) {
//		Write a program to find largest of three double values using if-else..if and 
//		logical operators provided by a user (numbers must be distinct)

		double a = 500, b = 500, c = 500;
		double greatest = 0;
		if (a > b && a > c) {
			greatest = a;
		} else if (b > a && b > c) {
			greatest = b;
		} else {
			greatest = c;
		} 
		
		System.out.println("The largest number is " + greatest);
	}

}

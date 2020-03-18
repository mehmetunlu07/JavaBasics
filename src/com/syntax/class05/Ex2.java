package com.syntax.class05;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your choice 1-7");
		int a = input.nextInt();
		if (a >= 1 && a <= 5) {
			System.out.println("weekday");
		} else if (a == 6 || a == 7) {
			System.out.println("weekend");
		} else
			System.out.println("Invalid choice");
	}

}
//Write a program that will print whether it is a weekend or weekday. 
//If any day from 1-5 → output “It is a weekday”, 
//anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”
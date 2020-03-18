package com.syntax.class06;

import java.util.Scanner;

public class rpl34 {

	public static void main(String[] args) {
		Scanner scan;
		int a, b, c;
		int largest;
		scan = new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
//		if (a > b) {       //nested if
//			if (a > c) {
//				largest = a;
//			} else
//				largest = c;
//
//		} else if (b > c) {
//			largest = b;
//		} else {
//			largest = c;
//		}
		// *********************************shortest way************
		if (a > b && a > c) {
			largest = a;
		} else if (b > a && b > c) {
			largest = b;
		} else {
			largest = c;
		}

		System.out.println("The largest number is " + largest);
	}

}

package com.syntax.class08;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
//		Create a program that will be asking user to apply for a credit card 10 times. 
//		As soon you get an “yes” from a user program should stop asking.
		Scanner scan;
		String card;
		scan = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {

			System.out.println("Apply for a credit card? yes or no");
			card = scan.next();

			if (card.equals("yes")) {
				System.out.println("OK you can get a credit card");
				break;
			}

		}
	}

}

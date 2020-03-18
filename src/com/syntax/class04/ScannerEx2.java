package com.syntax.class04;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age? ");
		int age = input.nextInt();

		if (age >= 18) {
			System.out.println("You are elligible for licence");
		} else
			System.out.println("Got a learners permit");

		input.close();
	}

}

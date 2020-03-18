package com.syntax.class04;

import java.util.Scanner;

public class hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your work year..");
		int year = input.nextInt();
		System.out.println("Please enter your annual salary..");
		int salary = input.nextInt();

		if (year >= 5) {
			if (salary > 50000) {
				System.out.println("Bonus is 5000");
			} else
				System.out.println("Bonus is 3000");

		} else
			System.out.println("You are not elligiable for the bonus");
		input.close();

	}

}

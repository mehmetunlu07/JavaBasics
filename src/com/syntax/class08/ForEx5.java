package com.syntax.class08;

import java.util.Scanner;

public class ForEx5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		int total = 0;
		for (; number != -1;) { // different usage of for
			System.out.println("Enter a number. To stop enter -1");
			number = input.nextInt();
			if (number != -1) {
				total += number;
			}
		}

		System.out.println("The total is = " + total);

	}

}

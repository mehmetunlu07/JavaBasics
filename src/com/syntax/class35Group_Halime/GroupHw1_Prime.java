package com.syntax.class35Group_Halime;

import java.util.InputMismatchException;
//2.Write a java program to check whether a given number is prime or not?
//Prime numbers are only divisible by 1 and itself. Prime numbers are greater than 1.
// Prime numbers: 2,3,5,7,11,13,17,19,23,29...
import java.util.Scanner;

public class GroupHw1_Prime {

	public static void isPrime() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for prime test?");
		int num = 0;
		try {
			num = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(e);
			// e.printStackTrace();
		}
		scan.close();
		boolean isPrime = true;

		if (num > 1) {
			for (int i = 2; i < num; i++) {

				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}

		} else {
			System.out.println("Please enter a number greater than 1 ");
			
		}
		
		if (num > 1) {
			System.out.println(num + " is a prime number? " + isPrime);
		}
	}

	public static void main(String[] args) {
		isPrime();

	}

}

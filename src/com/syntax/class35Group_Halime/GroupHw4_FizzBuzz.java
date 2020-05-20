package com.syntax.class35Group_Halime;

// Print numbers Start to End,
//  When number is multiple of 3, print Fizz,
//  When number is multiple of 5, print Buzz,
//  When number is multiple of 3 and 5, print FizzBuzz,
public class GroupHw4_FizzBuzz {

	public static void fizzBuzz(int startNum, int endNum) {
		if (startNum <= 0 || endNum <= 0 || endNum < startNum) {
			System.out.println("Please enter valid parameters!");
		} else {
			for (int i = startNum; i <= endNum; i++) {
				if ( i%3 == 0 && i%5 == 0) {
					System.out.println("FizzBuzz ");
				} else if (i % 3 == 0) {
					System.out.println("Fizz ");
				} else if (i % 5 == 0) {
					System.out.println("Buzz ");
				} else {
					System.out.println(i + " ");
				}
			}
		}

	}

	public static void main(String[] args) {
		fizzBuzz(1, 35);
	}

}

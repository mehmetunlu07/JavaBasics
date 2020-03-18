package com.syntax.class08;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
//		Write a program that reads a range of integers (start and end point), 
//		provided by a user and then from that range prints the sum of the even and odd integers.

		int firstNum;
		int secondNum;
		int evenNum = 0;
		int oddNum = 0;
		int sum=0;
		Scanner scan;
		scan = new Scanner(System.in);

		System.out.println("Enter number for start point");
		firstNum = scan.nextInt();
		System.out.println("Enter number for end point");
		secondNum = scan.nextInt();
		
		for (int i = firstNum; i <= secondNum; i++) {
			if (i % 2 == 0) {
				evenNum = evenNum + i;
			} else {
				oddNum = oddNum + i;
			}
			sum = evenNum + oddNum;
			
		}
		System.out.println(sum);

	}

}

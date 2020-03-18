package com.syntax.class06;

import java.util.Scanner;

public class switchHw2 {

	public static void main(String[] args) {
//		Allow user to enter grade and then provide explanation: 
//		A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
//		At the end your program should print which grade was entered by a user with explanation.

		Scanner scan;
		char grade;
		String result;
		System.out.println("Enter your grade");
		scan = new Scanner(System.in);
		grade = scan.next().toUpperCase().charAt(0);
		
		switch (grade) {
		case 'A':
			result = "Excellent";
			break;
		case 'B':
			result = "Good";
			break;
		case 'C':
			result = "Average";
			break;
		case 'D':
			result = "Bad";
			break;
		default:
			result = "Unknown";
		}
		System.out.println("Your grade is " + grade + " and result is: " + result);

	}

}

package com.syntax.class06;

import java.util.Scanner;

public class rpl35 {

	public static void main(String[] args) {
		Scanner scan;
		boolean loan;
		int score;
		String eligibility;
		System.out.println("Do you need a loan?");
		scan = new Scanner(System.in);
		loan = scan.nextBoolean();
		if (loan) {
			System.out.println("What is your credit score?");
			score = scan.nextInt();
			if (score < 600) {
				eligibility = "Not eligible";
			} else if (score >= 600 && score <= 700) {
				eligibility = "Maybe eligible";
			} else if (score > 700 && score <= 800) {
				eligibility = "Eligible";
			} else {
				eligibility = "Definitely eligible";
			}
		} else {
			eligibility = "Unknown";
		}
		System.out.println("The eligibility is " + eligibility);

	}
}
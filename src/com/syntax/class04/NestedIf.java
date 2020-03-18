package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {

		boolean diploma = true;
		double gpaScore = 3.7;

		if (diploma) {
			System.out.println("Congratulations..");

			if (gpaScore >= 3.5) {
				System.out.println("You are elligiable for scholarship");

			} else
				System.out.println("You should have studied harder");

		} else {
			System.out.println("We suggest you should get a decree");

		}

	}

}

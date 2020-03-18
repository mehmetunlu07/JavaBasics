package com.syntax.class04;

public class NestedIf2 {

	public static void main(String[] args) {

		double mortgageRate = 4.4;
		int housePrice = 300000;

		if (mortgageRate > 4.5) {

			System.out.println("You will not buy a house");

		} else {

			if (housePrice > 200000) {
				System.out.println("Take a loan");

			} else
				System.out.println("Buy cash");

		}

	}

}

package com.syntax.class04;

import java.util.*;

public class hw1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Do you have a credit card? Please enter \"yes\" or \"no\"");
	//	boolean card = input.nextBoolean();
		String card = input.next();
		int balance;

		if (card.equalsIgnoreCase("yes")) {
			System.out.println("Well, enter your credit card balance");
			balance = input.nextInt();
			if (balance >= 1000) {
				System.out.println("Pay off immediately!");
			} else
				System.out.println("You can spend more..");

		} else
			System.out.println("You can apply for credit card");
		
		input.close();
	}

}

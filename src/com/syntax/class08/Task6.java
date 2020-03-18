package com.syntax.class08;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
//	Write a program to ask a user to enter item they want to buy and the price of that item. 
//	Every time user enters money accumulate the amount and tell the user how much is left to 
//	pay off the amount. If user give more money program should return a change. Whenever a user 
//	done with payments program should say “Thank you for shopping!”
//		

		Scanner scan;
		String item;
		double price;
		double money;
		double amount = 0.0;
		double remain;
		double change;

		scan = new Scanner(System.in);
		System.out.println("Enter the name of item?");
		item = scan.nextLine();
		System.out.println("Enter the price of item?");
		price = scan.nextDouble();

		do {
			System.out.println("How much will you pay?");
			money = scan.nextDouble();
			amount = amount + money;
			if (amount < price) {
				remain = price - amount;
				System.out.println("Pay more money: $" + remain);
			} else if (amount > price) {
				change = amount - price;
				System.out.println("Take your change: $" + change);
				break;
			}

		} while (amount != price);

		System.out.println("Thank you for your shopping!");

	}

}

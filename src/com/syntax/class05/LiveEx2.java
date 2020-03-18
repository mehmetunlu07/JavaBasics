package com.syntax.class05;

import java.util.Scanner;

public class LiveEx2 {

	public static void main(String[] args) {
		Scanner scan;		
		double price = 0;
		double discount = 0;
		double finalPrice = 0;
		
		scan = new Scanner(System.in);
		System.out.println("Is there a sale?");
		String sale =scan.nextLine();
		
		if (sale.equals("yes")) {
			System.out.println("Enter the price");
			price =scan.nextInt();
			
			if (price > 0 && price < 20) {
				discount = 0.1;
			} else if (price >= 20 && price < 100) {
				discount = 0.2;
			} else if (price >= 100 && price <= 500) {
				discount = 0.3;
			} else if (price > 500) {
				discount = 0.5;	
			} 
				finalPrice = price - (price * discount);
				System.out.println("After " + discount + " discount the price of the item is reduced from " + price + " to "+ finalPrice);

		} else {
			System.out.println("Not going shopping");
		}


		
	}

}

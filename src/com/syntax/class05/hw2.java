package com.syntax.class05;

import java.util.Scanner;

public class hw2 {

	public static void main(String[] args) {
//		Write a program for user to enter his/hers birth month. 
//		Based on the month define the season.
//		Example: if user is born in June, July or August → season =“Summer”.
//		At the end of the program we should see output as “You were born ______“.

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your birth month");
		String month = input.nextLine().toLowerCase();
		String season;
		
		if (month.equals("june") || month.equals("july") || month.equals("august")) {
			season = "Summer";
		} else if (month.equals("september") || month.equals("october") || month.equals("november")) {
			season = "Autumn";
		} else if (month.equals("december") || month.equals("january") || month.equals("february")) {
			season = "Winter";
		} else if (month.equals("march") || month.equals("april") || month.equals("may")) {
			season = "Spring";
		} else {
			season = " !You entered invalid month";
		}

		System.out.println("You were born " + season);

		input.close();
	}

}

package com.syntax.class11;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
//		Write a program that reads two people’s first names and if they expecting boy or girl?
//				Based on the input suggests a name for a baby:
//				Example Output:
//				Mom’s first name? Mary
//				Dad’s first name? Daniel
//				Boy or Girl? boy
//				Suggested baby name: DANRY
//
//				Example Output:
//				Mom’s first name? Mary
//				Dad’s first name? Daniel
//				Boy or Girl? girl
//				Suggested baby name: MAIEL

		Scanner scan = new Scanner(System.in);
		String dadName;
		String momName;
		String kid;
		String boyname, girlname;
		System.out.println("Mom's first name?");
		momName = scan.nextLine();
		System.out.println("Dad's first name?");
		dadName = scan.nextLine();
		System.out.println("boy or Girl?");
		kid = scan.nextLine();
		if (kid.equalsIgnoreCase("boy")) {
			boyname=dadName.substring(0, 3)+ momName.substring(momName.length() - 2);
			System.out.println(boyname.toUpperCase());

		} else if (kid.equalsIgnoreCase("girl")) {
			girlname=momName.substring(0, 2) + dadName.substring(dadName.length() - 3);
			System.out.println(girlname.toUpperCase());
		}

	}
}

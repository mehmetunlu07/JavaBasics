package com.syntax.class06;

import java.util.Scanner;

public class switchHw1 {

	public static void main(String[] args) {

//		Ask user to enter their country and capture it. 
//		Once values are captured print which language user speaks.
		Scanner scan;
		String country;
		String language;
		System.out.println("Enter your country");
		scan = new Scanner(System.in);
		country = scan.nextLine();
		switch (country.toLowerCase()) {
		case "usa":
			language = "english";
			break;
		case "turkey":
			language = "turkish";
			break;
		case "belgium":
			language = "french";
			break;
		case "germany":
			language = "german";
			break;
		default:
			language = "unknown";
		}
		System.out.println("You speak " + language);

	}

}

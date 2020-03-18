package com.syntax.class05;

import java.util.Scanner;

public class LogicalOpEx1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your height?");
		int height = input.nextInt();
		if (height>0 && height< 60) {
			System.out.println("short");
		} else if (height >= 60 && height <= 72) {
			System.out.println("medium");
		} else if (height > 72) {
			System.out.println("tall");
		}else
			
			System.out.println("invalid");
	}

}

//Prompt the user to enter person heights in inches. 
//Person should be classified as one of the following:
//short (under 60 inch)
//medium(between 60 -72 inch)
//tall (over 72 inch)
//
//
//Write a program that will print whether it is a weekend or weekday. 
//If any day from 1-5 → output “It is a weekday”, 
//anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”

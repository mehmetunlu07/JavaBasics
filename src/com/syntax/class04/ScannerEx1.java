package com.syntax.class04;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("what is the amount of loan? ");
		int a = input.nextInt();

		if (a < 200000) {
			System.out.println( "Lend the money");

		} else
			System.out.println("You are rejected");
		
		input.close();

	}

}

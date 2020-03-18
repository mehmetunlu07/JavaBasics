package com.syntax.class04;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your name");
		String name = scan.next();

		System.out.println("Enter your age");
		int age = scan.nextInt();

		System.out.println("Your name is " + name);
		System.out.println("Your age is " + age);
		scan.close();
	}

}

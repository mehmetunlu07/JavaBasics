package com.syntax.class11;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter user name:");
		String username = scan.nextLine();
		System.out.println("Please enter password:");
		String pass = scan.nextLine();
		String expectedPass = "Hello1234";

		if (!username.isEmpty() && !pass.isEmpty()) {
			if (pass.length() >= 8) {

				if (!pass.contains(username)) {

					if (pass.equals(expectedPass)) {
						System.out.println("Password confirmed, username and password are created");
					} else {
						System.out.println("Password is not correct!");
					}

				} else {
					System.out.println("Password can not contain username!");
				}

			} else {
				System.out.println("Password is too short..");
			}

		} else {
			System.out.println("Username and password can not be empty!");
		}

		System.out.println("****************** Complete check for username and password************************");

		if (!username.isEmpty() && !pass.isEmpty() && pass.length() >= 8 && !pass.contains(username)
				&& pass.equals(expectedPass)) {
			System.out.println("Password confirmed, username and password are created");
		} else {
			System.out.println("Your username or password incorrect or not compatiable!");
		}

	}

}

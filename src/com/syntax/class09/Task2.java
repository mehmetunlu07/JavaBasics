package com.syntax.class09;

public class Task2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int j = 1; j <= 10 - i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

	}

}

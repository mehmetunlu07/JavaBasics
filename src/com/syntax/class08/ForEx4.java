package com.syntax.class08;

import java.util.Scanner;

public class ForEx4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0, total = 0;

		for (; num != -1;) {
			System.out.println("Enter a positive num");
			num = scan.nextInt();

			if (num == -1) {
				break;
			}
			total += num;
		}
		System.out.println("total " + total);

	}

}

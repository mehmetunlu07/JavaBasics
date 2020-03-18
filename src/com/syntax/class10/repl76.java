package com.syntax.class10;

import java.util.Scanner;

public class repl76 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String days[] = new String[7];

		for (int i = 0; i < days.length; i++) {
			System.out.println("Please enter day " + (i + 1) + " of the week");
			days[i] = scan.nextLine();
		}

		for (int j = 0; j < 7; j++) {
			System.out.println(days[j]);
		}
		scan.close();
	}

}

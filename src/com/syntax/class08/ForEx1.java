package com.syntax.class08;

public class ForEx1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) { // Print 1 to 10 except numbers 5 and 6
			if (i == 5 || i == 6) {

				continue;
			}
			System.out.println(i);
		}

	}

}

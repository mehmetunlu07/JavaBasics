package com.syntax.class09;

public class NestedLoop2 {

	public static void main(String[] args) {
		                                              // to print car odometer
		for (int a = 0; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				for (int c = 0; c < 10; c++) {
					for (int d = 0; d < 10; d++) {
						System.out.println(a + "|" + b + "|" + c + "|" + d);
					}
				}
			}
		}

	}

}

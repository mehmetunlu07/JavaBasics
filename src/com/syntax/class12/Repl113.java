package com.syntax.class12;

public class Repl113 {
	int sumEvenToX(int x) {

		int sum = 0;

		for (int i = 1; i <= x; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Repl113 obj = new Repl113();

		System.out.println(obj.sumEvenToX(5));
		System.out.println(obj.sumEvenToX(8));

	}

}
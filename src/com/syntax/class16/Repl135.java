package com.syntax.class16;

public class Repl135 {
	public static void main(String[] args) {
		int[] arr = { 5, 12, -3, 7, 3, 22 };
		System.out.println(maxValue(arr)); // should print 22
	}

	static int maxValue(int[] array) {
		int max = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}

		return max;
	}

}

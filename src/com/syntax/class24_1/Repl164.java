package com.syntax.class24_1;

public class Repl164 {
	static final double avgElements(int[] arr) {
		double avg = 0;
		double sum = 0;
		for (int i : arr) {
			sum += i;
		}
		avg = sum / arr.length;
		return avg;
	}

	public static void main(String[] args) {
		int[] a = { 2, 7, 3, 8, 4 };
		System.out.println(avgElements(a)); // should print 4.8
	}
}
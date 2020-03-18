package com.syntax.class10;

public class ArrayEx2 {

	public static void main(String[] args) {
		int[] num = { 10, 20, 30, 40, 50, 60, 70 };
		int sum = 0;

		for (int i : num) { // advance for
			sum += i;
		}
		System.out.println(sum);

		System.out.println("*********Regular for*************");

		sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println(sum);
	}

}

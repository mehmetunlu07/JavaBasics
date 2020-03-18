package com.syntax.class11;

public class GroupHw3 {

	public static void main(String[] args) {

//3.Write a Java Program to print first 10 numbers of Fibonacci series. 
//The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... 
//The next number is found by adding up the two numbers before it.

		int fibNums[] = new int[10];
		fibNums[0] = 0;
		fibNums[1] = 1;

		for (int i = 2; i < 10; i++) {
			fibNums[i] = fibNums[i - 1] + fibNums[i - 2];
		}
		for (int j : fibNums) {
			System.out.print(j + " ");
		}

	}

}

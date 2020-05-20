package com.syntax.class35Group_Halime;
//3.Write a Java Program to print first 10 numbers of Fibonacci series. 
//The Fibonacci Sequence is the series of numbers: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ... 
//The next number is found by adding up the two numbers before it.

public class GroupHw2_Fibonacci {
	
	public static void fibonacciNums(int lastNum) {
		int fibNums[] = new int[lastNum];
		fibNums[0] = 1;
		fibNums[1] = 1;

		for (int i = 2; i <lastNum; i++) {
			fibNums[i] = fibNums[i - 1] + fibNums[i - 2];
		}
		
		for (int j : fibNums) {
			System.out.print(j + " ");
		}
		
	}

	public static void main(String[] args) {

		fibonacciNums(10);

		

	}

}

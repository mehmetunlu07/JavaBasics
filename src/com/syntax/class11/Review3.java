package com.syntax.class11;

public class Review3 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array? Maximum
		// and minimum number in the array?
		int[] arr = { 109, 20, 108, 90, 99, 111, 50, 6 };

		int maxNum = arr[0];
		int secondMaxNum = 0;
		int minNum = arr[0];

		for (int a : arr) {
			if (a > maxNum) {
				maxNum = a;
			} else if (a < minNum) {
				minNum = a;
			}
		}
	
		for (int a : arr) {
			if(a>secondMaxNum && a!=maxNum) {
				secondMaxNum=a;
			}
		}

		System.out.println("Max num of arr array is " + maxNum);
		System.out.println("Min num of arr array is " + minNum);
		System.out.println("Second largest num of arr array is " + secondMaxNum);

	}
}

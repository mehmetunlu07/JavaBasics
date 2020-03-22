package com.syntax.class12;

public class Q7withclasses {
	public static void largestCalculation(int[] a) {
		int largest = 0;
		int largest2 = 0;
		for (int i = 0; i < a.length; i++) {
			// check if it is bigger than the largest
			if (a[i] > largest) {
				largest = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest2 && a[i] != largest) {  // check if it is bigger than second largest
				largest2 = a[i];
			}
		}
		System.out.println("Largest number of array is "+largest);
		System.out.println("Second largest number of array is "+largest2);
	}


	public static void smallest(int[] a) {
		int smallest = a[0];
		for (int i = 0; i < a.length; i++) {
			int element = a[i];
			if (element < smallest) {
				smallest = element;
			}
		}
		System.out.println(smallest);
	}

	public static void main(String[] args) {
		int[] numbers2 = { 1000, 32, 61, 10, 990, 2, 89, 90, 74, 16, 950, 10, 95 };
		
		largestCalculation(numbers2);
		System.out.print("Smallest number of array is: ");
		smallest(numbers2);
	}
}

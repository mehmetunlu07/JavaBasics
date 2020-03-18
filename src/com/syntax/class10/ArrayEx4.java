package com.syntax.class10;

public class ArrayEx4 {

	public static void main(String[] args) {
		int nums[] = { 200, 3, -1, 800, 56, 786 };
		int max = 0;
		for (int i : nums) {
			if (i > max) {
				max = i;
			}
		}
		System.out.println("greatest number in array: " + max);

		System.out.println("**************** Regular if ***************");

		max = nums[0];

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println("greatest number in array: " + max);

	}

}

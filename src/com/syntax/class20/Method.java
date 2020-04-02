package com.syntax.class20;
//Complete static sum2D method by writing an accumulator algorithm that will calculate the sum of all the element in the 2D array passed as a parameter.

//You know how to do an accumulator algorithm with a 1-D array.  Now it's "loop through all the elements of the 2-D array" 
//instead of "loop through all the elements of the 1-D array".  You know how to loop through a 2-D array. 

public class Method {

	static int sum2D(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}
}
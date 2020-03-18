package com.syntax.class10;

public class AdvanceForLoop {

	public static void main(String[] args) {
		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };
		
		for (char i : grades) { // advance for loop
			System.out.print(i + " ");
		}

		System.out.println("");

		// regular for loop
		for (int i = 0; i < 6; i++) {
			System.out.print(grades[i] + " ");
		}

	}

}

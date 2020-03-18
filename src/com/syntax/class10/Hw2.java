package com.syntax.class10;

public class Hw2 {

	public static void main(String[] args) {
//		Create a 2D array that first row will contain 4 names and second row will contain grades. 
//		Then you program should print name of the students that has A and B grade

		String grades[][] = { { "Max", "Sue", "Nola", "Hans" }, { "A", "C", "B", "D" } };

		for (int i = 0; i < grades.length; i++) {
			for (int j = 0; j < grades[i].length; j++) {
				if (grades[i][j].equals("A") || grades[i][j].equals("B")) {
					System.out.println(grades[i - 1][j] + " " + grades[i][j]);

				}

			}

		}

	}

}

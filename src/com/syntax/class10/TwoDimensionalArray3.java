package com.syntax.class10;

public class TwoDimensionalArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] countries = { { "ABD", "Canada", "Mexica", "Guatemala" },
				{ "Venezuela", "Colombia", "Peru", "Arjantin", "Sili" }, { "Germany", "France", "Belgium", "Italy" } };

		System.out.println("**************** nested for-each loop***********************");
		int sum = 0;

		for (String[] arrays : countries) {
			for (String items : arrays) {
				System.out.print(items + " ");
				sum ++;
			}
			System.out.println();
		}
		System.out.println("The number of countries is " + sum);
	}

}

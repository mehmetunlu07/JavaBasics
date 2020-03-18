package com.syntax.class06;

import java.util.Scanner;

public class rpl36 {

	public static void main(String[] args) {
		Scanner scan;
		String word1, word2, output="";
		int int1, int2;
		scan = new Scanner(System.in);

		System.out.println("Please enter two strings");
		word1 = scan.nextLine().toLowerCase();
		word2 = scan.nextLine().toLowerCase();
		System.out.println("Please enter two numbers");
		int1 = scan.nextInt();
		int2 = scan.nextInt();

		if (int1 == int2 && word1.equals(word2)) {
			output = "AND";
		} else if (int1 == int2 || word1.equals(word2)) {
			output = "OR";
		} else if (int1 != int2 && !(word1.equals(word2))) {
			output = "NONE";
		} 

		System.out.println(output);

		scan.close();
	}

}
package com.syntax.class07;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		//we are playing lottery and lucky nyumber is 17;
        //we want to keep asking user any number from 1-20
        //until he guess the lucky number then output should be->congrats   
		Scanner scan;
		int num;
		int luckyNum = 17;
		scan = new Scanner(System.in);

		do {
			System.out.println("Enter a number 1 to 20:");
			num = scan.nextInt();
			
		} while (num != luckyNum);
		System.out.println("congratulations");

	}

}

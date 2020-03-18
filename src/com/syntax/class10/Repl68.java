package com.syntax.class10;

public class Repl68 {

	public static void main(String[] args) {
//Write a program to print out the pattern: 
// 
//$$$$         
//$  $
//$  $
//$$$$    // ***********Hoca if satirini daha paratik yazmis***************
//			if (i==1 || i==4 || j==1 || j==4) {
//				System.out.print("$");
//			} else {
//				System.out.print(" ");
//			}
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i == 2 && j == 2 || i == 2 && j == 3 || i == 3 && j == 2 || i == 3 && j == 3) {
					System.out.print(" ");
				} else {
					System.out.print("$");
				}

			}
			System.out.println("");

		}

	}

}

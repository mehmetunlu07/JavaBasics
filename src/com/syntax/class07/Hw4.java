package com.syntax.class07;

public class Hw4 {

	public static void main(String[] args) {
//		Print odd numbers between 20 and 50 (2 ways) 

		int i = 21;                    // 1.way odd numbers 20 to 50
		while (i <= 50) {
			System.out.print(i+ " ");
			i +=2;
		}
		System.out.println(" ");

		for (int a = 21; a < 50; a += 2) { // 2.way odd number 20 to 50
			System.out.print(a + " ");
		}

		System.out.println(" ");
		for (int a = 21; a < 50; a++) { // 3.way odd number 20 to 50
			System.out.print(a++ + " ");
		}
		
		System.out.println(" ");
		for (int a = 21; a < 50; a++) { // 4.way odd number 20 to 50
			if(a%2!=0) {
				System.out.print(a + " ");
			}
		}
		System.out.println(" ");
		for (int c = 20; c < 50; c++) { // 5.way odd number 20 to 50
			System.out.print(++c);  //c+=1
			System.out.print(" ");
		}
	}

}

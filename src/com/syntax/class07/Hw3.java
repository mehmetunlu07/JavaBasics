package com.syntax.class07;

public class Hw3 {

	public static void main(String[] args) {
//		Print even numbers from 20 to 1 (2 ways)
		System.out.println("***********1.way(while loop using if)*************************");
		int i = 20; 
		while (i > 0) {
			if (i % 2 == 0) {
				System.out.print(i+" ");
			}
			i--;
		}
		System.out.println(" ");
		System.out.println("***********2.way(for loop using mode)*************************");

		for (int a = 20; a > 0; a--) { 
			if (a % 2 == 0) {
				System.out.print(a+" ");
			}
		}
		System.out.println(" ");
		System.out.println("************3.way(for loop and -- increment)************************");

		for (int a = 20; a > 0; a--) { 
			System.out.print(a--+" ");
			//a--;
		}
		System.out.println(" ");
		System.out.println("************4.way(for loop -2 increment)************************");

		for (int a = 20; a > 0; a-=2) { 
			System.out.print(a+" ");
		}	

	}

}

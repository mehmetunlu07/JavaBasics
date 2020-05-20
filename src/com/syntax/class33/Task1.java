package com.syntax.class33;

import java.util.Scanner;
//1.How would handle InputMismatchException? Input Mismatch Exception when user enters mismatch value 
//then programmer expected.

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an integer:");
		
		try {
		int a=scan.nextInt();
		System.out.println(a);
		}catch(Exception e) {
			//e.printStackTrace();
			//System.out.println(e);
			System.out.println(e.getMessage());
			
		}
		System.out.println("----------------End of code------------------");

	}

}

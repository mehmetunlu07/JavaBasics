package com.syntax.class33;

import java.util.Scanner;

//1.How would handle InputMismatchException? Input Mismatch Exception when user enters mismatch value then programmer expected.
//2.Create a static method that will return a List of Exceptions.
// Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
// Call your method inside main and print name and details of all Exception objects.

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

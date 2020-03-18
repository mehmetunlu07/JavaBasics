package com.syntax.class04;

import java.util.Scanner;

public class ScannerEx3 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the city?");
		String city=input.nextLine();
		
		System.out.println("Enter the temperature?");
		float temp=input.nextFloat();
		temp=(temp-32)*5/9;
			
		System.out.println("The temperature in the city "+city+" is "+temp+" celcius");	
		
		input.close();
		
	}

}

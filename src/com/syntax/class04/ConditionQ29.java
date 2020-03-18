package com.syntax.class04;

import java.util.Scanner;

public class ConditionQ29 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	     System.out.println("Please enter first number");
	     int a=input.nextInt();
	     System.out.println("Please enter second number");
	     int b=input.nextInt();
	     int c=a*b;
	     if(c>0){
	      System.out.println("true");
	     }else
	      System.out.println("false");

	}

}

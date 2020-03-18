package com.syntax.class06;

import java.util.Scanner;

public class switchHw3 {

	public static void main(String[] args) {
//		Using scanner class create calculator. 
//		Allow user to enter 2 numbers and operator(+,-,*,/). 
//		Based on operator provide the result to user.
		Scanner scan;
		double firstNum;
		double secondNum;
		char operator;
		double result = 0;

		scan = new Scanner(System.in);
		System.out.println("Enter first number");
		firstNum = scan.nextDouble();
		System.out.println("Enter second number");
		secondNum = scan.nextDouble();
		System.out.println("Enter the operation sign that you want(+,-,*,/,%)");
		operator = scan.next().charAt(0);

		switch (operator) {
		case '+':
			result = firstNum + secondNum;
			break;
		case '-':
			result = firstNum - secondNum;
			break;
		case '*':
			result = firstNum * secondNum;
			break;
		case '/':
			result = firstNum / secondNum;
			break;
		case '%':
			result = firstNum % secondNum;
			break;			
		default:
			System.out.println("Please enter valid operator!");
		}
		System.out.println(firstNum + " " + operator + " " + secondNum + " = " + result);
		scan.close();
	}

}

package com.syntax.class12;

public class Task {
//1.Create a method that will take 2 parameters as a numbers and prints which number is larger.
//2.Create a method that will take a number and prints whether the number is even or odd.
//3.Create a method that will print whether given String is palindrome or not.
//4.Create a method that will say Hello in different language 
//  based on the country that will passed when method is executed. 

	int max (int a, int b) {
		int largest;
		if (a > b) {
			largest=a;
		} else {
			largest=b;
		}
		return largest;
	}

	void oddEven(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " is even");
		} else {
			System.out.println(a + " is odd");
		}
	}
	
	boolean isOdd(int a) {
		boolean flag;
		if(a%2!=0) {
			flag=true;
		}else {
			flag=false;
		}
		return flag;
	}

	void palindrome(String a) {
		String reverse = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			reverse += a.charAt(i);
		}
		if (reverse.equalsIgnoreCase(a)) {
			System.out.println(a + " is a palindrome");
		} else {
			System.out.println(a + " is NOT a palindrome");
		}

	}

	void hello(String country) {

		switch (country.toLowerCase()) {
		case "usa":
			System.out.println("Hello");
			break;
		case "turkey":
			System.out.println("Merhaba");
			break;
		case "mexico":
			System.out.println("hola");
			break;
		default:
			System.out.println("invalid");

		}

	}
}

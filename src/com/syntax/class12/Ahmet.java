package com.syntax.class12;

public class Ahmet {

	public static void main(String[] args) {
		largets(19, 18);
		evenORodd(17);
		palindrome("hannah");
		hello("adana");
		boolean x=isPrime(17);
		System.out.println("Is number prime? "+x);

	}

	private static boolean isPrime(int num) {
		boolean flag = true;
		if (num <= 1) {
			System.out.println("Invalid number");
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void hello(String lang) {
		if (lang.equalsIgnoreCase("USA") || lang.equalsIgnoreCase("New Zellan")) {
			System.out.println("Hello");
		} else if (lang.equalsIgnoreCase("Mongolia")) {
			System.out.println("Сайн уу");
		} else if (lang.equalsIgnoreCase("Adana")) {
			System.out.println("Nabuyon");
		} else if (lang.equalsIgnoreCase("Colombia") || lang.equalsIgnoreCase("Honduras")) {
			System.out.println("Hola");
		} else if (lang.equalsIgnoreCase("IraQ")) {
			System.out.println("Selam aleykum");
		} else {
			System.out.println("Please enter different country");
		}
	}

	public static void palindrome(String word) {
		String reverse = "";
		int length = word.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}
		if (word.equals(reverse)) {
			System.out.println("Given word is palindrome");
		} else {
			System.out.println("Given word is not palindrome");
		}
	}

	public static void evenORodd(int num1) {
		if (num1 % 2 == 0) {
			System.out.println("Your number " + num1 + " is an even number.");
		} else {
			System.out.println("Your number " + num1 + " is an odd number.");
		}
	}

	public static void largets(int num1, int num2) {
		if (num1 > num2) {
			System.out
					.println("Between number " + num1 + " and number " + num2 + " number " + num1 + " is the largest");
		} else {
			System.out.println("Between " + num1 + " and number " + num2 + " number " + num2 + " is the largest");
		}
	}
}
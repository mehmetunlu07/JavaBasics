package com.syntax.class30;

import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		List<Integer> primeNumbers = new LinkedList<>();
		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) {
				primeNumbers.add(i);
			}
		}

		System.out.println(primeNumbers);
	}

	public static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
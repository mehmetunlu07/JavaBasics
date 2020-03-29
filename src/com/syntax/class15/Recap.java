package com.syntax.class15;

public class Recap {

	protected int sumFromArray(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	
	public static String getReverse(String str) {
		String reverse="";
		for ( int i=str.length()-1; i>=0; i--) {
			reverse+=str.charAt(i);  // olleH
		}
		return reverse;
	}
	
	private static String getVowels(String str) {
		String vowels;
		vowels = str.replaceAll("[^aeiouAEIOU]","");   //eoa
		return vowels;
	}
	
	public static void main(String[] args) {
		Recap obj = new Recap();
		int[] array = { 2, 7, 19, 857 };
		System.out.println("sum: " + obj.sumFromArray(array));
		
		String str=Recap.getReverse("Hello");
		System.out.println(str);
		System.out.println(getReverse("Good"));
		
		String vowels=getVowels("Hello Syntax");
		System.out.println(vowels);
	}
}

package com.syntax.class11;

public class GroupHw5 {

	public static void main(String[] args) {
//		5.Write a java program to reverse String? Reverse a string word by word?

		System.out.println("---------------To reverse a string-----------------");

		String item = "I love java";
		for (int i = item.length() - 1; i >= 0; i--) {
			System.out.print(item.charAt(i));
		}

		System.out.println(" ");
		System.out.println("---------------Reverse a string word by word-----------------");

		String[] array = item.split(" ");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}

}

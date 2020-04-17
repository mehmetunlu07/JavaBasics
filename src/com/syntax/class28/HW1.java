package com.syntax.class28;

import java.util.ArrayList;

public class HW1 {

	public static void main(String[] args) {
		ArrayList<String> drinks = new ArrayList<>();
		drinks.add("water");
		drinks.add("milk");
		drinks.add("juice");
		drinks.add("tea");
		drinks.add("coffee");

		for (int i = 0; i < drinks.size(); i++) {
			if (drinks.get(i).contains("e") || drinks.get(i).contains("a")) {
				drinks.set(i, "water");
			}
		}
		System.out.println(drinks+" ");

	
	}
}

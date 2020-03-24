package com.syntax.class12;

public class Repl111 {
	String makeUpperCase(String word) {
		word=word.toUpperCase();
		return word;
	}

	public static void main(String[] args) {
		Repl111 obj = new Repl111();
		String a=obj.makeUpperCase("test");
		System.out.println(a);

	}

}
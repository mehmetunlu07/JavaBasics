package com.syntax.class11;

public class StringVerification1 {

	public static void main(String[] args) {
		String message="Welcome admin!";
		
		System.out.println("------------contains()--------------");
		System.out.println(message.contains("Welcome"));  // contain check if it contains or not
		boolean a=message.contains("admin");
		System.out.println(a);
		
		System.out.println("------------startsWith() endsWith()--------------");
		System.out.println(message.startsWith("Welcome"));
		System.out.println(message.endsWith("admin!"));
		
		boolean b=message.endsWith("Admin!");
		System.out.println(b);
	}

}

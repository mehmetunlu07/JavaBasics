package com.syntax.class02;

public class PracticeString {

	public static void main(String[] args)

	{
		// TODO Auto-generated method stub

		String a = "Hello", b = "  world";
		String c = "Ben \"okula\" gidiyorum";
		String d = "Ben \'okula\' gidiyorum";

		System.out.println(a.length() + "  " + a+ "  " + a.toLowerCase() + "  " + a.toUpperCase());

		System.out.println(a + b);
		System.out.println(a.concat(b));
		System.out.println(c);
		System.out.println(d);
		System.out.println(10 > 9);
		int h = 10;
		System.out.println(h != 10);

		int k = 15;
		String l = (k < 18) ? "Good day" : "Good evening";
		System.out.println(l);
	}

}

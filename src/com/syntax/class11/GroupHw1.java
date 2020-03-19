package com.syntax.class11;

public class GroupHw1 {

	public static void main(String[] args) {
//		1.Write a program to swap 2 numbers without a temporary variable? Swap  2 strings without a temporary variable?
		System.out.println("-----Swap 2 numbers without a temporary variable-----");
		int a=3;
		int b=5;
		a=a+b;  
		b=a-b;  
		a=a-b;  
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		System.out.println("-----Swap 2 strings without a temporary variable-----");
		
		String x="Syntax";
		String y="Technologies";
		x=x+y;   //SyntaxTech
		y=x.substring(0,x.length()-y.length()); 
		x=x.substring(y.length());
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		System.out.println("------another way---------------");
				String s1="Hello";
				String s2="Bye";

				String str = s1+s2;   //HelloBye
				s1 = str.replace(s1, "");
				s2 = str.replace(s2, "");

				System.out.println("The value of s1 = "+s1);
				System.out.println("The value of s2 = "+s2);
		
	}

}

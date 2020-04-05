package com.syntax.class22;

public class HW {

	public static int area(int a, int b) {
		int area = a * b;
		System.out.println("Area of Rectangle is equal to " + area);
		return area;
	}

	public static int area(int a) {
		int area = a * a;
		System.out.println("Area of Square is equal to " + area);
		return area;
	}

	public static int area(int a, int b, int c) {
		int area = a * b * c;
		System.out.println("Area of Box is equal to " + area);
		return area;
	}
}

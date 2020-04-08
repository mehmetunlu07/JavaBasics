package com.syntax.class23_1;

public class Parent {
	public void method() {
		System.out.println("I am a parent public method");
	}

	protected void method(int a) {
		System.out.println("I am a parent protected method");
	}

	void method(int a, int b) {
		System.out.println("I am a parent default method");
	}

	private void method(String a) {
		System.out.println("I am a parent private method");
	}
}

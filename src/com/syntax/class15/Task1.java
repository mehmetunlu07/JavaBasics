package com.syntax.class15;
//1.Write a program that will have a constructor: one with parameters and second without any parameters. 

//Create a separate Test class where you will execute both of the constructors.

public class Task1 {
	String s;

	Task1(String str) {
		s = str;
	}

	Task1() {
		System.out.println("non argument constructor");
	}

}

package com.syntax.class15;

public class ConstructorIntro {
	int a;

	//to create a constructor: 1. no return type (not even void)
	//							2. name must be same as class name
	ConstructorIntro(){
		System.out.println("I am a constructor");
	}
	
	public static void main(String[] args) {
		// creating an Object and calling a constructor
		ConstructorIntro obj=new ConstructorIntro();
		System.out.println(obj.a);
		System.out.println("Code after constructor");
		
		//calling method
		obj.hello();
	}
	
	void hello() {
		System.out.println("Hello Class");
	}
}
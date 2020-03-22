package com.syntax.class12;

public class MethodsTest {

	public static void main(String[] args) {
		
		Methods obj=new Methods();
		obj.sayWelcome();
		obj.sayAnything("Hello", 2);
		obj.sayAnything("Bye", 20);
		//obj.sayAnything(10, "Hi");CE
		
		obj.isItRaining(true);
		obj.isItRaining(false);
		
	}
}

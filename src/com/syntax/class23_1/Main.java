package com.syntax.class23_1;
//Parent class create 4 methods with different level of access modifiers. 

//In each method print "I am parent public/protected/default/private method".
//Override methods in child class
//In Main Class create object of the child class and see which methods are available

public class Main {
	public static void main(String[] args) {
		Child child = new Child();
		child.method();
		child.method(5);
		child.method(2,4);
		
		
	}

}
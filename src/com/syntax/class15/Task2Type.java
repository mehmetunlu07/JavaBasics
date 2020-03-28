package com.syntax.class15;

public class Task2Type {

	public static void main(String[] args) {
		Task2 obj1=new Task2();
		System.out.println(obj1.name+" "+ obj1.number);
		Task2 obj2=new Task2(5);
		Task2 obj3=new Task2("Haydar");
		//Task2 obj4=new Task2("bahadir", 13); private constructor not visible

	}

}

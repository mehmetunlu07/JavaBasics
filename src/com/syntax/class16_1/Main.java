package com.syntax.class16_1;

public class Main {
	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.name="Joe";
		obj.lastName="Smith";
		obj.age=35;
		obj.salary=35000;
		Student obj1 = new Student();
		obj1.name="Adam";
		obj1.lastName="Smith";
		obj1.age=15;
		obj1.grade=10;
		Retiree obj2 = new Retiree();
		obj2.name="Frank";
		obj2.lastName="Smith";
		obj2.seniorActivity=" 15 Tour";
		
		obj.print1();
		obj1.print2();
		obj2.print3();
	}

}
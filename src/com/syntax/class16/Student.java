package com.syntax.class16;
//1.Write program as a Student class   that has instance variables name and address. 
//Create a constructor that will initialize those variables. Print name & address of given  student using displayInfo method.

public class Student {

	String name, address;

	public Student(String name, String address) {
		this.name = name;
		this.address = address;
	}

	void displayInfo() {
		System.out.println("Name is " + name + " and adress is " + address);
	}

	public static void main(String[] args) {
		Student obj = new Student("Emel", "Cody Lane");
		obj.displayInfo();

	}

}

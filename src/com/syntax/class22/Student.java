package com.syntax.class22;
//Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent. 
//Define common behavior within parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Write example of achieving run time polymorphism
public class Student {
	String name;
	String studentID;
	Student(String name,String studentID){
		this.name=name;
		this.studentID=studentID;
	}
	
	void study() {
		System.out.println("Student study.");
	}
	void reading(){
		System.out.println("Student read.");
	}
}

class SyntaxStudent extends Student{
	SyntaxStudent(String name,String studentID){
		super(name,studentID);
	}
	@Override
	void study() {      //Overriding
		System.out.println("SyntaxStudent should study more");
	}
	void reading(int a){
		System.out.println("SyntaxStudent should read more");
	}
	
	
}

class CollegeStudent extends Student{
	CollegeStudent(String name,String studentID){
		super(name,studentID);
	}
	@Override
	void reading(){   //Overriding
		System.out.println("CollegeStudent must read a lot.");
	}
	
}

class SchoolStudent extends Student{
	SchoolStudent(String name,String studentID){
		super(name,studentID);
	}
	
}

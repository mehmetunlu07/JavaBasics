package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Student1 {

	public String name;
	private int studentID;

	public Student1(String name, int studentID) {
		this.name = name;
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

}

public class Task3 {
	public static void main(String[] args) {

		Set<Student1> students = new HashSet<>();

		students.add(new Student1("Samir", 101));
		students.add(new Student1("Karim", 102));
		students.add(new Student1("John", 103));
		students.add(new Student1("Jane", 104));
		students.add(new Student1("Khan", 105));
		students.add(new Student1("Tariq", 106));
		students.add(new Student1("Ahmed", 107));
		
		Iterator <Student1> student = students.iterator();
		
		while(student.hasNext()) {
			System.out.print(student.next().name+" ");
		}
	}
}

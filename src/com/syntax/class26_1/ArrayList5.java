package com.syntax.class26_1;
import java.util.*;
class Student {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

class ArrayList5 {
	public static void main(String args[]) {
		// Creating user-defined class objects
		Student s1 = new Student(101, "Sonoo", 23);
		Student s2 = new Student(102, "Ravi", 21);
		Student s3 = new Student(103, "Hanumat", 25);
		// creating arraylist
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);// adding Student class object
		list.add(s2);
		list.add(s3);
		// Getting Iterator
		Iterator itr = list.iterator();
		// traversing elements of ArrayList object
		while (itr.hasNext()) {
			//System.out.println(itr.next());
			Student st = (Student) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}
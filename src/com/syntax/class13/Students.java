package com.syntax.class13;

public class Students {
	
	//Create a Class called Students
	//Create three  variables studentName , studentID  and numberOfStudents
	//Create three objects of the Students Class 
	//Set the value for  studentName , studentID and increment  the numberOfStudents for each object
	//Print out  total number of students
	
	String studentName;
	int studentID;
	static int numberOfStudents;

	public static void main(String[] args) {
		Students obj1=new Students();
		obj1.studentName="Ali";
		obj1.studentID=1;
		numberOfStudents++;
		
		
		Students obj2=new Students();
		obj2.studentName="Max";
		obj2.studentID=2;
		numberOfStudents++;
		
		
		Students obj3=new Students();
		obj3.studentName="Nola";
		obj3.studentID=3;
		numberOfStudents++;
		
		System.out.println("Total number of students are "+numberOfStudents);

	}

}

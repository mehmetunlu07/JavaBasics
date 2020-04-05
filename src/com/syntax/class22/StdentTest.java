package com.syntax.class22;

public class StdentTest {

	public static void main(String[] args) {
		Student s=new Student("John","120");
		s.study();
		s.reading();
				
		SyntaxStudent t=new SyntaxStudent("Max","121");
		t.study();
		t.reading();
		
		CollegeStudent c=new CollegeStudent("Jully","141");
		c.study();
		c.reading();
		
		SchoolStudent sc=new SchoolStudent("Kelly","161");
		sc.study();
		sc.reading();
		
		System.out.println("----------------Polymorphism start here------------");
		
		Student s1=new SyntaxStudent("Neilly","200");
		s1.study(); 
		s1.reading();
		//s1.reading(2); CE
		
		Student s2=new CollegeStudent("Mell","145");
		s2.study();
		s2.reading();
		
		Student s3=new SchoolStudent("Kelly","165");
		s3.study();
		s3.reading();
		
		
	}

}

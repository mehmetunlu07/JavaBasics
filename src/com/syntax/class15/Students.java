package com.syntax.class15;
//2.Write a java program of Class Students that takes students name and 3 subject grades. 
//Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks. 
//Your program should print an average mark of each students name.
//NOTE: please use different names for instance and local variables.

public class Students {
	String name;
	int grade1, grade2, grade3;
	
	public Students(String nameStudent, int point1, int point2,int point3){
		name=nameStudent;
		grade1=point1;
		grade2=point2;
		grade3=point3;
	}
	void average() {
		int average;
		average=(grade1+grade2+grade3)/3;
		System.out.println("Name is:"+name+"   Average grade is: "+average);
	}

	public static void main(String[] args) {
		Students obj1=new Students("Emma", 60,70,80);
		Students obj2=new Students("Nola", 50,70,60);
		Students obj3=new Students("Yunus", 40,70,90);
		Students obj4=new Students("Yakup", 90,70,60);
		Students obj5=new Students("Levi", 80,70,50);
		obj1.average();
		obj2.average();
		obj3.average();
		obj4.average();
		obj5.average();
		
		

	}

}

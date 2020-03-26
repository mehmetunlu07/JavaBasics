package com.syntax.class13;

public class Employee {
//Create a Class called Employee:
//Create three  variables eID , salary and set the CEO to “Sumair” 
//Create two objects of the class Employee 
//Set the value of eID, salary for each of the objects
//Print out the eID , salary and  CEO for each of the objects 

	int eID;
	int salary;
	static String ceo="Sumair";

	public static void main(String[] args) {
		Employee obj1=new Employee();
		obj1.eID=1;
		obj1.salary=4000;
		
		Employee obj2=new Employee();
		obj2.eID=2;
		obj2.salary=5000;
		System.out.println("eID "+obj1.eID+" salary is "+obj1.salary+" and CEO is "+ceo);
		System.out.println("eID "+obj2.eID+" salary is "+obj2.salary+" and CEO is "+ceo);

	}

}

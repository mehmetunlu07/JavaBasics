package com.syntax.class16;

public class EmployeeType {
	public static void main(String[]args){
	     Employee obj=new Employee();
	     Employee obj1=new Employee("Joe","Smith",12345,"01/01/1970",35000);
	     
	     System.out.println(obj.name+" "+obj.lastName+" "+obj.employeeId+" "+obj.startDate+" "+obj.salary);
	     System.out.println(obj1.name+" "+obj1.lastName+" "+obj1.employeeId+" "+obj1.startDate+" "+obj1.salary);
	    
	    
	  }
		
	}